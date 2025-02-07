package org.example.flag.model.abstracts;

import org.example.file.FileWorker;
import org.example.file.impl.models.DoubleFile;
import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.example.file.impl.models.StringFile;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;
import org.example.flag.model.abstracts.impl.MyPrefixFlag;
import org.example.flag.model.abstracts.impl.PathFlagImpl;
import org.example.flag.model.abstracts.model.PathFlag;
import org.example.flag.model.abstracts.model.PrefixFlag;

// Класс предназначен для заполнения правильной конфигурации
// настраивая флаги из изначальных аргументов String[] args
public class AllFileWithParams {

    private final OpenFile openFile;
    private final FileWorker fileWorkerUtil;
    private String pathFrom;
    private final String[] args;
    private String pathForSavingFiles;
    private final PathFlag pathFlag;

    public AllFileWithParams(FileWorker fileWorkerUtil, String[] args) {
        if (args == null) {
            throw new RuntimeException("Невозможно запустить программу без аргументов!");
        }
        this.args = args;


        this.pathFlag = new PathFlagImpl(args);
        findPathForOpenedFile();
        //pathFlag != null
        this.fileWorkerUtil = fileWorkerUtil;
        openFile = new OpenFileImpl(pathFrom);
    }

    public void move() {
        findPathForSaving();
        // пока не сделан флаг для сохранения в другую папку первый аргумент ObjFile это ""
        ObjFile[] objFiles = new ObjFile[]{
                // пока не сделан флаг для сохранения в другую папку первый аргумент ObjFile это ""
                new IntFile(pathForSavingFiles, openFile),
                new DoubleFile(pathForSavingFiles, openFile),
                new StringFile(pathForSavingFiles, openFile)
        };
        PrefixFlag prefixFlag = new MyPrefixFlag(args, objFiles);
        System.out.println(prefixFlag.getArgs());
        for (ObjFile objFile : objFiles) {
            objFile.setName(prefixFlag.getArgs());
        }
        fileWorkerUtil.addFile(objFiles);
        fileWorkerUtil.createFile(true);
    }

    protected void findPathForOpenedFile() {
        for (int i = 0; i < args.length; ++i) {
            if (args[i].contains(".txt")) {
                if (i > 0 && !args[i - 1].equals(pathFlag.getFlag())) {
                    pathFrom = args[i];
                    return;
                } else if (i == 0) {
                    pathFrom = args[i];
                    return;
                }
            }
        }
        pathFrom = "";
    }

    protected void findPathForSaving() {
        pathForSavingFiles = pathFlag.getArgs();
    }
}

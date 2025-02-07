package org.example.flag.model.abstracts;

import lombok.Getter;
import org.example.file.FileWorker;
import org.example.file.FileWorkerUtil;
import org.example.file.impl.models.DoubleFile;
import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.example.file.impl.models.StringFile;
import org.example.file.model.abstracts.file.File;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;
import org.example.flag.model.abstracts.impl.MyPrefixFlag;
import org.example.flag.model.abstracts.model.PrefixFlag;

// Класс предназначен для заполнения правильной конфигурации
// настраивая флаги из изначальных аргументов String[] args
public class AllFileWithParams {

    private ObjFile[] objFiles;
    private final OpenFile openFile;
    private FileWorker fileWorkerUtil;
    private String pathFrom;
    private String[] args;

    public AllFileWithParams(FileWorker fileWorkerUtil, String[] args) {
        if (args == null){
            throw new RuntimeException("Невозможно запустить программу без аргументов!");
        }
        this.fileWorkerUtil = fileWorkerUtil;
        this.args = args;
        findPath();
        openFile = new OpenFileImpl(pathFrom);
    }

    public void move(){
        objFiles = new ObjFile[]{
                // пока не сделан флаг для сохранения в другую папку первый аргумент ObjFile это ""
                new IntFile("", openFile),
                new DoubleFile("", openFile),
                new StringFile("", openFile)
        };
        PrefixFlag prefixFlag = new MyPrefixFlag(args, objFiles);
        System.out.println(prefixFlag.getArgs());
        for (ObjFile objFile : objFiles) {
            objFile.setName(prefixFlag.getArgs());
        }
        fileWorkerUtil.addFile(objFiles);
        fileWorkerUtil.createFile(true);
    }

    protected void findPath() {
        for (String arg : args) {
            if (arg.contains("/") && !arg.contains(".txt")) {
                pathFrom = arg;
                return;
            }
        }
        pathFrom = "";
    }
}

package org.example.flags;

import lombok.Getter;
import org.example.file.ContentModel;
import org.example.file.ContentType;
import org.example.file.model.FileModel;
import org.example.util.CastListContentToStringFormat;
import org.example.util.FileSorter;

import java.io.IOException;
import java.nio.file.Paths;

@Getter
public class FlagsWorker {
    FileModel openedFile; // Переделать то же самое только с массивом
    FileModel intFile = new FileModel(ContentType.INT);
    FileModel doubleFile = new FileModel(ContentType.DOUBLE);
    FileModel stringFile = new FileModel(ContentType.STRING);


    public FlagsWorker(String openedFilePath) throws IOException {
        openedFile = new FileModel(
                Paths.get(openedFilePath)
        );
        openedFile.setContentType(ContentType.OPENED);
        getContentToStringForOpenedFile();
    }

    public FlagsWorker(String openedFilePath, String savePathForFiles) throws IOException {
        this(openedFilePath);
        openedFile.setSavePathForFiles(Paths.get(savePathForFiles));
    }

    private void getContentToStringForOpenedFile() throws IOException {
        if (openedFile != null) {

            for (ContentModel contentModel : FileSorter.sort(openedFile)) {
                switch (contentModel.getContentType()) {
                    case INT -> putContentToFileModel(contentModel, intFile);
                    case DOUBLE -> putContentToFileModel(contentModel, doubleFile);
                    case STRING -> putContentToFileModel(contentModel, stringFile);
                }
            }
        }
    }

    private static void putContentToFileModel(ContentModel contentModel, FileModel fileModel) {
        fileModel.setContentStringFromFile(CastListContentToStringFormat.getString(contentModel.getContentList()));
    }
}

package org.example.util;

import org.example.file.ContentModel;
import org.example.file.ContentType;
import org.example.file.FileModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileSorter {
    public static ContentModel[] sort(FileModel fileModel) throws IOException {
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        ArrayList<ContentModel> contentModel = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileModel.getFromPath().toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll(" ", "");
                if (line.isEmpty()) {
                    continue;
                }
                try {
                    integers.add(Integer.parseInt(line));
                } catch (NumberFormatException e1) {
                    try {
                        doubles.add(Double.parseDouble(line));
                    } catch (NumberFormatException e2) {
                        strings.add(line);
                    }
                }
            }
        }
        contentModel.add(new ContentModel(integers, ContentType.INT));
        contentModel.add(new ContentModel(doubles, ContentType.DOUBLE));
        contentModel.add(new ContentModel(strings, ContentType.STRING));

        return contentModel.toArray(new ContentModel[0]);
    }

}

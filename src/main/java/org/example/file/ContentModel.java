package org.example.file;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ContentModel {
    List<?> contentList;
    ContentType contentType;

}

package org.example.util;

import java.util.List;

public class CastListContentToStringFormat {

    public static String getString(List<?> listContent){
        StringBuilder answer = new StringBuilder();

        for (Object o : listContent) {
            answer.append(o.toString()+"\n");
        }
        return answer.toString();
    }
}

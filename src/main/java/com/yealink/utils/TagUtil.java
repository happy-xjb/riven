package com.yealink.utils;

import com.yealink.entities.Tag;

import java.util.List;

public class TagUtil {
    /**
     * 将List<Tag>转成字符串数组
     * @param list  传入List<Tag>
     * @return  包含所有Tag的value值的字符串数组
     */
    public static String[] tagListToStringArray(List<Tag> list){
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Tag tag = list.get(i);
            array[i] = tag.getValue();
        }
        return array;
    }
}

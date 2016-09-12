package com.hackerrank.code;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8Stream {
    public static void main(String[] args) {
        List<RRSSco> list = new ArrayList<RRSSco>();
        for (int p = 0; p < 2; p++) {
            for (int i = 1; i < 11; i++) {
                RRSSco sco = new RRSSco();
                if (i != 2) {
                    sco.setPageNumber(i);
                    list.add(sco);
                }
            }
        }

        Map<String, List<RRSSco>> pageScosMap = list.stream()
                                                     .filter(s -> excludeItemMetaData())   
                                                     .collect(groupingBy(s -> String.valueOf(s.getPageNumber())));
        System.out.println(pageScosMap.toString());
    }
    
    private static boolean excludeItemMetaData() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("excludeItem", "no");
        return map.get("excludeItem").equals("no");
    }
}
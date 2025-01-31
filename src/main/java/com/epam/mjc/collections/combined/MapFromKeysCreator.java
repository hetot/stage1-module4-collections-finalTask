package com.epam.mjc.collections.combined;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            if (!result.containsKey(entry.getKey().length()))
                result.put(entry.getKey().length(), new HashSet<>());
            result.get(entry.getKey().length()).add(entry.getKey());
        }
        return result;
    }
}

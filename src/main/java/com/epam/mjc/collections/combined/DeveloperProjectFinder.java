package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }
        Comparator<String> comparator = (var1, var2) -> (var1.length() > var2.length() ? -1
                : var1.length() < var2.length() ? 1
                : (-1) * var1.compareTo(var2));
        result.sort(comparator);
        return result;
    }
}

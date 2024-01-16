package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Destination {

    public static String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        if (paths.size() == 1)
            return paths.get(0).get(1);

        for (int i = 0; i < paths.size(); i++)
            map.put(paths.get(i).get(0), paths.get(i).get(1));

        List<String> cities = new ArrayList<>(map.keySet());
        Collections.sort(cities);
        System.out.println(cities);
        Set<String> visitedCities = new LinkedHashSet<>();
        String startPoint = cities.get(0);
        while (!visitedCities.contains(startPoint)) {
            visitedCities.add(startPoint);
            if (map.containsKey(startPoint))
                startPoint = map.get(startPoint);
            else
                continue;
        }
        return startPoint;
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<>(java.util.Arrays.asList("London", "New York")));
        paths.add(new ArrayList<>(java.util.Arrays.asList("New York", "Lima")));
        paths.add(new ArrayList<>(java.util.Arrays.asList("Lima", "Sao Paolo")));
        System.out.println(destCity(paths));
    }
}

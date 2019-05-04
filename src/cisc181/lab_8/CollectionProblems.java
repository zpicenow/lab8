package cisc181.lab_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class CollectionProblems {

    /**
     * Returns a new List that contains all of the Integers in the
     * given List that are less than zero
     */
    public static List<Integer> lessThanZero(List<Integer> l) {
        List<Integer> integers = new ArrayList<>();
        for (int i :
                l) {
            if (i < 0) {
                integers.add(i);
            }
        }
        return integers;
    }

    /**
     * Mutates the given List by removing all of the Integers in the
     * List that are less than zero
     */
    public static void removeLessThanZero(List<Integer> l) {
        ListIterator<Integer> iterator = l.listIterator();
        for (; iterator.hasNext();) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }
    }

    /**
     * Returns a new Set that contains all of the elements in a and
     * all of the elements in b (i.e. the union of two sets).
     */
    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> integers = new HashSet<>();
        integers.addAll(a);
        integers.addAll(b);
        return integers;
    }

    /**
     * Returns a new Set that contains all of the elements that are
     * in a and also in b (i.e. the intersection of two sets).
     */
    public static Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
        Set<Integer> integers = new HashSet<>();
        integers.addAll(a);
        integers.retainAll(b);
        return integers;
    }

    /**
     * Returns a new Set that contains all of the elements in a that
     * are not in b (i.e. the difference of a from b, or a subtract b).
     */
    public static Set<Integer> difference(Set<Integer> a, Set<Integer> b) {
        Set<Integer> integers = new HashSet<>();
        integers.addAll(a);
        integers.removeAll(b);
        return integers;
    }

    /**
     * Returns a new Map that contains a reverse mapping of the given map.
     * Thus each key in the given map will appear as a value in the result,
     * and each value in the given map will appear as a key in the result.
     * <p>
     * Because a Map contains a many to one mapping (i.e. two keys can map
     * to the same value), to properly return a reverse mapping each key
     * in the result could have multiple values. To represent this, each key
     * in the result has a Set as its mapped value where the Set contains
     * all of the multiple values.
     * <p>
     * See the test class for a concrete example.
     */
    public static Map<String, Set<String>> reverseMapping(Map<String, String> mapping) {
        Map<String, Set<String>> map = new HashMap<>();
        mapping.forEach((k, v) -> {
            if (map.get(v) != null) {
                map.get(v).add(k);
            } else {
                Set<String> strings = new HashSet<>();
                strings.add(k);
                map.put(v, strings);
            }


        });
        return map;

    }
}

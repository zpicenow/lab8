package cisc181.lab_8;

import org.junit.Test;

import static cisc181.lab_8.CollectionProblems.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionProblemsTest {

    @Test
    public void test_lessThanZero() {
        System.out.println("Testing lessThanZero");

        assertEquals(Arrays.asList(-1), lessThanZero(Arrays.asList(1, 0, -1)));
        assertEquals(Arrays.asList(-1, -5, -1), lessThanZero(Arrays.asList(-1, -5, -1)));
        assertEquals(Arrays.asList(), lessThanZero(Arrays.asList(0, 5, 10)));

    }


    @Test
    public void test_removeLessThanZero() {
        System.out.println("Testing removeLessThanZero");
        List<Integer> n1 = new ArrayList<Integer>(Arrays.asList(1, 0, -1));
        removeLessThanZero(n1);
        assertEquals(Arrays.asList(1, 0), n1);

        List<Integer> n2 = new ArrayList<Integer>(Arrays.asList(-1, -5, -8, -4, -3));
        removeLessThanZero(n2);
        assertEquals(Arrays.asList(), n2);

        List<Integer> n3 = new ArrayList<Integer>(Arrays.asList(0, 5, 10));
        removeLessThanZero(n3);
        assertEquals(Arrays.asList(0, 5, 10), n3);
    }

    @Test
    public void test_union() {
        System.out.println("Testing union");
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(5, 10, 15, 20));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 6, 9));

        assertEquals(new HashSet<Integer>(Arrays.asList(3, 5, 6, 10, 15, 9, 20)), union(set1, set2));
    }

    @Test
    public void test_intersection() {
        System.out.println("Testing intersection");
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(5, 10, 15, 20));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 6, 9));
        Set<Integer> set3 = new HashSet<Integer>(Arrays.asList(10, 20));

        assertEquals(new HashSet<Integer>(), intersection(set1, set2));
        assertEquals(new HashSet<Integer>(Arrays.asList(10, 20)), intersection(set1, set3));
    }

    @Test
    public void test_difference() {
        System.out.println("Testing difference");
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(5, 10, 15, 20));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 6, 9));
        Set<Integer> set3 = new HashSet<Integer>(Arrays.asList(10, 20));

        assertEquals(new HashSet<Integer>(Arrays.asList(5, 10, 15, 20)), difference(set1, set2));
        assertEquals(new HashSet<Integer>(Arrays.asList(5, 15)), difference(set1, set3));
    }

    @Test
    public void test_reverseMapping() {
        System.out.println("Testing mapping");
        Map<String, String> favoriteColors = new HashMap<String, String>();
        favoriteColors.put("Jacob", "Red");
        favoriteColors.put("Mason", "Blue");
        favoriteColors.put("Ethan", "Green");
        favoriteColors.put("Noah", "Purple");
        favoriteColors.put("William", "Red");
        favoriteColors.put("Sophia", "Red");
        favoriteColors.put("Emma", "Red");
        favoriteColors.put("Olivia", "Blue");
        favoriteColors.put("Isabella", "Green");
        favoriteColors.put("Ava", "Green");

        Map<String, Set<String>> inReverse = reverseMapping(favoriteColors);
        assertEquals(new HashSet<String>(Arrays.asList("Jacob", "William", "Sophia", "Emma")), inReverse.get("Red"));
        assertEquals(new HashSet<String>(Arrays.asList("Mason", "Olivia")), inReverse.get("Blue"));
        assertEquals(new HashSet<String>(Arrays.asList("Ethan", "Isabella", "Ava")), inReverse.get("Green"));
        assertEquals(new HashSet<String>(Arrays.asList("Noah")), inReverse.get("Purple"));
        assertFalse(inReverse.containsKey("Orange"));
        assertFalse(inReverse.containsKey("Yellow"));
    }

}

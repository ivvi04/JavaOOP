package ru.lakeevda.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkTest {

    @Test
    void testSumIsEmpty(){
        Homework homework = new Homework();
        List<Integer> items = new ArrayList<>();
        Assertions.assertEquals(homework.sum(items), 0);
    }

    @Test
    void testSumIsNotEmpty(){
        Homework homework = new Homework();
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals(homework.sum(items), 15);
    }

    @Test
    void testHasExactlyListOneItemAndEqual(){
        Homework homework = new Homework();
        List<String> items = new ArrayList<>(Arrays.asList("one"));
        Assertions.assertEquals(homework.hasExactly(items, "one"), true);
    }

    @Test
    void testHasExactlyListOneItemAndNotEqual(){
        Homework homework = new Homework();
        List<String> items = new ArrayList<>(Arrays.asList("one"));
        Assertions.assertEquals(homework.hasExactly(items, "two"), false);
    }

    @Test
    void testHasExactlyListManyItemsAndContains(){
        Homework homework = new Homework();
        List<String> items = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        Assertions.assertEquals(homework.hasExactly(items, "three"), true);
    }

    @Test
    void testHasExactlyListIsEmpty(){
        Homework homework = new Homework();
        List<String> items = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> homework.hasExactly(items, "three"));
    }

    @Test
    void testCopyListsIsNotEmpty(){
        Homework homework = new Homework();
        List<String> listOne = new ArrayList<>(Arrays.asList("four", "five", "six"));
        List<String> listTwo = new ArrayList<>(Arrays.asList("one", "two", "three"));
        homework.copy(listOne, listTwo);
        Assertions.assertTrue(listTwo.containsAll(listOne));
    }

    @Test
    void testCopyFirstIsEmptySecondIsNotEmpty(){
        Homework homework = new Homework();
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>(Arrays.asList("one", "two", "three"));
        homework.copy(listOne, listTwo);
        Assertions.assertTrue(listTwo.size() == 3);
    }

    @Test
    void testCopyFirstIsNotEmptySecondIsEmpty(){
        Homework homework = new Homework();
        List<String> listOne = new ArrayList<>(Arrays.asList("four", "five", "six"));
        List<String> listTwo = new ArrayList<>();
        homework.copy(listOne, listTwo);
        Assertions.assertTrue(listTwo.size() == 3);
    }

    @Test
    void testCopyFirstAndSecondIsEmpty(){
        Homework homework = new Homework();
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        homework.copy(listOne, listTwo);
        Assertions.assertTrue(listTwo.size() == 0);
    }

}

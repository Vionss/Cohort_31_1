import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class List11Test {
    private List11 list11;

    @BeforeEach
    public void init() {
        list11 = new List11();
    }

    @Test
    public void yesOrNoTestEmpty() {
        assertEquals(Arrays.asList(), list11.yesOrNo(Arrays.asList(), Arrays.asList()));
    }

    @Test
    public void yesOrNoTestOneElement() {

        List<String> expected = Arrays.asList("No");
        List<Integer> actual1 = Arrays.asList(1);
        List<Integer> actual2 = Arrays.asList(3);
        assertEquals(expected, list11.yesOrNo(actual1, actual2));
    }

    @Test
    public void yesOrNoTestSeveralElement() {

        List<String> expected = Arrays.asList("No", "Yes", "Yes", "No");
        List<Integer> actual1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> actual2 = Arrays.asList(7, 2, 3, 9);
        assertEquals(expected, list11.yesOrNo(actual1, actual2));
    }

    @Test
    public void withoutElementsEmpty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList();
        assertEquals(expected, list11.withoutEltsMoreThatNIterator(actual, 5));
    }

    @Test
    public void withoutElementsOneElt() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        assertEquals(expected, list11.withoutEltsMoreThatNIterator(actual, 5));
    }

    @Test
    public void withoutElementsNoSuchElemets() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(8);
        actual.add(7);
        assertEquals(expected, list11.withoutEltsMoreThatNIterator(actual, 0));
    }

    @Test
    public void withoutElementsSeveral() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(8);
        expected.add(7);

        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(3);
        actual.add(8);
        actual.add(7);
        actual.add(77);
        assertEquals(expected, list11.withoutEltsMoreThatNIterator(actual, 70));
    }
}
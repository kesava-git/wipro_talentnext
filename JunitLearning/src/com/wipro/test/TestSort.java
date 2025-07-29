package com.wipro.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {
        DailyTasks task = new DailyTasks();
        int[] input = {5, 3, 8, 1};
        int[] expected = {1, 3, 5, 8};
        assertArrayEquals(expected, task.sortValues(input));
    }
}

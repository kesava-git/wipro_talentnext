package com.wipro.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks task = new DailyTasks();
        String result = task.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}

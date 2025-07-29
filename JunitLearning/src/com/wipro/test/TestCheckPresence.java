package com.wipro.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {
        DailyTasks task = new DailyTasks();
        assertTrue(task.checkPresence("Welcome to Wipro", "Wipro"));
    }

    @Test
    public void testCheckPresenceFalse() {
        DailyTasks task = new DailyTasks();
        assertFalse(task.checkPresence("Hello World", "Wipro"));
    }
}

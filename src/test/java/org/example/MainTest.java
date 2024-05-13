package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest extends TestCase{

    @Test
    public void testAdded() {
        Main main = new Main();
        assertEquals(10,main.added(4,6));
        }
    }

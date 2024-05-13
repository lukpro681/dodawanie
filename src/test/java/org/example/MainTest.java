package org.example;

import junit.framework.TestCase;


public class MainTest extends TestCase{

    public void testAdded() {
        Main main = new Main();
        assertEquals(10,main.added(4,7));
        }
    }

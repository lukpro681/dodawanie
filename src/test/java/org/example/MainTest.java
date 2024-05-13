package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class MainTest extends TestCase{

    @Test
    public void testAdded() {
        Main main = new Main();
        assertEquals(10,main.added(4,7));
        }
    }

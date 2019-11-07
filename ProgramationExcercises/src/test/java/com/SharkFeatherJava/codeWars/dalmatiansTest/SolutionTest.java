package com.SharkFeatherJava.codeWars.dalmatiansTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.SharkFeather.codeWars.dalmatians.ZywOo;

public class SolutionTest {

    @Test
    public void basicTests() {
        assertEquals("More than a handful!",ZywOo.howManyDalmatians(26));
        assertEquals("Hardly any" ,ZywOo.howManyDalmatians(8));
        assertEquals("More than a handful!" ,ZywOo.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!" ,ZywOo.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!" ,ZywOo.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!" ,ZywOo.howManyDalmatians(101));
    }
}
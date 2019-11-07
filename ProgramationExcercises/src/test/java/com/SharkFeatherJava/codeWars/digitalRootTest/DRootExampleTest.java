package com.SharkFeatherJava.codeWars.digitalRootTest;

import org.junit.Test;

import com.SharkFeather.codeWars.digitalRoot.DRoot;

import static org.junit.Assert.assertEquals;

public class DRootExampleTest {
    @Test
    public void Tests() {
      assertEquals( "Nope!" , 7, DRoot.digital_root(16));
      assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
}
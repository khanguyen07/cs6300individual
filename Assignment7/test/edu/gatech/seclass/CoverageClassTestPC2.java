package edu.gatech.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CoverageClassTestPC2 {

    public CoverageClass myClass;

    @Before
    public void setUp() {
        myClass = new CoverageClass();
    }

    @Test
    public void testCoverageClassTestPC2() {
        myClass.coverageMethod2(0);
        myClass.coverageMethod2(1);
    }

    @After
    public void tearDown() {
        myClass = null;
    }

}

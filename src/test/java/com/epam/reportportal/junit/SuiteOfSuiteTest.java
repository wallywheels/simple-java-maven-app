package com.epam.reportportal.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SuiteTest.class})
public class SuiteOfSuiteTest {

    static {
        System.out.println("<init> SuiteOfSuiteTest");
    }
    
}

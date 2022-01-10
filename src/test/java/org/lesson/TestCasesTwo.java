package org.lesson;

import org.testng.annotations.*;

public class TestCasesTwo {

    @BeforeClass
    public void MyBeforeClass2() {
        System.out.println("This is my before class second");
    }

    @BeforeGroups
    public void MyBeforeGroups2() {
        System.out.println("This is my before groups second");
    }

    @BeforeMethod
    public void MyBeforeMethod2() {
        System.out.println("This is my before method second");
    }

    @Test(groups = "regression")
    public void MyFirstTest2() {
        System.out.println("This is my first test second");
    }

    @Test (groups = "smoke")
    public void MySecondTest2() {
        System.out.println("This is my second test second");
    }

    @Test(groups = "regression")
    public void MyThirdTest2() {
        System.out.println("This is my third test second");
    }

    @AfterMethod
    public void MyAfterMethod2() {
        System.out.println("This is my after method second" + "\n");
    }

    @BeforeGroups
    public void MyAfterGroups2() {
        System.out.println("This is my after groups second");
    }

    @AfterClass
    public void MyAfterClass2() {
        System.out.println("This is my after class second");
    }


}

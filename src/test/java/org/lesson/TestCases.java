package org.lesson;

import org.testng.annotations.*;

public class TestCases {

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {
        return new Object[][] { {10} , {100}, {110}  };
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is my before suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This is my before test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This is my before class");
    }

    @BeforeGroups("smoke")
    public void beforeGroups() {
        System.out.println("This is my before groups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is my before method");
    }

    @Test(groups = "regression", dataProvider = "provideNumbers")
    public void MyFirstTest(int param) {
        System.out.println("This is my first test " + param);
    }

    @Test (groups = "smoke")
    public void MySecondTest() {
        System.out.println("This is my second test");
    }

    @Test(groups = "regression")
    public void MyThirdTest() {
        System.out.println("This is my third test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is my after method" + "\n");
    }

    @AfterGroups("smoke")
    public void afterGroups() {
        System.out.println("This is my after groups");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This is my after class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This is my after test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This is my after suite");
    }


}

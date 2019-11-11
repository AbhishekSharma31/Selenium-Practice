package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
  @Test
  public void f1() {
	  System.out.println("Inside f1");
  }
  @Test
 public void f2() {
	  System.out.println("Inside f2");

  }
  
  @BeforeTest
  public void BeforeAnyTest() {
	  System.out.println("Before Any Test");

  }
  @AfterTest
 public void AfterAllTest() {
	  System.out.println("After All Test");

  }
  
  @BeforeMethod
  public void BeforeEveryMethod() {
	  System.out.println("Before Every Method");

  }
  @AfterMethod
 public void AfterEveryMethod() {
	  System.out.println("After Every Method");
 
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");

  }
  @AfterClass
 public void afterClass() {
	  System.out.println("After Class");

  }
  
  
  
}

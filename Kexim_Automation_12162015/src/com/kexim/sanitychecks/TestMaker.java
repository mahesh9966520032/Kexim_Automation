package com.kexim.sanitychecks;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestMaker {
  @Test
  public void f() {
	  
	  //for integrating suite files
	  TestNG testng=new TestNG();
	  
	  List<String> suites=new ArrayList();
	  //add suite files to arraylist
	  suites.add("admintestsuite.xml");
	  suites.add("branchestestsuite.xml");
	  //pass arraylist object to testng settestsuites method
	  testng.setTestSuites(suites);
	  System.out.println("************************");
	  System.out.println("TestNG Running");
	  System.out.println("************************");
	  testng.run();
	  
	  
	  
  }
}

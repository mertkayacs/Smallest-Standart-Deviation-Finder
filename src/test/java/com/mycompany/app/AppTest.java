package com.mycompany.app;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
public class AppTest extends TestCase{

  public void testStandartDeviationMethodMixCases(){

    ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
    ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(1,1,2,4,3));
    ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,6));
    String str = App.standartDeviation(input1, input2, input3, input4);
    assertTrue((str.equals("2nd list.Its standart deviation is : 0.0")));

  }

  public void testStandartDeviationMethodEqualCases(){

    ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
    ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
    ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
    ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
    String str = ""+App.standartDeviation(input1, input2, input3, input4);
    assertTrue((str.equals("All of the lists standart deviation is equal. : 0.0")));

  }

  public void testNullCase(){

    ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1));
    ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(1,1,2,4,3));
    ArrayList<Integer> input4 = null;
	String a = App.standartDeviation(input1, input2, input3, input4);
    assertTrue(a == null);

  }


}


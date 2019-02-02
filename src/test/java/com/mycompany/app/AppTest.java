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
    ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(5,5,5,5,5));
    String str = App.standartDeviation(input1, input2, input3, input4);
    assertTrue((str.equals("2nd list.Its standart deviation is : 1.0")));

  }
  public void testWithNull() {
    ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(1,1,2,4,1));
    ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(1,1,2,4,3));
    ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(5,5,5,5,5));
    String str = App.add(input1, input2, null, input4);
    assertTrue((str.equals("input4")));
  }
  public void testWithAllNull() {
    String str = App.add(null, null, null, null);
    assertTrue((str.equals("")));
  }
  public void testEqual() {
    ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
    ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
    ArrayList<Integer> input3 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
    ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(5));
    String str = App.add(input1, input2, input3, input4);
    assertTrue((str.equals("input1=input2=input3=input4")));
  }
  public void testSameArrayList() {
    ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
    String str = App.add(input1, input1, input1, input1);
    assertTrue((str.equals("input1=input2=input3=input4")));
  }
}

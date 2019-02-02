package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.Arrays; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App
{
    public static boolean search(ArrayList<Integer> array, int e) {
      System.out.println("inside search");
      if (array == null) return false;

      for (int elt : array) {
        if (elt == e) return true;
      }
      return false;
    }

	public static double stdev(ArrayList<Integer> array){

		if(array.size() == 0)
			return 999;

		double sum = 0;		

		for(int a : array)
			sum += a;

		System.out.println(sum);
		
		
		double mean = sum / array.size();
		System.out.println(mean);
		
		
		double[] diff = new double[array.size()]; 

		
		
		for(int i = 0 ; i < array.size() ; i++){

			diff[i] = Math.pow(mean - array.get(i),2);			

		}
		
		sum = 0;

		for(double a : diff)
			
			sum += a;

		sum = sum / (array.size()-1); 			
				
		double answer = Math.sqrt(sum);
			
		System.out.println();
		
		return answer;
		
		
	}


	
	public static String standartDeviation(ArrayList<Integer> array1 , ArrayList<Integer> array2 ,ArrayList<Integer> array3,ArrayList<Integer> array4 ){ 

	//gets 4 integer arrays and shows the order of standart deviation of each array

		if(array1 == null)
			return null;

		if(array2 == null)
			return null;

		if(array3 == null)
			return null;

		if(array4 == null)
			return null;

		
		double ans1 = stdev(array1);
	
		double ans2 = stdev(array2);

		double ans3 = stdev(array3);

		double ans4 = stdev(array4);

		double array[] = new double[4];
		array[0] = ans1;
		array[1] = ans2;
		array[2] = ans3;
		array[3] = ans4;

/*
		String starray[] = new starray[4];
		starray[0] = "array1" +array[0];
		starray[0] = "array2" +array[0];
		starray[0] = "array3" +array[0];
		starray[0] = "array4" +array[0];
*/

		double[] newarray = new double[4];

		newarray[0] = array[0];
		newarray[1] = array[1];
		newarray[2] = array[2];
		newarray[3] = array[3];
		
		Arrays.sort(array);


			if(array[0] == array[1]){
				if(array[1] == array[2]){
					if(array[2] == array[3]){
						return "All of the lists standart deviation is equal. : "+array[0];
					}
				}
			}
		
		

		if(array[0] == newarray[0]){
				
			return "1st list.Its standart deviation is : "+array[0];
	
		}else if(array[0] == newarray[1]){
				

			return "2nd list.Its standart deviation is : "+array[0];
	

		}else if(array[0] == newarray[2]){
				
			return "3rd list.Its standart deviation is : "+array[0];
	

		}else{

		
			
			return "4th list.Its standart deviation is : "+array[0];
	

		}
		
		
	
		

	}

	public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello World!");



        post("/compute", (req, res) -> {
          //System.out.println(req.queryParams("input1"));
          //System.out.println(req.queryParams("input2"));

          String input1 = req.queryParams("input1");
          java.util.Scanner sc1 = new java.util.Scanner(input1);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList1 = new java.util.ArrayList<>();
          while (sc1.hasNext())
          {
            int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
            inputList1.add(value);
          }
          System.out.println(inputList1);



          String input2 = req.queryParams("input2");
          java.util.Scanner sc2 = new java.util.Scanner(input2);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList2 = new java.util.ArrayList<>();
          while (sc2.hasNext())
          {
            int value = Integer.parseInt(sc2.next().replaceAll("\\s",""));
            inputList2.add(value);
          }
          System.out.println(inputList2);



          String input3 = req.queryParams("input3");
          java.util.Scanner sc3 = new java.util.Scanner(input3);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList3 = new java.util.ArrayList<>();
          while (sc3.hasNext())
          {
            int value = Integer.parseInt(sc3.next().replaceAll("\\s",""));
            inputList3.add(value);
          }
          System.out.println(inputList3);


          String input4 = req.queryParams("input4");
          java.util.Scanner sc4 = new java.util.Scanner(input4);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList4 = new java.util.ArrayList<>();
          while (sc4.hasNext())
          {
            int value = Integer.parseInt(sc4.next().replaceAll("\\s",""));
            inputList4.add(value);
          }
          System.out.println(inputList4);

/*
          String input2 = req.queryParams("input2").replaceAll("\\s","");
          int input2AsInt = Integer.parseInt(input2);
*/

		  //double sonucarray = standartDeviation(inputList1,inputList2,inputList3,inputList4);

         String result = "Smallest standart deviation is : " + standartDeviation(inputList1,inputList2,inputList3,inputList4);	  

         Map map = new HashMap();
          map.put("result", result);
          return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
            (rq, rs) -> {
              Map map = new HashMap();
              map.put("information", "Enter the lists for the minimum standart deviation");
              map.put("result", "Enter 4 lists of integers.");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}

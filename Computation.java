package com.Tutorial1;

import java.util.Scanner;

public class Computation {

    Scanner scanner = new Scanner(System.in);

    //method for user input of the marks
     public void input(int[] marks){

                 for (int i = 0; i < marks.length; i++) {
                    try {
                            System.out.print("pls enter the mark: ");
                            marks[i] = scanner.nextInt();
                        }
                    catch (Exception e) {
                        System.out.println(e + "\nNot a valid input");
                        scanner.nextLine(); //clear the Scanner input
                        i--;//decrease the counter when ever exception occurred,so that particular cycle won't be counted
                    }
                }

         for(int i =0;i<marks.length;i++){
             System.out.println("Mark "+(i+1)+ "= "+ marks[i]);

         }
         System.out.println("===================");
     }

     //method for checking grade
     public void checkGrade(int [] marks){
         int failCount = 0;
         int passCount = 0;
         int twoTwoCount = 0;
         int twoOneCount = 0;
         int firstCount = 0;
         for (int i = 0; i < marks.length; i++) {
             if(marks[i] < 40){
                 failCount++;
             }
             else if(marks[i] >= 40 && marks[i] <= 49){
                 passCount++;
             }
             else if(marks[i] >= 50 && marks[i] <= 59){
                 twoTwoCount++;
             }
             else if(marks[i] >= 60 && marks[i] <= 69){
                 twoOneCount++;
             }else {
                 firstCount++;
             }
         }
         System.out.println("Fail = "+ failCount);
         System.out.println("Pass = "+passCount);
         System.out.println("2:2 = "+twoTwoCount);
         System.out.println("2:1 = "+twoOneCount);
         System.out.println("First = "+firstCount);
         System.out.println("==================");
     }

     //method for average of those marks
     public double averageSixMarks(int [] marks){
         double average ;
         int total = 0;
         for (int i = 0; i < marks.length; i++) {
             total += marks[i];

         }
         return average = total/6.0;
     }

     // method to compute the maximum mark
    public int computeMaxMark(int [] marks){
         int tempsVariable = 0;
         for(int i=0;i<marks.length;i++){
             for (int j=i+1;j<marks.length;j++){
                 if(marks[i]>marks[j]){
                     tempsVariable = marks[i];
                     marks[i] = marks[j];
                     marks[j] = tempsVariable;

                 }
             }
         } System.out.println("================");
         return marks[ComputeAverageMarks.size-1];//returning the last index value of that mark array
    }

    // method to compute the minimum mark
    public int computeMinMark(int [] marks){
        int tempsVariable = 0;
        for(int i=0;i<marks.length;i++){
            for (int j=i+1;j<marks.length;j++){
                if(marks[i]>marks[j]){
                    tempsVariable = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempsVariable;

                }
            }
        } System.out.println("================");
        return marks[0];//returning the first index value of that array
    }

    // method to sort the array in ascending order
    public int[]  arrayInAscendingOrder(int [] marks){
        int tempsVariable = 0;
        for(int i=0;i<marks.length;i++){
            for (int j=i+1;j<marks.length;j++){
                if(marks[i]>marks[j]){
                    tempsVariable = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempsVariable;

                }
            }
        } System.out.println("================");
        return marks;//returning the array in ascending order
    }
}

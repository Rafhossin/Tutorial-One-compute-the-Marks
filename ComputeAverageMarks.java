package com.Tutorial1;

import java.util.Arrays;

public class ComputeAverageMarks {

    static int size = 6;

    public static void main(String[] args) {

        int marks[] = new int[size];

        Computation com = new Computation();

                com.input(marks);
                com.checkGrade(marks);

                double averageMark = com.averageSixMarks(marks);
                System.out.println("Average among the six mark: "+averageMark);

                int maxMark = com.computeMaxMark(marks);
                System.out.println("Maximum mark among all is : "+maxMark);

                int minMark = com.computeMinMark(marks);
                System.out.println("Minimum mark among all is : "+minMark);

                int []newMarks = com.arrayInAscendingOrder(marks);
                System.out.print("Array in ascending order = ");
                System.out.print(Arrays.toString(newMarks));

            }


}

package gen.com;

import java.util.Scanner;
public class GenericProgram
{

    public static void main(String[] args)
    {

        Integer[] a1 = {12, 7, 8};
        Float[] a2 = {1.2f, 7.4f, 8.1f};
        GenericProgram.testMax(a1);
        GenericProgram.testMaxFloat(a2);

    }
   static void testMax(Integer[] a1) {
       if (a1[0].compareTo(a1[1]) == 1) {
           if (a1[0].compareTo(a1[2]) == 1) {
               System.out.println("maximum number is :- " + a1[0]);
           } else if (a1[0].compareTo(a1[2]) == -1) {
               System.out.println("maximum number is :- " + a1[2]);
           }
       } else if (a1[0].compareTo(a1[1]) == -1) {
           if (a1[1].compareTo(a1[2]) == 1) {
               System.out.println("maximum number is :- " + a1[1]);
           } else if (a1[1].compareTo(a1[2]) == -1) {
               System.out.println("maximum number is :- " + a1[2]);
           }
       }
   }
            static void testMaxFloat(Float[] a2)
            {
                if (a2[0].compareTo(a2[1]) == 1)
                {
                    if (a2[0].compareTo(a2[2]) == 1)
                    {
                        System.out.println("maximum number is :- " + a2[0]);
                    } else if (a2[0].compareTo(a2[2]) == -1) {
                        System.out.println("maximum number is :- " + a2[2]);
                    }
                }
                else if (a2[0].compareTo(a2[1]) == -1)
                {
                    if (a2[1].compareTo(a2[2]) == 1)
                    {
                        System.out.println("maximum number is :- " + a2[1]);
                    }
                    else if (a2[1].compareTo(a2[2]) == -1)
                    {
                        System.out.println("maximum number is :- " + a2[2]);
                    }
                }
        }
    }


package gen.com;

import java.util.Scanner;
public class GenericProgram
{

    public static void main(String[] args)
    {

        Integer[] a1 = {12, 7, 8};
        GenericProgram.testMax(a1);
    }
   static void testMax(Integer[] a1)
        {
            if (a1[0].compareTo(a1[1]) == 1)
            {
                if (a1[0].compareTo(a1[2]) == 1)
                {
                    System.out.println("maximum number is :- " + a1[0]);
                } else if (a1[0].compareTo(a1[2]) == -1) {
                    System.out.println("maximum number is :- " + a1[2]);
                }
            }
            else if (a1[0].compareTo(a1[1]) == -1)
            {
                if (a1[1].compareTo(a1[2]) == 1)
                {
                    System.out.println("maximum number is :- " + a1[1]);
                }
                else if (a1[1].compareTo(a1[2]) == -1)
                {
                    System.out.println("maximum number is :- " + a1[2]);
                }
            }
        }
    }


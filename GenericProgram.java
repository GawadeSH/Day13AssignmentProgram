package gen.com;

public class GenericProgram<E extends Comparable <E> >
{


    public static <E extends Comparable > void testMax(E[] inputArray)
    {
        if (inputArray[0].compareTo(inputArray[1]) == 1)
        {
            if (inputArray[0].compareTo(inputArray[2]) == 1)
            {
                System.out.println("maximum number is :- " + inputArray[0]);
            }
            else if (inputArray[0].compareTo(inputArray[2]) == -1)
            {
                System.out.println("maximum number is :- " + inputArray[2]);
            }
        }
        else if (inputArray[0].compareTo(inputArray[1]) == -1 )
        {
            if (inputArray[1].compareTo(inputArray[2]) == 1)
            {
                System.out.println("maximum number is :- " + inputArray[1]);
            }
            else if (inputArray[1].compareTo(inputArray[2]) == -1)
            {
                System.out.println("maximum number is :- " + inputArray[2]);
            }
        }
    }
        public static void main(String[] args)
        {
            Integer[] a1 = {12, 7, 8};
            Float[] a2 = {1.2f, 7.4f, 8.1f};
            String[] a3={"Shital","Pratiksha","Greeshma"};
           GenericProgram.testMax(a1);
        GenericProgram.testMax(a2);
        GenericProgram.testMax(a3);

    }
    }

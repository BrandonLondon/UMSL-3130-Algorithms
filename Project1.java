import java.util.*;

public class Project1
{
    public static void main(String[] args)
    {
        Date time = new Date();
        Scanner data = new Scanner(System.in);
        int n;
        long iteration;
        do
        {
            System.out.println("Input a number that is greater than 0");
            n = data.nextInt();
        } while(n <= 0);
        if (n <= 1)
        {
            System.out.println("Your number is " + n);
        }
        else
        {
            //Start Recursion algorithm
            long startTimeRec = getTime();
            System.out.println("Your number using recursion " + recursiveFibb(n));
            long endTimeRec = getTime();

            long compareRecursive = endTimeRec - startTimeRec;
            System.out.println("Time for recursion: " + compareRecursive + "ms");

            //Start Iteration algorithm
            long startTimeIter = getTime();
            iterativeFibb(0, 1, n, 0);
            long endTimeIter = getTime();

            long compareIteration = endTimeIter - startTimeIter;
            System.out.println("Time for iteration: " + compareIteration + "ms");
        }

        int array1[] = new int[99];
        int array2[] = new int[99];

        array1[98] = 0;
        array2[98] = 1;

        //using an array to get Fibbonaci number with 100 digits
        System.out.println();
        fibbAdder(array1, array2);
        data.close();
    }

    static long getTime()
    {
        Date time = new Date();
        return time.getTime();
    }

    static void iterativeFibb(long a, long b, int n, int m)
    {
        if(m == n)
        {
            System.out.println("Your number using iteration: " + a);
        }

        else
        {
            a += b;
            m++;
            iterativeFibb(b, a, n, m);

        }
    }

    static long recursiveFibb(int n)
    {
        long f0 = 0;
        long f1 = 1;
        if (n <= 1)
        {
            return n;
        }

        else
        {
            return recursiveFibb(n-1) + recursiveFibb(n-2);
        }
    }

    static void fibbAdder(int[] a, int[] b)
    {
        for(int i = 98; i >= 0; i--)
        {
            a[i] += b[i];
            if(a[i] >9)
            {
                if(i == 0)
                {
                    System.out.println("Error: Largest number found with less than 100 digits");
                    output(b);
                    return;
                }
                a[i] -= 10;
                a[i-1] += 1;
            }
        }
        fibbAdder(b, a);
    }

    static void output(int[] b)
    {
        for(int i = 0; i <= 98; i++)
        {
            System.out.print(b[i]);
        }
    }
}
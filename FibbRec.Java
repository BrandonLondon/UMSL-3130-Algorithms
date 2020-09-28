/* Brandon London
09/28/20
Galina
*/
import java.util.*;
public class FibbRec
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
        }
    }
    static long getTime()
    {
        Date time = new Date();
        return time.getTime();
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
}

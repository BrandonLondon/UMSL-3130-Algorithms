/* Brandon London
09/28/20
Galina
*/
import java.util.*;

public class FibbIter
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
            //Start Iteration algorithm
            long startTimeIter = getTime();
            iterativeFibb(0, 1, n, 0);
            long endTimeIter = getTime();

            long compareIteration = endTimeIter - startTimeIter;
            System.out.println("Time for iteration: " + compareIteration + "ms");
        }
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
}
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

        For each integer, starting at 1 and ending at 999
        If it is divisible by 3 or divisible by 5,
        Add that number to the sum of all the other numbers divisible by 3 or 5 so far.
        Provide the sum (adding them all together) of all the numbers divisible by 3 or 5
 */

import java.util.ArrayList;

public class ProjectEuler1 {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList numbers = new ArrayList();
        for(int i=1; i<=999; i++)
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            } else {
                }
        System.out.println("The sum of all the natural numbers below 1,000 that are multiples of 3 or 5 is: " + sum);
            }
    }


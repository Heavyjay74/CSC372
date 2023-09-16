/*      Author:  Jason Smith
        Date:    16 Sep 2023
        Input: User inputs 5 digits
        Output: Prints out product of user's 5 digits
        */
package ct5;
import java.util.Locale;
import java.util.Scanner;

public class Product {

    public static void product(int[] inputArray, int i, int answer)  {
        answer *= inputArray[i ];
        i --;
        if (i < 0)  {
            System.out.println("The product of your numbers is " + answer + "!");
        }
        else  {
            product(inputArray, i, answer);
        }
    }
    public static int[] getArray()  {
        int[] userValues = new int[5];
        for (int i = 1; i < 6; i++)  {
            boolean isDigit = false;
            while (!isDigit) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Please enter digit number " + i + ":");
                    userValues[i - 1] = sc.nextInt();
                    isDigit = true;
                } catch (Exception e) {
                    System.out.println("Please enter only digits");
                }
            }
        }
        return userValues;
    }

    public static void main (String[] args)  {
        int[] myArray = getArray();
        int size = myArray.length - 1;
        product(myArray, size, 1);
    }
}

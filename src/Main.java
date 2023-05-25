import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <= 100; i++) {
            numbersList.add(i);
            expectedSum += i;
        }
        Random randomNumber = new Random();
        int x = randomNumber.nextInt(100);
        numbersList.remove(x);
        System.out.println("Chosen number is " + (x+=1) + ".");
        for (int i = 0; i < numbersList.size(); i++) {
            actualSum += numbersList.get(i);
        }
         System.out.println("ExpectedSum: " + expectedSum);
         System.out.println("ActualSum: " + actualSum);
         System.out.println("Missing number: " + (expectedSum-actualSum));

               }
    }

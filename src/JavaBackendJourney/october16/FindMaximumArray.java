package JavaBackendJourney.october16;

import java.util.Scanner;

public class FindMaximumArray {
    int findMaximum(int[] numbers) {
        int largest = numbers[0];
        for(int i=1;i<numbers.length;i++) {
            if(numbers[i]>largest) {
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        FindMaximumArray arr = new FindMaximumArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements ");
        int n = sc.nextInt();
       int[] numbers = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the "+i+"th place Element");
            numbers[i]=sc.nextInt();
        }
        int result = arr.findMaximum(numbers);
        System.out.println("The largest number in the Array is: "+result);
    }
}

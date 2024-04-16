import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user string");

        String userString = sc.nextLine();

        LongestSubstring substr = new LongestSubstring();
        int len = substr.findLength(userString);
        System.out.println(len);

        /*

        Uncomment to test the Coding Test 2

        SubArrayTargetSum subArr= new SubArrayTargetSum();
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];

        System.out.println(
                "Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        boolean output= subArr.findSubArrayWithTargetSum(arr,6);
        System.out.println(output);*/
    }
}
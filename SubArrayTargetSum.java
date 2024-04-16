import java.util.Arrays;

public class SubArrayTargetSum {
    boolean findSubArrayWithTargetSum(int[] str, int targetSum) {
        int currSum = 0;
        int[] index = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            currSum += str[i];
            index[i] = str[i];
            if (currSum == targetSum) {
                System.out.println("Continuous Sub array " + " = " + Arrays.toString(index) + " "
                        + "Target Sum " + targetSum);
                return true;
            }
        }
        return false;
    }
}

public class MethodTester {
    public static void main(String[] args) {

        int[] testArray = { -1, 12, -3, 14, -4, 3 };

        System.out.println(algorithm1(testArray));
    }

    public static int algorithm1(int[] A) {
        int maxSum = 0;

        for (int i = 0; i < A.length - 2; i++) {
            int sum = 0;
            sum = A[i] + A[i + 1] + A[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

}

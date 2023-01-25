public class RuntimeAnalyzer {
    public static void main(String[] args) {
        for (int arraySize = 5; arraySize <= 50; arraySize += 5) {
            int[] testArray = new int[arraySize];
            int totalAssignments = 0;
            for (int j = 0; j < 20; j++) { // total of 20 arrays
                for (int i = 0; i < arraySize; i++) {
                    testArray[i] = (int) (Math.random() * 100 - 11);
                    totalAssignments += algorithm1(testArray);
                }
            }
            System.out.println("Array Size: " + arraySize);
            System.out.println("Average number of assignments for this algorithm is: " + totalAssignments / 20);
        }

    }

    public static int algorithm1(int[] A) {

        int maxSum = 0;
        int assignments = 0;
        for (int i = 0; i < A.length - 2; i++) {
            int sum = 0;
            sum = A[i] + A[i + 1] + A[i + 2];

            if (sum > maxSum) {
                maxSum = sum;
                assignments++;
            }
        }
        return assignments;

    }
}

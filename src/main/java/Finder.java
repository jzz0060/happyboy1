public class Finder {

    public static java.lang.Integer findMin(int[] inputArray) {

        if (inputArray == null) {
            return null;
        } else if (inputArray.length <= 0) {
            return null;
        }
        int min = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }
        return min;
    }

    public static java.lang.Integer findMax(int[] inputArray) {

        if (inputArray == null) {
            return null;
        } else if (inputArray.length <= 0) {
            return null;
        }
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        return max;
    }
}
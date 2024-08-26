public class Mountain {
    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop; i++){
            if (!(array[i] < array[i+1])) return false;
        }
        return true;
    }
    public static boolean isDecreasing(int[] array, int start) {
        for (int i = start; i < array.length-1; i++){
            if (!(array[i] > array[i+1])) return false;
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        int answer = -1;
        for (int i = 1; i < array.length-1; i++){
            if (array[i-1]<array[i] && array[i]>array[i+1]) {
                answer = i;
                break;
            }

        }
        return answer;
    }

    public static boolean isMountain(int[] array) {
        int peak = Mountain.getPeakIndex(array);
        if (peak < 0) return false;
        return Mountain.isIncreasing(array, peak) && Mountain.isDecreasing(array, peak);
    }
}

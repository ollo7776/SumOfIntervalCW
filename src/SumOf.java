public class SumOf {

    public static int sumIntervals(int[][] intervals) {
        int sum = 0;
        int sumOfJ = 0;

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                sum += intervals[i][intervals[i].length-1]-intervals[i][j];
            }
        }


        return sum;
    }
}

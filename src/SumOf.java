import java.util.HashSet;

public class SumOf {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) {
            return 0;
        }
        int check = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length - 1; j++) {
                if (intervals[i][j] != intervals[i][intervals[i].length - 1]) {
                    check += 1;
                }
            }
        }
        if (check == 0) {
            return 0;
        }
        HashSet<Integer> intervalsList = new HashSet<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length - 1; j++) {
                while (intervals[i][j] < intervals[i][intervals[i].length - 1]) {
                    intervalsList.add(intervals[i][j]);
                    intervals[i][j] += 1;
                }
            }
        }
        //   for (Integer item : intervalsList) {
        // System.out.println("item: " + item);
        // }
        return intervalsList.size();
    }
}

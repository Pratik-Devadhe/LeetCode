class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {

        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int n = series1.length;
        int m = series2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {

            if (series1[i][0] < series2[j][0]) {

                int value = series1[i][1] + series2[j][1];

                if (!set.contains(series1[i][0])) {
                    list.add(new ArrayList<>(Arrays.asList(series1[i][0], value)));
                    set.add(series1[i][0]);
                }
                i++;

            } else {
                int value = series2[j][1] + series1[i][1];

                if (!set.contains(series2[j][0])) {
                    list.add(new ArrayList<>(Arrays.asList(series2[j][0], value)));
                    set.add(series2[j][0]);
                }
                j++;
            }
        }

        while (i < n) {

            if (!set.contains(series1[i][0])) {
                list.add(new ArrayList<>(Arrays.asList(series1[i][0], series1[i][1])));
                set.add(series1[i][0]);
            }
            
            i++;
        }

        while (j < m) {
            if (!set.contains(series2[j][0])) {
                    list.add(new ArrayList<>(Arrays.asList(series2[j][0], series2[j][1])));
                    set.add(series2[j][0]);
                }
            j++;
        }

        return list;
    }
}
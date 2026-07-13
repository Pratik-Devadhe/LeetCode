class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {

            for (int j = i + 1; j < s.length(); j++) {
                int num = Integer.parseInt(s.substring(i, j+1));

                if (low <= num && num <= high) {
                    list.add(num);
                }
            }
        }

        Collections.sort(list);

        return list;
    }
}
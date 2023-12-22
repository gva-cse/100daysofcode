class Solution {
    public int maxScore(String s) {
        String left;
        String right;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            left = s.substring(0, i + 1);
            right = s.substring(i + 1, s.length());
            int count = 0;

            for (int j = 0; j < left.length(); j++) {
                if (left.charAt(j) == '0') {
                    count++;
                }
            }
            for (int j = 0; j < right.length(); j++) {
                if (right.charAt(j) == '1') {
                    count++;
                }
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}

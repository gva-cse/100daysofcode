class Solution {
    public int numberOfBeams(String[] bank) {

        if (bank.length < 2) {
            return 0;
        }

        int num = 0;
        int solution = 0;
        int sum = 0;

        for (String row : bank) {
            sum = 0;
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    sum++;
                }
            }

            solution += sum * num;
            num = sum == 0 ? num : sum;
        }

        return solution;

    }

}

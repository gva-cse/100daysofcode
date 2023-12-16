import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray1[] = s.toCharArray();
        char tempArray2[] = t.toCharArray();
        
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);
        
        return Arrays.equals(tempArray1, tempArray2);
    }
}

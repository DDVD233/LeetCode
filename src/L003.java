import java.util.ArrayList;

class L003 {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> existingChars = new ArrayList<>();
        int length = 0;
        int longestLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (existingChars.contains(s.charAt(j))) {
                    longestLength = Math.max(length, longestLength);
                    length = 0;
                    existingChars.clear();
                    break;
                } else {
                    length++;
                    existingChars.add(s.charAt(j));
                }
            }
        }

        longestLength = Math.max(length, longestLength);
        return longestLength;
    }
}
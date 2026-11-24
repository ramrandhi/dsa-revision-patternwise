package sliding_window;

public class CharacterReplacement {

    void main() {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    public int characterReplacement(String s, int k) {
        int left = 0, right = left + 1;
        int charReplacemnetK = k, count = 0, result = 0;
        while (right < s.length()) {
            char current = s.charAt(left);
            while (charReplacemnetK != 0) {
                if (current == s.charAt(right)) {
                    count++;
                } else {
                    charReplacemnetK--;
                    count++;
                }
                right++;
            }
            left++;
            right = left + 1;
            result = Math.max(result, count);
            count = 0;
        }
        return result;
    }
}

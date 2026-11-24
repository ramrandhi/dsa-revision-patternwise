package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString3 {

    void main() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            result = Math.max(result, right-left + 1);
            right++;
        }
        return result;
    }
}

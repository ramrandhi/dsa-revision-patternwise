package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MinWindow76 {

    void main() {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length() || t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        int left = 0, right = 0;

        int required = need.size();
        int formed = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (need.containsKey(ch)
                    && window.get(ch).intValue() == need.get(ch).intValue()) {
                formed++;
            }
            while (formed == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar)
                        && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

}

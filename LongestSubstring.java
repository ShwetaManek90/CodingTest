import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    int findLength(String str) {
        if (str.length() == 0) return 0;
        if (str.length() == 1) return 1;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            Set<Character> chars = new HashSet<>();
            chars.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                Character b = str.charAt(j);
                if (chars.contains(b))
                    break;
                chars.add(b);
            }
            if (chars.size() > max)
                max = chars.size();
        }
        return max;
    }
}

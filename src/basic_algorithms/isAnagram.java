package basic_algorithms;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> table = new HashMap<>();

        int n = s.length();
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i<n; i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            
            if(table.get(ch) < 0) {
                return false;
            }
            
        }
        
        return true;
        
    }
    
}

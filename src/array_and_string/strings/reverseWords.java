package array_and_string.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class reverseWords {


    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        // Solv1
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

        // Solv2
        // List<String> wordList = Arrays.asList(words);
        // Collections.reverse(wordList);
        // return String.join(" ", wordList);

        // 比较这两种写法，Collections.reverse 操作的是底层的数组。
    }

    // "the sky is blue"
    // "blue is sky the"
    
}

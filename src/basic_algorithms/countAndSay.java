package basic_algorithms;

public class countAndSay {

    public String countAndSay(int n) {
        // 初始化第 1 项的结果
        String str = "1";

        // 从第 2 项开始逐层推导，直到第 n 项
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int start = 0; // 当前连续相同数字的起始下标
            int pos = 0;   // 向后探测的遍历指针

            while (pos < str.length()) {
                // 持续右移 pos，直到越界或遇到与 start 不同的字符
                while (pos < str.length() && str.charAt(pos) == str.charAt(start)) {
                    pos++;
                }
                // 拼接“出现次数 + 对应数字”（如 3 个 '2' 拼接为 "32"）
                sb.append(pos - start).append(str.charAt(start));
                // 更新起始下标，开始统计下一段连续数字
                start = pos;
            }

            // 将本轮生成的字符串作为下一轮的输入
            str = sb.toString();
        }

        return str;
    }
}
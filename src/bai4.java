import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> result = solution.wordBreak(s, wordDict);
        for (String sentence : result) {
            System.out.println(sentence);
        }
    }
}

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<Integer, List<String>> memo = new HashMap<>(); //khởi tạo memo lưu trữ các kết quả đã tính trước đó
        return wordBreakHelper(s, wordSet, 0, memo); //đệ quy
    }

    private List<String> wordBreakHelper(String s, Set<String> wordSet, int start, Map<Integer, List<String>> memo) {
        if (memo.containsKey(start)) {
            return memo.get(start); // nếu kết quả đã được tính trước đó, trả về kết quả từ memo
        }

        List<String> results = new ArrayList<>();
        if (start == s.length()) {
            results.add("");
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordSet.contains(word)) {
                List<String> sublist = wordBreakHelper(s, wordSet, end, memo);
                for (String sub : sublist) {
                    results.add(word + (sub.isEmpty() ? "" : " ") + sub);
                }
            }
        }

        memo.put(start, results);
        return results;
    }
}

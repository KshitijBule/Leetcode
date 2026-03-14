import java.util.*;

class Solution {

    private void generate(String s, int n, List<String> list) {
        if (s.length() == n) {
            list.add(s);
            return;
        }

        char[] chars = {'a', 'b', 'c'};

        for (char k : chars) {
            if (s.length() == 0 || s.charAt(s.length() - 1) != k) {
                generate(s + k, n, list);
            }
        }
    }

    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        generate("", n, list);

        if (k > list.size()) {
            return "";
        }

        return list.get(k - 1);
    }
}
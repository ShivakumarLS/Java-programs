package Strings;



public class BeautySubStrings {
    public static int getSubStringArray(String str) {

        // ArrayList<String> list = new ArrayList<>();
        // char ch = '0';
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        // for (int i = 0; i < str.length(); i++) {
        // String subStr = "";
        // for (int j = i; j < str.length(); j++) {
        // subStr += str.charAt(j);
        // list.add(subStr);
        // }
        // }
        // HashMap<Character, Integer> hm = new HashMap<>();
        // for (String i : list) {
        // for (int j = 0; j < i.length(); j++) {
        // ch = i.charAt(j);
        // hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        // }
        // for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
        // max = Math.max(max, entry.getValue());
        // min = Math.min(min, entry.getValue());
        // sum += max - min;
        // }
        // }

        // return sum;
        int n = str.length();
        if (n == 0 || n == 1)
            return n;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            for (int j = i; j < n; j++) {
                int min = n - i;
                int max = 0;
                arr[str.charAt(j) - 'a']++;
                for (int k = 0; k < 26; k++) {
                    if (arr[k] != 0) {
                        min = Math.min(arr[k], min);
                        max = Math.max(arr[k], max);
                    }
                }
                ans += max - min;
            }
            arr[str.charAt(i) - 'a']--;
        }
       return ans;
    }

    public static void main(String[] args) {
        String str = "aabcbaa";
        System.out.println(getSubStringArray(str));
    }
}

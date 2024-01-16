package Strings;

import java.util.Arrays;

public class Compress {
    public static int compress(char[] chars) {
        if (chars.length == 0 || chars.length == 1)
            return chars.length;
        StringBuilder sb = new StringBuilder();
        int cnt = 1, next = 1;
        char cur = chars[0];
        while (next < chars.length) {
            if (cur == chars[next]) {
                next++;
                cnt++;
                continue;
            } else {
                sb.append(cur);
                if (cnt > 1)
                    sb.append(cnt);
                if (next < chars.length)
                    cur = chars[next];
                cnt = 0;

            }
        }
        sb.append(cur);
        if (cnt > 1)
            sb.append(cnt);

        for (int i = 0; i < sb.length(); i++)
            chars[i] = sb.charAt(i);
        System.out.println(sb);
        System.out.println(Arrays.toString(chars));
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'z', '|', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
                'b' };

        System.out.println(compress(chars));

    }
}

package Strings;

import java.util.ArrayList;

import java.util.List;

public class DecodeWays {

    public class AllPossibleDecodings {

        public static void main(String[] args) {
            String encodedString = "121";
            List<String> allDecodings = findAllDecodings(encodedString);

            System.out.println("All Possible Decoded Values:");
            allDecodings.forEach(System.out::println);
        }

        public static List<String> findAllDecodings(String encodedString) {
            List<String> result = new ArrayList<>();
            char[] currentDecoding = new char[encodedString.length()];
            decodeHelper(encodedString, 0, currentDecoding, 0, result);
            return result;
        }

        private static void decodeHelper(String encodedString, int index, char[] currentDecoding, int currentIndex,
                List<String> result) {
            if (index == encodedString.length()) {
                result.add(new String(currentDecoding, 0, currentIndex));
                return;
            }

            // Single-digit decoding
            int singleDigit = encodedString.charAt(index) - '0';
            if (singleDigit != 0) {
                currentDecoding[currentIndex] = (char) ('A' + singleDigit - 1);
                decodeHelper(encodedString, index + 1, currentDecoding, currentIndex + 1, result);
            }

            // Two-digit decoding
            if (index + 1 < encodedString.length()) {
                int twoDigits = (encodedString.charAt(index) - '0') * 10 + (encodedString.charAt(index + 1) - '0');
                if (twoDigits >= 10 && twoDigits <= 26) {
                    currentDecoding[currentIndex] = (char) ('A' + twoDigits - 1);
                    decodeHelper(encodedString, index + 2, currentDecoding, currentIndex + 1, result);
                }
            }
        }
    }

}
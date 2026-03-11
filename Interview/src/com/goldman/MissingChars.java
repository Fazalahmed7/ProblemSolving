package com.goldman;

// Round 1
public class MissingChars {
    public static void main(String[] args) {
        System.out.println(missingChars("abc"));
    }


    public static String missingChars(String input) {
        StringBuilder output = new StringBuilder("");
        boolean[] dataSet = new boolean[26];
        char[] in = input.toCharArray();
        for (int i = 0; i < in.length; i++) {
            dataSet[in[i]-'a'] = true;
        }
        for (int i = 0; i < dataSet.length; i++) {
            if (!dataSet[i]) {
                char notPresentChar = (char) (i + 'a');
                output.append(notPresentChar);
            }
        }
        return output.toString();

    }
}

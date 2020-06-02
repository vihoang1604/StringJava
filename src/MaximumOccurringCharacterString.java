public class MaximumOccurringCharacterString {
    public static void Maximum(String str) {
        int[] freq = new int[str.length()];
        char maxChar = str.charAt(0);
        int max;
        char string[] = str.toCharArray();
        for (int i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        max = freq[0];
        for (int i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
    }
}

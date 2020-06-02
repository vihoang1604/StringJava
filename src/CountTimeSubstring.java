public class CountTimeSubstring {
    public static void CountTimeSubstringq(String subString, String keyWord) {
        int l = subString.length();
        String[] arrString = subString.split(" ");
        int ctr = 0;
        for (int i = 0; i < arrString.length; i++) {
            if (keyWord.contains(arrString[i]) == true)
                ctr++;
        }
         System.out.println("there are have life in String: e appears " + ctr + " times");
    }

}
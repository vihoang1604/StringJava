public class CountDuplicateString {
    static void CountDuplicate(String str) {
        String[] arrOfStr = str.split(" ");
        CheckString Obj[] = new CheckString[arrOfStr.length];
        for(int i = 0; i < arrOfStr.length; i++){
            Obj[i] = new CheckString(arrOfStr[i]);
        }
        for (int i = 0; i < arrOfStr.length; i++) {
            for (int j = i + 1; j < arrOfStr.length; j++) {
                if (arrOfStr[i].contains(arrOfStr[j]) == true) {
                    if (arrOfStr[i].length() < arrOfStr[j].length()) {
                        Obj[i].incre();
                    }
                    else {
                        Obj[j].incre();
                    }
                }
            }
        }
        for(int i = 0; i < arrOfStr.length; i++){
            if(Obj[i].dem > 0)
                System.out.println("word:"+Obj[i].word+" -duplicates times:"+Obj[i].dem);
        }
    }
    static class CheckString {
        int dem =0;
        String word = "";
        public CheckString(String word){
            this.word = word;
        }

        public void incre(){
            this.dem ++;
        }
    }
    }


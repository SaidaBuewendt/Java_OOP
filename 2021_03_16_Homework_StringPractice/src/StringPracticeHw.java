import sun.font.CreatedFontTracker;

public class StringPracticeHw {
    public static void main(String[] args) {
        System.out.println(getStrReverse("Mama"));
        System.out.println(getStrReverse("12345"));
        System.out.println(getStrReverse(""));

        System.out.println(getCountWords("Two beers or not two beers", "beer"));
        System.out.println(getCountWords("", ""));
        System.out.println(getCountWords("Two beers or not two beers", "vodka"));

    }

    public static StringBuilder getStrReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.isEmpty()) {
            System.out.println("String is empty");
        } else {
            sb.reverse();
        }
        return sb;
    }


    public static int getCountWords(String sent, String word) {
        int count = 0;
        if (sent.isEmpty() || word.isEmpty()) {
            return -1;
        } else
           for (int i = 0; i < sent.length() - word.length() + 1; i++) {
                if (sent.substring(i,i+word.length()).equals(word)) {
                    count++;
                }
            }
        return count;
    }

}

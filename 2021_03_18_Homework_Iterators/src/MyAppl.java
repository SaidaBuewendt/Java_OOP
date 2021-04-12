import java.util.Iterator;

public class MyAppl {

    public static void main(String[] args) {

        String str = "Hi, Berlin_14";
        MyString ms = new MyString(str);
        for(Character ch : ms) {
            System.out.print(ch+" ");
        }
        System.out.println();

        Iterator<Character> iterDesc = new MyIteratorDsc(ms.getChars());
        while(iterDesc.hasNext()) {
            System.out.print(iterDesc.next() + " ");
        }
        System.out.println();
    }

}
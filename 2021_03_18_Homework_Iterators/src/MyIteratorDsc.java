
import java.util.Iterator;

public class MyIteratorDsc implements Iterator<Character> {

    char[] chars;
    int position;

    public MyIteratorDsc(char[] chars) {
        this.chars = chars;
        position = chars.length - 1;
    }

    @Override
    public boolean hasNext() {
//		if(position>=0) return true;
//		return false;
        return position >= 0;
    }

    @Override
    public Character next() {
        return chars[position--];
    }

}


import java.util.Iterator;

public class MyIterator implements Iterator<Character> {

    char[] chars;
    int position;

    public MyIterator(char[] chars) {
        this.chars = chars;
        position = 0;
    }

    @Override
    public boolean hasNext() {
//		if(position<chars.length) return true;
//		return false;
        return position < chars.length;
    }

    @Override
    public Character next() {
        return chars[position++];
    }

}
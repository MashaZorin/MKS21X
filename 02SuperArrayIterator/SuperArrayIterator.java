import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    private SuperArray superArr;
    private int index;

    public SuperArrayIterator(SuperArray s){
	index = 0;
	superArr = s;
    }

    public boolean hasNext(){
	return superArr.size() > index + 1;
    }

    public String next(){
	index ++;
	return superArr.get(index - 1);
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}

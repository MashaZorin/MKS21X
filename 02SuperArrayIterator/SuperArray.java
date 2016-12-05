public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray(int max){
	if (max < 0){
	    throw new IllegalArgumentException();
	}
	size = 0;
	data = new String[max];
    }

    public SuperArray(){
	this(10);
    }

    public int size(){
	return size;
    }

    public String get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public void add(String n){
	if (size == data.length){
	    grow();
	}
	data[size] = n;
	size ++;
    }

    public void grow(){
	String[] doubled = new String[size * 2];
	for (int i = 0; i < size; i ++){
	    doubled[i] = data[i];
	}
	data = doubled;
    }

    public void growToMin(int min) {
	while (data.length < min){
	    grow();
	}
    }


    public String toString(){
	String str = "[";
	for (int i = 0; i < size - 1; i ++){
	    str = str + data[i] + ", ";
	}
	str = str + data[size - 1] + "]";
	return str;
    }

    public String toStringDebug(){
	String str = toString();
	str = str.substring(0, str.length() - 1); // get rid of bracket at end
	for (int i = size + 1; i < data.length; i ++){
	    str = str + ", _";
	}
	str = str + "]";
	return str;
    }

    public void clear(){
	size = 0;
    }
    public boolean isEmpty(){
	return size == 0;
    }

    public String set(int index, String element){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String old = data[index];
	data[index] = element;
	return old;
    }

    public void add(int index, String element){
	size ++;
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	if (size == data.length){
	    grow();
	}
	String[] added = new String[size];
	for (int i = 0; i < index; i ++){
	    added[i] = data[i];
	}
	added[index] = element;
	for (int i = index; i < size - 1; i ++){
	    added[i + 1] = data[i];
	}
	data = added;
    }

    public String remove(int index){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	String old = data[index];
	String[] removed = new String[data.length];
	for (int i = 0; i < index; i ++){
	    removed[i] = data[i];
	}
	for (int i = index; i < size - 1; i ++){
	    removed[i] = data[i + 1];
	}
	data = removed;
	return old;
    }


    public int indexOf(String n){
	int index = -1;
	for (int i = 0; i < size; i ++) {
	    if (data[i].equals(n)){
		index = i;
		i = size;
	    }
	}
	return index;
    }

    public int lastIndexOf(String n){
	int index = -1;
	for (int i = size - 1; i >= 0; i -= 1) {
	    if (data[i].equals(n)){
		index = i;
		i = 0;
	    }
	}
	return index;
    }

    public static void main(String[]args){
	SuperArray arr = new SuperArray();
	System.out.println(arr.size);
	arr.add("-1");
	System.out.println(arr.toStringDebug());
	for (int i = 0; i < 10; i++) {
	    arr.add(String.valueOf(i));
	}
	System.out.println(arr.toStringDebug());
	arr.add(2, "-10");
	System.out.println(arr.toStringDebug());
	arr.remove(2);
	System.out.println(arr.toStringDebug());

	arr.clear();
	System.out.println(arr.isEmpty());
	int a = 1;
	int b = 1;
	while (a <= 144) {
	    //fills array with first 12 fibonacci nums
	    arr.add(String.valueOf(a));
	    b += a;
	    a = b - a;
	}
	System.out.println(arr.toStringDebug());
	System.out.println(arr.indexOf("5") + " (should be 4)");
	System.out.println(arr.indexOf("1") + " (should be 0)");
	System.out.println(arr.indexOf("145") + " (should be -1)");
	System.out.println(arr.lastIndexOf("1") + " (should be 1)");
	arr.set(11, "1");
	System.out.println(arr.toStringDebug());
	System.out.println(arr.lastIndexOf("1") + " (should be 11)");


    }
	  
}




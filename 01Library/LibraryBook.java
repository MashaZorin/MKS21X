public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	super(a, t, i);
	callNumber = c;
    }

    public LibraryBook(){
	super();
	callNumber = "D56.C234 2002";
    }

    public String getCallNumber(){
	return callNumber;
    }

    public void setCallNumber(String c){
	callNumber = c;
    }
    
    public int compareTo(LibraryBook book){
	return callNumber.compareTo(book.getCallNumber());
    }

    public String toString(){
	return super.toString() + ", " + callNumber + ", " + circulationStatus();
    }

    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();

}
    

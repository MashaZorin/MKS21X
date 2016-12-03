public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String a, String t, String i, String c){
	super(a, t, i, c);
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public String getDueDate(){
	return dueDate;
    }

    public void setCurrentHolder(String patron){
	currentHolder = patron;
    }

    public void setDueDate(String date){
	dueDate = date;
    }

    public void checkout(String patron, String due){
	setCurrentHolder(patron);
	setDueDate(due);
    }

    public void returned(){
	setCurrentHolder(null);
	setDueDate(null);
    }

    public String circulationStatus(){
	if (currentHolder == null){
	    return "book available on shelves";
	}
	else{
	    return "Checked out by: " + currentHolder + ", Due: " + dueDate;
	}
    }

    public String toString(){
	if (currentHolder != null){
	    return super.toString() + ", " + currentHolder + ", " + dueDate;
	}
	else{
	    return super.toString();
	}
    }
}

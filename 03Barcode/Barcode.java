public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
	if (_zip.length() != 5){
	    throw new RuntimeException();
	}
	_zip = zip;
    }

    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){}


    // postcondition: computes and returns the check sum for _zip
    private static int checkSum(String zip){
	int checkDigit;
	for (int i = 0; i < 5; i ++){
	    checkDigit += Integer.parseInt(zip.charAt(i));
	}
	checkDigit % = 10;
	return checkDigit;
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
      
    }

    public static String toCode(String zip){
	String zipString = "";
	String check = zip + checkSum(zip);
	if (zip.length() != 5){
	    throw new IllegalArguementException();
	}
	for (int i = 0; i < check.length(); i ++){
	    if (check.charAt(i) == 0){
		zipString += "||:::";
	    }
	    else if (check.charAt(i) == 1){
		zipString += ":::||";
	    }
	    else if (check.charAt(i) == 2){
		zipString += "::|:|";
	    }
	    else if (check.charAt(i) == 3){
		zipString += "::||:";
	    }
	    else if (check.charAt(i) == 4){
		zipString += ":|::|";
	    }
	    else if (check.charAt(i) == 5){
		zipString += ":|:|:";
	    }
	    else if (check.charAt(i) == 6){
		zipString += ":||::";
	    }
	    else if (check.charAt(i) == 7){
		zipString += "|:::|";
	    }
	    else if (check.charAt(i) == 8){
		zipString += "|::|:";
	    }
	    else if (check.charAt(i) == 9){
		zipString += "|:|::";
	    }
	    else{
		throw new IllegalArguementException();
	    }
	}
	return zipString;
    }

    


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	this.compareTo(other);
    }
    
}

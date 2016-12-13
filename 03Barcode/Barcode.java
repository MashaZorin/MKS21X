public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    //     if zip is not the correct length or zip contains a non digit
    public Barcode(String zip) {
	if (zip.length() != 5){
	    throw new IllegalArgumentException("zip is not the correct length");
	}
	for( int i = 0; i < zip.length(); i++){
	    if (zip.charAt(i) < '0' || zip.charAt(i) > '9')
		throw new IllegalArgumentException("zip contains a non digit");
	}	
	_zip = zip;
	_checkDigit = checkSum(_zip);
    }

    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){
	return new Barcode(_zip);
    }


    // postcondition: computes and returns the check sum for zip
    private static int checkSum(String zip){
	int checkDigit = 0;
	for (int i = 0; i < zip.length(); i ++){
	    checkDigit += Integer.parseInt("" + zip.charAt(i));
	}
	checkDigit = checkDigit % 10;
	return checkDigit;
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    
    public String toString(){
	return _zip + checkSum(_zip) + " " + toCode(_zip);
    }

    public static String toCode(String zip){
	String zipString = "|";
	String check = zip + checkSum(zip);
	if (zip.length() != 5){
	    throw new IllegalArgumentException("zip is not the correct length");
	}
	for (int i = 0; i < check.length(); i ++){
	    if (check.charAt(i) == '0'){
		zipString += "||:::";
	    }
	    else if (check.charAt(i) == '1'){
		zipString += ":::||";
	    }
	    else if (check.charAt(i) == '2'){
		zipString += "::|:|";
	    }
	    else if (check.charAt(i) == '3'){
		zipString += "::||:";
	    }
	    else if (check.charAt(i) == '4'){
		zipString += ":|::|";
	    }
	    else if (check.charAt(i) == '5'){
		zipString += ":|:|:";
	    }
	    else if (check.charAt(i) == '6'){
		zipString += ":||::";
	    }
	    else if (check.charAt(i) == '7'){
		zipString += "|:::|";
	    }
	    else if (check.charAt(i) == '8'){
		zipString += "|::|:";
	    }
	    else if (check.charAt(i) == '9'){
		zipString += "|:|::";
	    }
	    else{
		throw new IllegalArgumentException("zip is not the correct length");
	    }
	}
	zipString += "|";
	return zipString;
    }

    public static String toZip(String code){
	String zip = "";
	if (code.length() != 32){
	    throw new IllegalArgumentException("Incorrect length");
	}
	if (code.charAt(0) != '|' || code.charAt(31) != '|'){
	    throw new IllegalArgumentException("Improper end bars");
	}
	for (int i = 1; i < 31; i +=5){
	    String subcode = code.substring(i, i + 5);

	    if ( subcode.equals("||:::")){
		zip += "0";
	    }
	    else if (subcode.equals(":::||")){
		zip += "1";
	    }
	    else if (subcode.equals("::|:|")){
		zip += "2";
	    }
	    else if (subcode.equals("::||:")){
		zip += "3";
	    }
	    else if (subcode.equals(":|::|")){
		zip += "4";
	    }
	    else if (subcode.equals(":|:|:")){
		zip += "5";
	    }
	    else if (subcode.equals(":||::")){
		zip += "6";
	    }
	    else if (subcode.equals("|:::|")){
		zip += "7";
	    }
	    else if (subcode.equals("|::|:")){
		zip += "8";
	    }
	    else if (subcode.equals("|:|::")){
		zip += "9";
	    }
	    else{
		throw new IllegalArgumentException("Invalid encoded ints or non barcode characters");
	    }
	}
	int checkDigit = Integer.parseInt("" + zip.charAt(5));
	zip = zip.substring(0, 5);
	if (checkSum(zip) != checkDigit){
	    throw new IllegalArgumentException("Invalid checksum");
	}
	return zip;
    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return (_zip+(char)_checkDigit).compareTo(other._zip+(char)_checkDigit);
    }

}


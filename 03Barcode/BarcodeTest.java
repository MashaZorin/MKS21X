public class BarcodeTest {

    public static void main(String[] args) {


	System.out.println("Testing Barcode constructor");
	boolean exception_caught = false; 
	try { 
	    Barcode bc = new Barcode("10012");    
	} catch(Exception e) {
	    System.out.println("error: Barcode constructor with correct threw an exception");
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("passed: Barcode constructor with correct input");

	exception_caught = false;	
	try { 
	    Barcode bc = new Barcode("1001");    
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: Barcode constructor with short input threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: Barcode constructor with short input failed to throw IllegalArgumentException!");

	exception_caught = false;	
	try { 
	    Barcode bc = new Barcode("100123");    
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: Barcode constructor with long input threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: Barcode constructor with long input failed to throw IllegalArgumentException!");
	
	exception_caught = false;	
	try { 
	    Barcode bc = new Barcode("1A023");    
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: Barcode constructor with invalid character threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: Barcode constructor with invalid character failed to throw IllegalArgumentException!");
	

	System.out.println("Testing toCode()");	

	exception_caught = false;	
	try { 
	    String code = Barcode.toCode("1001");    
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: toCode() with short input threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: toCode() with short input failed to throw IllegalArgumentException!");

	exception_caught = false;	
	try { 
	    String code = Barcode.toCode("100123");    
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: toCode() with long input threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: toCode() with long input failed to throw IllegalArgumentException!");
	
	exception_caught = false;	
	try { 
	    String code= Barcode.toCode("1A023");    
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: toCode() with invalid character threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: toCode() with invalid character failed to throw IllegalArgumentException!");
	
	
	System.out.println("Testing toString()");
	Barcode bc = new Barcode("08451"); 
	if(bc.toString().equals("084518 |||:::|::|::|::|:|:|::::|||::|:|"))
	    System.out.println("passed: toString equals to constructor argument + checDigit + code");       
	else {
	    System.out.println("error: "+ bc.toString());
	    System.out.println("error: toString() did not produce the correct output");
	}

	System.out.println("Testing toZip()");

	exception_caught = false;
	try { 
	    String zip = Barcode.toZip("|||:::|::|::|::|:|:|::::|||::|:|:");
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: toZip() with incorrect input length threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: toZip with incorrect input length failed to throw IllegalArgumentException!");

	exception_caught = false;
	try { 
	    String zip = Barcode.toZip("|||:::|::|::|::|:|:|::::|||::|:/");
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: toZip() with improper end bar threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: toZip with incorrect end bar failed to throw IllegalArgumentException!");
	
	exception_caught = false;
	try { 
	    String zip = Barcode.toZip("|||:::|::|::|::|:|:|::::|||:|::|");
	} catch(IllegalArgumentException e) {
	    System.out.println("passed: toZip() with incorrect checksum threw IllegalArgumentException");
	    System.out.println("message: "+e.getMessage());
	    exception_caught = true; 
	}
	if (!exception_caught)
	   System.out.println("error: toZip with incorrect checksum failed to throw IllegalArgumentException!");

	
	if(Barcode.toZip("|||:::|::|::|::|:|:|::::|||::|:|").equals("08451"))
	    System.out.println("passed: toZip() with correct input barcode returns correct zip");
	else {
	    System.out.println("error: "+ bc.toString());
	    System.out.println("error: toZip() did not produce the correct output");
	}	

    System.out.println("Testing compareTo()");
    
    Barcode bc1 = new Barcode("10012");
    Barcode bc2 = new Barcode("10013");
    Barcode bc3 = new Barcode("00012");
    Barcode bc4 = new Barcode("10012");

    if(bc1.compareTo(bc2) < 0)
	System.out.println("passed: comparison result negative for less");
    else
	System.out.println("failed: comparison result is not negative for less");

    if(bc1.compareTo(bc3) > 0)
	System.out.println("passed: comparison result positive for greater");
    else
	System.out.println("failed: comparison result is not positive for greater");

    if(bc1.compareTo(bc4) == 0)
	System.out.println("passed: comparison result 0 for equal");
    else
	System.out.println("failed: comparison result is not 0  for equal");    
    }
}

// public class Barcode implements Comparable<Barcode>{
// // instance variables
//    private String _zip;
//    private int _checkDigit;

// // constructors
// //precondtion: _zip.length() = 5 and zip contains only digits.
// //postcondition: throws a runtime exception zip is not the correct length
// //               or zip contains a non digit
// //               _zip and _checkDigit are initialized.
//   public Barcode(String zip) {
//       if (_zip.length() != 5){
// 	  throw new RuntimeException();
//       }
//       _zip = zip;
//       for (int i = 0; i < 5; i ++){
// 	  _checkDigit += Integer.parseInt(_zip.charAt(i));
//       }
//       _checkDigit % = 10;
//   }

// // postcondition: Creates a copy of a bar code.
//   public Barcode clone(){}


// // postcondition: computes and returns the check sum for _zip
//   private int checkSum(){
//       return _zip + _checkDigit;
//   }

// //postcondition: format zip + check digit + Barcode 
// //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
//   public String toString(){
      
//   }


// // postcondition: compares the zip + checkdigit, in numerical order. 
//   public int compareTo(Barcode other){}
    
// }

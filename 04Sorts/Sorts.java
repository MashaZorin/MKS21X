public class Sorts{
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static String name(){
	return "01.Zorin.Masha"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	for (int i = 0; i < data.length - 1; i ++){
	    int smallest = i;
	    for (int j = i; j < data.length; j ++){
		if (data[smallest] > data[j]){
		    smallest = j;
		}
	    }
	    if (smallest != 1){
		int placeholder = data[i];
		data[i] = data[smallest];
		data[smallest] = placeholder;
	    }
	}
    }

    public static void insertionSort(int[] data){
	for (int i = 1; i < data.length; i ++){
	    int value = data[i];
	    for (int shift = i - 1; shift >= 0; shift --){
		if (value < data[shift]){
		    data[shift + 1] = data[shift];
		    if (shift == 0){
			data[shift] = 0;
		    }
		}
		else{
		    data[shift + 1] = value;
		    shift = -1;
		}
	    }
	}
    }

    public static void printAry(int[] ary){
	String array = "[";
	for (int i = 0; i < ary.length - 1; i ++){
	    array = array + ary[i] + ", ";
	}
	array = array + ary[ary.length - 1] + "]";
	System.out.println(array);
    }

    public static void main(String[]args){
	int[] ary1 = {64,25,12,34,11};
	int[] ary2 = {0,1,0};
	int[] ary3 = {64,25,12,34,11};
	int[] ary4 = {0,1,0};
	
	printAry(ary1);
	selectionSort(ary1);
	printAry(ary1);

	System.out.println("\n");

	printAry(ary2);
	selectionSort(ary2);
	printAry(ary2);

	System.out.println("\n");

	printAry(ary3);
	insertionSort(ary3);
	printAry(ary3);

	System.out.println("\n");

	printAry(ary4);
	insertionSort(ary4);
	printAry(ary4);
    }

}

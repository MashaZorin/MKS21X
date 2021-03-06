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
			data[shift] = value;
		    }
		}
		else{
		    data[shift + 1] = value;
		    shift = -1;
		}
	    }
	}
    }


    public static void bubbleSort(int[] data){
	int numSwaps = data.length;
	int last = data.length - 1;
	while (numSwaps != 0){
	    numSwaps = 0;
	    for (int i = 0; i < last; i ++){
		if (data[i] > data[i + 1]){
		    int placeholder = data[i];
		    data[i] = data[i + 1];
		    data[i + 1] = placeholder;
		    numSwaps ++;
		}
	    }
	    last --;
	}
    }

}

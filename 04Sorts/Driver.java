public class Driver{
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
	int[] ary5 = {64,25,12,34,11};
	int[] ary6 = {0,1,0};
	
	printAry(ary1);
	Sorts.selectionSort(ary1);
	printAry(ary1);

	System.out.println("\n");

	printAry(ary2);
	Sorts.selectionSort(ary2);
	printAry(ary2);

	System.out.println("\n");

	printAry(ary3);
	Sorts.insertionSort(ary3);
	printAry(ary3);

	System.out.println("\n");

	printAry(ary4);
	Sorts.insertionSort(ary4);
	printAry(ary4);

	System.out.println("\n");

	printAry(ary5);
	Sorts.bubbleSort(ary5);
	printAry(ary5);

	System.out.println("\n");

	printAry(ary6);
	Sorts.bubbleSort(ary6);
	printAry(ary6);
    }
}

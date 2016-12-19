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
	long time1 = System.currentTimeMillis();
	Sorts.selectionSort(ary1);
	long time2 = System.currentTimeMillis();
	System.out.println(time1);
	System.out.println(time2);
	printAry(ary1);

	System.out.println(time1 - time2);

	System.out.println("\n");

	printAry(ary2);
	time1 = System.currentTimeMillis();
	Sorts.selectionSort(ary2);
	time2 = System.currentTimeMillis();
	printAry(ary2);

	System.out.println(time1 - time2);

	System.out.println("\n");

	printAry(ary3);
	time1 = System.currentTimeMillis();
	Sorts.insertionSort(ary3);
	time2 = System.currentTimeMillis();
	printAry(ary3);

	System.out.println(time1 - time2);

	System.out.println("\n");

	printAry(ary4);
	time1 = System.currentTimeMillis();
	Sorts.insertionSort(ary4);
	time2 = System.currentTimeMillis();
	printAry(ary4);

	System.out.println(time1 - time2);

	System.out.println("\n");

	printAry(ary5);
	time1 = System.currentTimeMillis();
	Sorts.bubbleSort(ary5);
	time2 = System.currentTimeMillis();
	printAry(ary5);

	System.out.println(time1 - time2);

	System.out.println("\n");

	printAry(ary6);
	time1 = System.currentTimeMillis();
	Sorts.bubbleSort(ary6);
	time2 = System.currentTimeMillis();
	printAry(ary6);

	System.out.println(time1 - time2);
    }
}

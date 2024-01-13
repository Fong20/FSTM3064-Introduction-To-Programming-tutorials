
public class Revision2Question3a {
	public static void main(String[] args) {
	//int total;
	//int[] SumOfArray = new int[6];
	//SumOfArray [0] = 10;
	//SumOfArray [1] = 20;
	//SumOfArray [2] = 30;
	//SumOfArray [3] = 40;
	//SumOfArray [4] = 50;
	//SumOfArray [5] = 60;

	//total = (SumOfArray [0] + SumOfArray [1] + SumOfArray [2] + SumOfArray [3] + SumOfArray [4] + SumOfArray [5]);
	//System.out.println("total of value of elements: " + total);
	
	//or
	
	int[] SumOfArray = new int []{10,20,30,40,50,60};
	int total=0,i;
	
	for(i = 0; i < SumOfArray.length; i++) {
	total += SumOfArray[i];
	}
	System.out.println("total of value of elements: " + total);

	//int value1 = 17/2;
	//System.out.println(value1);
	//int value2 = 19%(2+3);
	//System.out.println(value2);
	//int value3 = 3+4 * 20/3;
	//System.out.println(value3);
		
	
	}
}

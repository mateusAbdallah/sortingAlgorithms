import java.util.Scanner;

public class BubbleSort {

	public BubbleSort() {

		int[] numbersArray = null;
		Scanner input = new Scanner(System.in);

		System.out.print("How many numbers do you want to put into the list? ");
		int numb = input.nextInt();
		numbersArray = new int[numb];

		for(int a = 0; a < numbersArray.length; a++) {
			System.out.print("Enter number " + (a+1) + " >> ");
			numbersArray[a] = input.nextInt();
		}
		//System.out.println("***\s***\s***");
		//System.out.print("The initial array is: ");
		//for(int x: numbersArray) {

		//	System.out.print(x + " ");
		//}
		//System.out.println();
		displayIteration(numbersArray, 0);
		for(int i = 0; i < numbersArray.length - 1; i++) {
			for(int j = 0; j < numbersArray.length - 1; j++) {
				if(numbersArray[j] > numbersArray[j+1]) {
					int temp = numbersArray[j];
					numbersArray[j] = numbersArray[j+1];
					numbersArray[j+1] = temp;
				}
			}
			displayIteration(numbersArray, (i+1));
		}
		//System.out.println("***\s***\s***");
		//System.out.print("The sort array is: ");
		//for(int a : numbersArray) {
		//	System.out.print(a + " ");
		//} 

	}
	
	static void displayIteration(int[] arr, int x) {
		
		System.out.print("Iteration " + x + ": ");
		for(int c = 0; c < arr.length; c++) {
			System.out.print(arr[c] + " ");
		}
		System.out.println();
	}



}

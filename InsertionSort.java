import java.util.Scanner;

public class InsertionSort {
	
	public InsertionSort() {
		
		int[] arr = null;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to add into the array? >> ");
		int num = input.nextInt();
		arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter number " + (i+1) + " >> ");
			arr[i] = input.nextInt();					
		}
		
		
		//int arr[] = {21, 3, 11, 5, 53, 32};
		
		System.out.println("Before the insertion method");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n-----------");
		System.out.println("After insertion method");
		insertionSort(arr);
	
		for(int j:arr) {
			System.out.print(j + " ");
		}
	}
	
	static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}


public class BubbleSort {
	
	public BubbleSort() {

		int[] arr = {12, 1, 21, 11, 34, 41, 10, 3};

		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

	

}

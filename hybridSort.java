import java.util.*;

public class hybridSort {
	public static void main(String[] args) {
                //you can try with different arrays, of course

		int[] A = {9,7,8,6};
		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

		A = hybridSort(A);

		System.out.println("Array sorted: " + Arrays.toString(A));
		System.out.println();
	}

	public static int[] hybridSort(int[] A) {
		int n = A.length;
		boolean swap = true;
		while(swap) {
			swap = false;
			//bubble sort section
			for (int i = 0; i < n - 1; i++) {
//				for (int j = 0; j < n-i-1; j++) {
					if (A[i] > A[i+1]) {
						//comparison and swap
						int temp = A[i];
						A[i] = A[i+1];
						A[i+1] = temp;
						//outputs the first bubble sort step
						System.out.println("Bubble sort step:" + Arrays.toString(A));
						//selection sort section
						for(int j = 0; j<=n-2; j++) {
							int minimum = j;
							for(int k = j + 1;k < n-1; k++) {
								//checks if minimum is bigger than the current element to determine new minimum
								if(A[k] < A[minimum]) {
										minimum = k;
								}
							}
						//swaps minimum points
						temp = A[minimum];
						A[minimum]= A[j];
						A[j] = temp;
						System.out.println("Selection sort step:" + Arrays.toString(A));
						//breaks it so it doesnt continue after swap or no swap is done
						break;
								
							}
						//changes swap to true so that the process ends
						swap = true;
					}
					
				}
			}
	//returns finished sorted array
	return A;

	}
}

package datastructure;

public class Maxheapverıekleme {

	static void heapify(int arr[], int n, int i) {
		int parent = i - 1 / 2;
		if (arr[parent] > 0) {
			if (arr[i] > arr[parent]) {
				int temp = arr[i];
				arr[i] = arr[parent];
				arr[parent] = temp;
				heapify(arr, n, parent);

			}
		}

	}

	static int ınsertnode(int arr[], int n, int Key) {
		n = n + 1;
		arr[n - 1] = Key;
		heapify(arr, n, n - 1);
		return n;

	}

	static void printarray(int arr[], int i, int n) {
		for (int i1 = 0; i1 < n; i1++) {
			System.out.print(arr[i1] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 1000;
		int[] arr = new int[MAX];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 4;
		int n = 5;
		int Key = 15;

		n = ınsertnode(arr, n, Key);
		printarray(arr, n, Key);

	}

}

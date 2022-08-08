public static void main(String[] args) {

		int[] array = {3, 2, 56, 34, 23, 7, 0, -1, 23, 34};
	
		System.out.println("Unsorted : " + Arrays.toString(array));
		
		quickSort(array, 0 , array.length - 1);
		
		System.out.println("Sorted :" + Arrays.toString(array));
	}

	public static void quickSort(int[] array, int lowIndex, int highIndex) {
		
		if (lowIndex >= highIndex) {
			return;
		}
		
		int pivot = array[highIndex];
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		leftPointer = partition(array, highIndex, pivot, leftPointer, rightPointer);
  	    
	     	quickSort(array, lowIndex, leftPointer -1);
	     	quickSort(array, leftPointer + 1, highIndex);
	}

	private static int partition(int[] array, int highIndex, int pivot, int leftPointer, int rightPointer) {
		while (leftPointer < rightPointer) {
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(array, leftPointer, rightPointer);
		
		}
		   if(array[leftPointer] > array[highIndex]) {
			      swap(array, leftPointer, highIndex);
			    }
			    else {
			      leftPointer = highIndex;
			    }
	     	
		return leftPointer;
	}
	
	public static void swap(int[] array, int index1, int index2) {
		
	int temp = array[index1];
	array[index1] = array[index2];
	array[index2] = temp;
	
	}

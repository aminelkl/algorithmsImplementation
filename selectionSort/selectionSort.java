public static void main(String[] args) {
   
		int array[] = {20, 35, -15, 7, 55, 1, -22};
		
		for (int lastUnsortedIndex = array.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			
			int largest = 0; //index (not value)
			
			for (int i = 1 ; i <= lastUnsortedIndex ; i++) {
				if (array[i] > array[largest]) {
					largest = i;
				}
				swap(array, largest, lastUnsortedIndex);
			}
		}
		
		printArray(array);
		
	}
	
    public static void swap(int[] array, int i, int j) {
		
		if (i == j) {
			return;
		}
		
		int tempo = array[i];
		array[i] = array[j];
		array[j] = tempo;
	}
 
    public static void printArray(int[] array) {
    	for(int i = 0 ; i < array.length ; i++) {
    		System.out.println(array[i]);
    	}
    }

public static void main(String[] args) {

    // Sorting a unsorted arrays "O(n^2)"
		
	    int[] array = {21, 35, -15, 8, 57, 1, -22};
		
	    for (int lastUnsortedIndex = array.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
	    	for (int i = 0 ; i < lastUnsortedIndex ; i++) {
	    		if (array[i] > array[i + 1]) {
	    			swap(array, i, i+1);
	    		}
	    	}
	    }
	    
	    //print sorted arrays
	   for (int i = 0 ; i < array.length ; i++) {
		   System.out.println(array[i]);
	   }
	   
	}

	public static void swap(int[] array, int i, int j) {
		
		if (i == j) {
			return;
		}
		
		int tempo = array[i];
		array[i] = array[j];
		array[j] = tempo;
	}

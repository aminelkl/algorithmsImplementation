public static void main(String[] args) {

		int[] nums = new int[100];
		
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		
		mergeSort(nums);
		
		System.out.println("sorted Array : " + Arrays.toString(nums));
		
	}
	
	public static void mergeSort(int[] nums) {
		
		if (nums.length < 2) {
			return;
		}
		
		int midIndex = nums.length / 2;
		
		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[nums.length - midIndex];
		
		for (int i = 0 ; i < midIndex ; i++) {
			leftArray[i] = nums[i];
		}
		
		for (int i = midIndex ; i < nums.length ; i++) {
			rightArray[i - midIndex] = nums[i];
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(nums, leftArray, rightArray);
		
		
	}
	
	public static void merge(int[] nums, int[] leftHalf, int[] rightHalf) {
		
		int i = 0, j = 0, k = 0;
		
		while (i < leftHalf.length && j < rightHalf.length) {
			
			if (leftHalf[i] >= rightHalf[j]) {
				nums[k] = leftHalf[i];
				i++;
			}
			else {
				nums[k] = rightHalf[j];
						j++;
			}
			k++;
		}
		
		while (i < leftHalf.length) {
			nums[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while (j < rightHalf.length) {
			nums[k] = rightHalf[j];
			j++;
			k++;
		}
	}


#include <iostream>

void swap(int array[], int index1, int index2)
{
	int tempo = array[index1];

	array[index1] = array[index2];
	array[index2] = tempo;
}

void quickSort(int array[], int lowIndex, int highIndex)
{
	if (highIndex <= lowIndex)
	{
		return;
	}

	int pivotIndex = array[highIndex];

	int leftPointer = lowIndex;
	int rightPointer = highIndex;

	while (leftPointer < rightPointer)
	{
		while (array[leftPointer] <= pivotIndex && leftPointer < rightPointer)
		{
			leftPointer++;
		}

		while (array[rightPointer] >= pivotIndex && rightPointer > leftPointer)
		{
			rightPointer--;
		}

		swap(array, leftPointer, rightPointer);

	}

	swap(array, highIndex, leftPointer);

	quickSort(array, lowIndex, leftPointer - 1);
	quickSort(array, leftPointer + 1, highIndex);

}

int main()
{
	int array[] = { 3, 2, 56, 34, 23, 7, 0, -1, 23, 34 };
	int arraySize = sizeof(array) / sizeof(array[0]);

	std::cout << "Unsorted Array : ";
		for (int i = 0; i < arraySize; i++)
		{
			std::cout << array[i] << " ";
		}

	quickSort(array, 0, arraySize - 1);

	std::cout << "Sorted Array : ";
	for (int i = 0; i < arraySize; i++)
	{
		std::cout << array[i] << " ";
	}
}


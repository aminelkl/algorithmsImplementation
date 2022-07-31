#include <iostream>

void swap(int array[], int i, int j)
{
	int tempo = array[i];
	array[i] = array[j];
	array[j] = tempo;
}

int main()
{
	int array[] = { 20, 35, -15, 7, 55, 1, -22 };
    int arraySize = sizeof(array) / sizeof(array[0]);


	for (int lastUnsortedElement = arraySize - 1; lastUnsortedElement > 0; lastUnsortedElement--)
	{
		int largestIndex = 0;
		for (int i = 1; i <= lastUnsortedElement ; i++)
		{
			if (array[i] > array[largestIndex])
			{
				largestIndex = i;
			}
		}
		swap(array, largestIndex, lastUnsortedElement);
	}

	for (int i = 0; i < arraySize; i++)
	{
		std::cout << array[i] << std::endl;
	}
}


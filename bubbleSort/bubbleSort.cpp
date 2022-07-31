
#include <iostream>

void swap(int array[], int i, int j)
{
	int tempo = array[i];
	array[i] = array[j];
	array[j] = tempo;
}

int main()
{
	int array[] = { 5, 12, -6, -72, 45, 112 };
	int arraySize = sizeof(array) / sizeof(array[0]);

	for (int lastUnsortedIndex = arraySize - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
	{
		for (int i = 0; i < lastUnsortedIndex; i++)
		{
			if (array[i] > array[i + 1])
			{
				swap(array, i, i + 1);
			}
		}
	}

    // printing sorted array
	for (int i = 0; i < arraySize; i++)
	{
		std::cout << array[i] << std::endl ;
	}
}

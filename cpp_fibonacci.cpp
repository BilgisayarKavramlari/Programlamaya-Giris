#include <iostream>
#include <conio.h>
#include <vector>
using namespace std;

// This method returns a vector array of some fibonacci numbers.
vector<long> fibonacci(int limit)
{
	// Create a vector array of numbers.
	vector<long> numbers;

	for (int i = 0; i < limit; i++)
	{
		// For index 0 and 1, it is going to append 1 to the list.
		if (numbers.size() > 1)
		{
			// This variable is the sum of last 2 numbers.
			// For ex: 1 1 2 3 5, (3 + 5) next number is 8
			long count = 0;

			// Detection of the last 2 number.
			for (int x = i - 2; x < i; x++)
				count += numbers.at(x);

			// Appending new number to the list.
			numbers.push_back(count);
		}

		else numbers.push_back(1);
	}

	return numbers;
}

int main(void)
{
	// The limit variable does not mean last of fibonacci number.
	// It means how many numbers the algorithm finds.
	int limit;
	cout << "Enter a limit of fibonacci numbers: ";
	cin >> limit;

	// This loop prints all the numbers which algorithm found.
	// Here is might be a error, because of maximum of long.
	for (long number : fibonacci(limit))
		cout << number << endl;

	// This keeps console screen running until you click a key.
	_getch();
	return 0;
}

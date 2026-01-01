#include <stdio.h>

// Function to calculate the sum of an array using pointers
int getSum(int *arr, int size) { // or int getSum(int[] arr, int size) {
    int sum = 0;

    for (int i = 0; i < size; i++) {
        int arrElement = *arr;  // Get the value at the current pointer
        sum = sum + arrElement; // Add it to the sum
        arr++;                  // Move the pointer to the next element
    }

    return sum;
}

int main() {
    // Example array
    int numbers[] = {1, 2, 3, 4, 5};
    int size = sizeof(numbers) / sizeof(numbers[0]); //Size of total elements (20 bytes) / Size of one element (4 bytes) = 5

    // Call the getSum function
    int result = getSum(numbers, size);

    // Print the result
    printf("Sum: %d\n", result);

    return 0;
}

/*  Output:
    $ ./Pointer_in_function 
    Sum: 15
*/
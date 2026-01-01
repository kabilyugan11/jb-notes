// Allocated memory in heap then heap memory --> stack P 

#include <stdio.h>
#include <stdlib.h>

int* getArray(int size) {
    int* p = (int*) malloc(size * sizeof(int));
    int* temp = p;

    for (int i = 0; i < size; i++) {
        scanf("%d", temp);
        temp++;
    }

    return p;
}

int getSum(int *arr, int size) {
    int sum = 0;

    for (int i = 0; i < size; i++) {
        int arrElement = *arr;
        sum = sum + arrElement;
        arr++;
    }

    return sum;
}

int main() {
    int size;
    printf("Enter size: ");
    scanf("%d", &size);
    printf("Enter %d Integers by Space seprated : ",size);

    int* p = getArray(size);
    printf("p = %d\n", p);
    printf("*p = %d\n", *p);
    printf("&p = %d\n", &p);

    int sum = getSum(p, size);
    printf("Sum = %d\n", sum);

    free(p);
    return 0;
}

/*  Output:
$ ./Pointer_Heap_inFunction 
    Enter size: 4
    Enter 4 Integers by Space seprated : 10 10 10 10
    p = -490112320
    *p = 10
    &p = -1854870944
    Sum = 40
*/
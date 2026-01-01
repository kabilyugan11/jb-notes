#include <stdio.h>

void swap(int *L, int *P) { // it recives address of x and y & it stores address in L and P
    int temp;
    temp = *L;  // *L is Value stored in L, L has address of x So x's Value 
    *L = *P;
    *P = temp;
}

void main() {
    int x = 40;
    int y = 51;

    printf("x = %d \n",x);
    printf("y = %d \n",y);

    swap(&x,&y); // it send address of x and y

    printf("After Swap \n");
    printf("x = %d \n",x);
    printf("y = %d",y);
}

/* Output:
    $ ./swap_by_PassByReference 
    x = 40 
    y = 51 
    After Swap 
    x = 51 
    y = 40
*/
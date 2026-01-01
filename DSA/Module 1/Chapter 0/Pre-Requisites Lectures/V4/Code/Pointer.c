#include <stdio.h>

int main() {
    int *P;       // P is a pointer to int
    int L = 10;   // L is an int variable with value 10

    P = &L;       // P now stores the address of L

    // Now let’s print the values
    printf("%d\n", L);      // Prints 10 — the value of L
    printf("%p\n", (void *)&L);  // Prints address of L
    printf("%p\n", (void *)&P);  // Prints address of pointer P
    printf("%p\n", (void *)P);   // Prints what P holds: address of L
    printf("%d\n", *P);     // Prints 10 — value at the address stored in P (i.e., L)
    
    return 0;
}

/*  Output:
    10
    0x7ffcc6b6b514
    0x7ffcc6b6b518
    0x7ffcc6b6b514
    10
*/

/*
    int *P; // *P - Stores Address only
    int L = 10;
    P = &L; // &L - Return address of L = P

    print (L); // = 10
    print (&L); // = 51 (address of L)
    print (&P); // = 40 (address Of P)
    print (P); // = 51 (address of L)
    print (*P); // = 10 (Value of L)
*/
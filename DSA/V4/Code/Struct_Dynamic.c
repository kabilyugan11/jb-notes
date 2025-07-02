// Using Pointers in Structures
// In Dynamic Memeory

#include <stdio.h>
#include <stdlib.h> //required for malloc
struct Rectangle {
    int l;
    int b;
};

int main() {
    struct Rectangle *P;
    P = (struct Rectangle *)malloc(sizeof(struct Rectangle)); // Typescast of Return Void * of Allocated Heap Memeory
    printf("l & b : %d, %d \n",P -> l, P -> b);
    P -> l = 10;
    P -> b = 20;
    printf("l & b : %d, %d \n",(*P).l, (*P).b);

    free(P);    // Free the dynamically allocated memory

    return 0;
}

/*  Output:
     $ ./Struct_Dynamic 
    l & b : 0, 0 
    l & b : 10, 20  
*/
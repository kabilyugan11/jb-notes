// Using Pointers in Structures
// In Stack Memeory

#include <stdio.h>
struct Rectangle {
    int l;
    int b;
};

int main() {
    struct Rectangle r = {10, 5}; // Here Initialize Rectangle l and b
    printf("r = %d, %d \n",r.l, r.b);
    struct Rectangle *P;
    P = &r;
    (*P).l=20; //here *P.l = 20 gets error because .(dot) operator gets preference first
    printf("(*P).l = 20 ==> %d,%d \n",r.l,r.b);
    P->l = 15;
    printf("P->l = 15 ==> %d, %d \n",r.l,r.b);

     return 0;
}

/*  Output:
    $ ./Struct_Static
    r = 10, 5 
    (*P).l = 20 ==> 20,5 
    P->l = 15 ==> 15, 5 
*/
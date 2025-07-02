# Video 4 - Master DSA & Coding Fundamentals

## My_Notes:
```
* About Pointers:
    Value -> It has Variable and Address | 10 -> Int L and Address(&L)

    int *P; // *P - Stores Address only
    int L = 10;
    P = &L; // &L - Return address of L = P

    print (L); // = 10
    print (&L); // = 51 (address of L)
    print (&P); // = 40 (address Of P)
    print (P); // = 51 (address of L)
    print (*P); // = 10 (Value of L)

* Why Pointer?
    - Heap Access
    - Using Single Pointer Variable to easyly access next next elements
    - Parameter Passing

    Pass By Value - Passing Value
    Pass By Reference - Passing Address

    Swap (a,b) by Pass By Reference -> swap_by_PassByReference.c 

* Array - Store only Same datatype
    //Charcter
    char c = 'a';   

    //Array
    char c[10] = "01Hello789"  //'0' and '1' look like numbers, they're stored as characters, like '1' = 49 in ASCII

* Structure - Creating an Our Own Datatypes
    //Example
        Struct Rectangle {
            float l;
            float b;
        }

        int main() {
            Struct Rectangle r1,r2; // Here Initialize Rectangle l and b
            r1.l = 10.0;
            r1.b = 21.6;
        }

        // Or 
            r1 = {10.0, 21.6};
        
    Card Example -> Refer Images

* By Static:
    // In Stack Memeory
    struct Rectangle {
            float l;
            float b;
        };

        int main() {
            struct Rectangle r = {10, 5}; // Here Initialize Rectangle l and b
            struct Rectangle *P;
            P = &r;
            (*P).l=20; //here *P.l = 20 gets error because .(dot) operator gets preference first
            P->l = 15;
        }

* By Dynamic:
    - malloc -> Allocate Memory and Give 

    // In Dynamic Memeory
    struct Rectangle {
            float l;
            float b;
        };

        int main() {
            struct Rectangle *P;
            P = (struct Rectangle *)malloc(sizeof(struct Rectangle)); // Typescast of Return Void * of Allocated Heap Memeory
            P -> l = 10;
            P -> b = 20;
        }

        - malloc(sizeof(struct Rectangle)); --> It returns void * (void pointer - It is genral pointer and It is easy for type cast to int or struct *) 
        - Type cast By P = (struct Rectangle *)malloc(sizeof(struct Rectangle));

* About Function:
    Array Pointer in Function - Pointer_in_function.c & Pointer_Heap_inFunction.c

    In C, SetRArray = (struct Rect r) -> in here it creates copy of struct Rect r
          SetRArray = (int *arr) -> it sends First address and Not copy or duplicatesstruct Rect r


```

## Images:
``` Images Folder - Available ```
![Image of V4](Images/(V4)%201.png)
![Image of V4](Images/(V4)%202.png)
![Image of V4](Images/(V4)%203.png)
![Image of V4](Images/(V4)%204.png)
![Image of V4](Images/(V4)%205.png)
![Image of V4](Images/(V4)%206.png)
![Image of V4](Images/(V4)%207.png)
![Image of V4](Images/(V4)%208.png)
![Image of V4](Images/(V4)%209.png)
![Image of V4](Images/(V4)%2010.png)
![Image of V4](Images/(V4)%2011.png)
![Image of V4](Images/(V4)%2012.png)
![Image of V4](Images/(V4)%2013.png)
![Image of V4](Images/(V4)%2014.png)
![Image of V4](Images/(V4)%2015.png)
![Image of V4](Images/(V4)%2016.png)
![Image of V4](Images/(V4)%2017.png)
![Image of V4](Images/(V4)%2018.png)
![Image of V4](Images/(V4)%2019.png)
![Image of V4](Images/(V4)%2020.png)
![Image of V4](Images/(V4)%2021.png)
![Image of V4](Images/(V4)%2022.png)
![Image of V4](Images/(V4)%2023.png)

## Code:
### Pointer.c
``` C
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
```

### swap_by_PassByReference.c 
``` C
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
```

### Struct_Static.c
```c
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
```

### Struct_Dynamic.c
``` c
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
```

### Pointer_in_function.c
``` C
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
```

### Pointer_Heap_inFunction.c
``` c
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
```
___
---
***

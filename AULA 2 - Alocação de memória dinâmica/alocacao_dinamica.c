#include <stdio.h>
#include <stdlib.h>

int main () {
    int *v, t;
    do {
        //printf ("qual o temanho do vetor? ");
        //scanf ("%d", &t);
        v = (int *) malloc (100000000 * sizeof(int));
        printf("funcionou: %p\n", v);
        //free (v);
    } while (1);
    return 0;
}
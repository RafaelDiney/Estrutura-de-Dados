#include <stdlib.h>
#include <stdio.h>

int main () {
    int *vetor;
    do {
        vetor = (int * ) malloc (100000000 * sizeof(int));
        printf ("%p\n", vetor);
    } while (vetor != NULL);
}
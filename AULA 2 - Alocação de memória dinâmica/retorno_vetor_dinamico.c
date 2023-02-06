#include <stdio.h>
int * aloca_vetor (int x) {
    int v = (int *) malloc (x *sizeof(int));
    return v;
}
int main () {
    int a;
    int *vm;
    printf ("digite o tamanho do vetor: ");
    scanf ("%d", &a);
    vm = aloca_vetor(a);
    return 0;
}

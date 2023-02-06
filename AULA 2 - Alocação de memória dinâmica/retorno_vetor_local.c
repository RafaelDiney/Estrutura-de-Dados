#include <stdio.h>
int * aloca_vetor (int x) {
    int v[x];
    v[0] = 12;
    printf ("executando aloca_vetor\n");
    return v;
}

int main () {
    int a;
    int *vm;
    printf ("digite o tamanho do vetor: ");
    scanf ("%d", &a);
    vm = aloca_vetor(a);
    printf ("voltei do aloca_vetor\n");
    printf ("conferindo: %d", vm[0]);
    return 0;
}
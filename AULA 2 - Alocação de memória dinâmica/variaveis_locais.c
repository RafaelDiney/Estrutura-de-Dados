#include <stdio.h>
void f1 () {
    int a;
    printf ("executando f1\n");
}

void f2 (int x) {
    float b;
    printf ("executando f2\n");
}

int main () {
    int a;
    printf ("digite um valor qualquer: ");
    scanf ("%d", &a);
    if (a < 0) 
        f1();
    else if (a > 0) 
        f2(4);
    return 0;
}
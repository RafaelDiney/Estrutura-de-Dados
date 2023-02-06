int global;

void f1 () {
    global = 10;
}

void f2 () {
    global++;
}

int main () {
    int local_main = 5;
    global = 12;
    f2();
    f1();
    f2();
    return 0;
}
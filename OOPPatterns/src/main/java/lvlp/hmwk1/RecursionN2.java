package lvlp.hmwk1;

/**
 * Второй вариант разложения на слагаемые
 */
public class RecursionN2 {
    int N;
    int[] A;

    public RecursionN2(int N) {
        this.N = N;
        A = new int[N];
    }

    public void gent() {
        rec(0, N, N);
    }

    public void rec(int index, int max, int summa) {
        for (int x = Math.min(max,summa); x >= 1; x--) {
            A[index] = x;
            if (summa == x) {
                print(A, index + 1);
            } else {
                rec(index + 1, x, summa - x);
            }
        }
    }


    public void print(int[] A, int size) {
        System.out.print(N + " = ");
        for (int i = 0; i < size - 1; i++) {
            System.out.println(A[i] + " = ");
        }
        System.out.println(A[size - 1]);
    }

}

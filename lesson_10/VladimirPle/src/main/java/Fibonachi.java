public class Fibonachi {
    int n;
    int f = 1;
    int s = 1;

    public Fibonachi(int n) {
        this.n = n;
    }

    //O(2^n)
    public void fibonachiRecursion() {
        int sum;
        sum = f + s;
        f = s;
        s = sum;
        System.out.println(s);
        n--;
        if (n <= 0) return;
        fibonachiRecursion();
    }

    //O(n)
    public void fibonachi() {
        int a = 1, b = 1, sum, i = 0;
        while (i < n) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(b);
            i++;
        }
    }
}

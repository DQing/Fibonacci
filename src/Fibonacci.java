public class Fibonacci {
    public long Calculate(int num) {
        if (num > 2)
            return Calculate(num - 2) + Calculate(num - 1);
        return 1;
    }
}

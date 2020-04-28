public class Fibonacci {
    public long Calculate(int num) {
        if (num < 1 || num > 50) {
            throw new IllegalArgumentException("请输入 1～50 整数");
        }
        if (num > 2)
            return Calculate(num - 2) + Calculate(num - 1);
        return 1;
    }
}

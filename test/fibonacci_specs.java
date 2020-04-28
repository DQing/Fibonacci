import org.junit.Assert;
import org.junit.Test;

public class fibonacci_specs {

    @Test
    public void should_return_1_when_input_is_1() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(1);

        Assert.assertEquals(1, result);
    }

    @Test
    public void should_return_1_when_input_is_2() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(2);

        Assert.assertEquals(1, result);
    }

    @Test
    public void should_return_2_when_input_is_3() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(3);

        Assert.assertEquals(2, result);
    }

    @Test
    public void should_return_3_when_input_is_4() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(4);

        Assert.assertEquals(3, result);
    }

    @Test
    public void should_return_144_when_input_is_12() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(12);

        Assert.assertEquals(144, result);
    }

    @Test
    public void should_return_12586269025L_when_input_is_50() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(50);

        Assert.assertEquals(12586269025L, result);
    }
}

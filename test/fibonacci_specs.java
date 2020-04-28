import org.junit.Assert;
import org.junit.Test;

public class fibonacci_specs {

    @Test
    public void should_return_1_when_input_is_1() {
        var fibonacci = new Fibonacci();
        var result = fibonacci.Calculate(1);

        Assert.assertEquals(1, result);
    }
}

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testCar() {
        Car car = new Car("maluch");
        String name = car.getName();

        Assert.assertEquals("maluch", name);
    }
}

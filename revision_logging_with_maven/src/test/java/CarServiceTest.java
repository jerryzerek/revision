import com.carservice.CarService;
import org.junit.Test;

public class CarServiceTest {

    @Test
    public void shouldBeLogged() {
        CarService carService = new CarService();
        carService.process("MBW");
    }
}

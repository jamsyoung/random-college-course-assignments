import org.junit.*;
import static org.junit.Assert.*;

public class CashRegisterTest {
    @Test
    public void testcase1() {
        System.out.println("Default constructor should set tax rate to 0.08");
        CashRegister register = new CashRegister();
        assertTrue(register.getTaxRate() == 0.08);
    }

    @Test
    public void testcase2() {
        System.out.println("Passing double into constructor should set tax rate");
        CashRegister register = new CashRegister(0.12);
        assertTrue(register.getTaxRate() == 0.12);
    }

    @Test
    public void testcase3() {
        System.out.println("Should be able to set tax rate after cash regsiter is created");
        CashRegister register = new CashRegister();
        assertTrue(register.getTaxRate() == 0.08);
        register.setTaxRate(0.25);
        assertTrue(register.getTaxRate() == 0.25);
    }
}

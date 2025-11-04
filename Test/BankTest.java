import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Player a = new Player("a", 3000);
    Player b = new Player ("b", 4000);

    @BeforeEach
    void setUp() {
    }

    @Test
    void deposit() {
        Bank.deposit(400, a);
        assertEquals(3400, a.getBalance());
    }

    @Test
    void withdraw() {
        Bank.withdraw(200, b);
        assertEquals(3800, b.getBalance());
    }

    @Test
    void transfer() {

        Bank.transfer(300,a,b);
        assertEquals(4300,b.getBalance());
        assertEquals(2700, a.getBalance());
    }

}
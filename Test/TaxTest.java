import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTest {
    Player p;

    @BeforeEach
    void setUp() {
    }

    @Test
    void onLand() {
        p.setPosition(5);

        String expected = s;

        assertEquals();

    }



    @Test
    void onAccept() {
        p = new Player("Egon", 3000);

        Bank.withdraw(4000, p);

        int actual = p.getBalance();
        int expected = 26000;

        assertEquals(expected, actual);

    }

    @Test
    void onReject() {
        p = new Player("benny", 3000);

        double amount = p.getBalance() * 0.1;
        Bank.withdraw(p.getBalance(), p);

        int actual = p.getBalance();
        double expected = p.getBalance() * 0.1;

        assertEquals(expected,actual);

    }


}
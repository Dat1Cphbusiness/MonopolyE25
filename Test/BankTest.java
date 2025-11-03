import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    public void testDeposit(){
        Player p = new Player("Signe", 100);
        Bank.deposit(100, p);
        assertEquals(200, p.getBalance());

    }

}
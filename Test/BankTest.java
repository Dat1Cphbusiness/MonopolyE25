import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Player p = new Player("Signe", 100);
    Player p1 = new Player("børge", 5000);
    @Test
    public void testDeposit(){

        Bank.deposit(200, p);
        assertEquals(300, p.getBalance());

    }

    @Test
    public void testTransfer(){

        Bank.transfer(500, p, p1);
        assertEquals(600, p.getBalance());

    }

    @Test
    public void testWithdraw(){

        Bank.withdraw(100, p);
        assertEquals(0, p.getBalance());
    }

}
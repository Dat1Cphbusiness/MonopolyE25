import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test

    public void testDeposit(){
        Player p = new Player("Signe", 100);
        Bank.deposit(100, p);
        assertEquals(200, p.getBalance());

    }

    @Test

    public void testWithdraw(){
        Player p = new Player("Signe", 101);
        Bank.withdraw(100, p);
        assertEquals(1, p.getBalance());

    }

    @Test
    public void testTransfer() {
        Player p1 = new Player("person1", 100);
        Player p2 = new Player("person2", 200);
        Bank.transfer(125, p1, p2);
        assertEquals(0, p1.getBalance());
    }





}
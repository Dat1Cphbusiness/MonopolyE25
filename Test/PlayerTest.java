import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
   Player p;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void updatePosition() {

        p = new Player("Egon",30000 );
        p.setPosition(14);


       int actual = p.updatePosition(7);
       int expected = 21;

       assertEquals(actual, expected);
       assertEquals(34000,p.getBalance());
    }
}
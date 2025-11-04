import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PlayerTest {
    Player p;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.Test
    void updatePosition() {

         p = new Player("Knud", 5000);
         p.setPosition(14);

         //Act

        int actual = p.updatePosition(7);
        int expected = 21;

        //Assert

        assertEquals(actual, expected);
        assertEquals(9000, p.getBalance());

    }
}
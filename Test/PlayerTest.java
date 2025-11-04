import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player p;

    @BeforeEach
    void setUp() {

    }

    @Test
    void updatePosition() {
        //Arrange
        p =  new Player("Egon", 30000);
        p.setPosition(39);

        //Act
        int actual = p.updatePosition(7);
        int expected = 6;

        //Assert
        assertEquals(actual, expected);
        assertEquals(34000, p.getBalance());


    }
}
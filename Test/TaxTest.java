import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTest {
    Game game = new Game("Matador", 6);
    Player p = new Player ("Egon", 30000);
    @BeforeEach
    void setUp() {
        //Arrange
        game.buildBoard();


    }

    @Test
    void onAcceptTest() {
        Field f = game.b.getField(5);
        //Act
        String msg = f.onLand(p);
        f.onAccept(p);
        System.out.println(msg);
        //Assert
        int expected = 26000;// p har 4000 kr mindre end før;
        int actual = p.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void onReject() {
        Field f = game.b.getField(5);
        f.onLand(p);
        f.onReject(p);
        int expected = 27000;//10 procent trukket fra de 30000
        int actual = p.getBalance();
        assertEquals(expected, actual);
    }
}
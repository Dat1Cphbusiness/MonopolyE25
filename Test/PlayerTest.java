import static org.junit.jupiter.api.Assertions.*;


class PlayerTest {
    Player p = new Player("Bob", 5000);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void updatePosition() {
        p.setPosition(14);
        int actual = p.updatePosition(7);
        int expected = 21;
        assertEquals(actual, expected);
    }
}
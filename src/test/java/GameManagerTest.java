import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class GameManagerTest {
    GameManager game;

    @Test
    public void testGame()
    {
        assertEquals(1, 1, "Always successful.");
    }

    @Test
    public void testGame_Add()
    {
        assertEquals(7, GameManager.add(3, 4), "Add 3+4.");
    }

    @Test
    public void testConstMult()
    {
        game = new GameManager();
        assertEquals(5, game.multWithConst(1), "Dummy");
    }

}

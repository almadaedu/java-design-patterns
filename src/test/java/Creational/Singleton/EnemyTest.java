package Creational.Singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EnemyTest {

    @Test
    public void nameTest() {
        Enemy.getInstance().setName("Werewolf");
        assertEquals("Werewolf", Enemy.getInstance().getName());
    }

    @Test
    public void typeTest() {
        Enemy.getInstance().setType("Minion");
        assertEquals("Minion", Enemy.getInstance().getType());
    }

    @Test
    public void showTypeTest() {
        Enemy.getInstance().setType("Minion");
        assertEquals("This enemy type is " + Enemy.getInstance().getType(), Enemy.getInstance().showEnemyType());
    }
}

package Creational.Singleton;

public class Enemy {

    private Enemy() {
    };

    private String name;
    private String type;

    private static Enemy enemy = new Enemy();

    public static Enemy getInstance() {
        return enemy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String showEnemyType() {
        return "This enemy type is " + this.type;
    }
}

package DesginPatterns.Factory;

public class EnemyFactory {

    public static enemy getEnemy(int x) {
        switch (x) {
            case 1:
                return new Alien();
            case 2:
                return new Turtle();
            default:
                return null;
        }

    }
}

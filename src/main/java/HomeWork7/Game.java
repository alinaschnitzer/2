package HomeWork7;

public class Game {
    enum Type {
        SOCCER,
        HOCKEY,
        RUGBY
    }
    public static double writeNumOfPlayersPerTeam(int a, int b, int c, Type type) {
        double result = 0;

        switch (type) {
            case SOCCER:
                result = a;
                break;
            case HOCKEY:
                result = b;
                break;
            case RUGBY:
                result = c;
                break;
            default:
                result = 00;

        }
        return result;

    }

}

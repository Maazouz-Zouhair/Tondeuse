
public class Pelouse {
    private int largeur;
    private int longeur;

    public Pelouse(int largeur, int longeur) {
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() <= largeur &&
               position.getY() >= 0 && position.getY() <= longeur;
    }
}

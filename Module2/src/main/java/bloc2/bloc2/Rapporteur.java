package bloc2.bloc2;

public class Rapporteur implements IRapporteur {
    public boolean estPlein() {
        return false;
    }

    public void rapporter(String message) {
        throw new RuntimeException("NOT IMPLEMENTED");
    }
}
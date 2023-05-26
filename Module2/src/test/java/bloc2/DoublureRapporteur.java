package bloc2;

import bloc2.bloc2.IRapporteur;

public class DoublureRapporteur implements IRapporteur {
    @Override
    public boolean estPlein() {
        return false;
    }

    @Override
    public void rapporter(String message) {

    }
}

package bloc2.bloc2;

public class Cible {
    private IRapporteur rapporteur;

    public Cible(IRapporteur rapporteur) {
        this.rapporteur = rapporteur;
    }

    public boolean preVerifier(int montant) {
       if(montant > 1000) {
          rapporter("WARN plus de 1000!");
          return false;
       }
        return true;
    }

    private void rapporter(String msg) {
        rapporteur.rapporter(msg);
    }
}



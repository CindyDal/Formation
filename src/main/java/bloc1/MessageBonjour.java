package bloc1;

public class MessageBonjour {
    public String saluer(int heures) {
        if(heures < 7 || heures >= 18)
            return "Bonsoir";
        return "Bonjour";
    }
}

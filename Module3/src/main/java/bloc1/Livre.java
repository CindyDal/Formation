package bloc1;

public class Livre {
    public String ISBN;
    public String Titre;
    public String Auteur;
    public int NombrePages;
    public String Editeur;


    public boolean PasDeTitre()
    {
        return Titre == null || Titre.isBlank() || Titre.isEmpty();
    }
}

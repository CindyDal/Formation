package bloc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BibliothequeTests {

    @Before
    public void setUp()
    {

    }

    @Test
    public void EtantDonneUneBibliotheque_LorsqueJAjouteUnLivre_AlorsLeCompteNestPasZero() {
        Livre livre = getLivre("Clean code", "Uncle Bob",407,"Prentice Hall","0-13-235088-2");
        Assert.assertNotEquals(new Bibliotheque(List.of(livre)).NombreLivre, 0);
    }

    private Livre getLivre(String titre, String auteur, int nbPages, String editeur, String isbn) {
        var livre = new Livre();
        livre.Titre = titre;
        livre.Auteur = auteur;
        livre.NombrePages = nbPages;
        livre.Editeur = editeur;
        livre.ISBN = isbn;
        return livre;
    }
}

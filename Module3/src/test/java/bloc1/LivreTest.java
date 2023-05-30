package bloc1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LivreTest {

    @Test
    public void TitreNull() {
        Livre livre = new Livre();

        boolean actual = livre.PasDeTitre();

        Assert.assertTrue(actual);
    }

    @Test
    public void TitreVide() {
        Livre livre = new Livre();
        livre.Titre = "";

        boolean actual = livre.PasDeTitre();

        Assert.assertTrue(actual);
    }

    @Test
    public void TitreEspace() {
        Livre livre = new Livre();
        livre.Titre = "   ";

        boolean actual = livre.PasDeTitre();

        Assert.assertTrue(actual);
    }

    @Test
    public void TitreAvecTexte() {
        Livre livre = new Livre();
        livre.Titre = "Banane";

        boolean actual = livre.PasDeTitre();

        Assert.assertFalse(actual);
    }
}
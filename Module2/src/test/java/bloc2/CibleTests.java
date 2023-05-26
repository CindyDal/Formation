package bloc2;

import bloc2.bloc2.Cible;
import bloc2.bloc2.IRapporteur;
import org.junit.Assert;
import org.junit.Test;

public class CibleTests {

    private Cible target;

    @Test
    public void givenAmountEqualsToThousand_whenPreVerifier_thenAmountIsVerified()
    {
        //given
        IRapporteur rapporteur = new DoublureRapporteur();
        target = new Cible(rapporteur);

        //when
        boolean actual = target.preVerifier(1000);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void givenAmountLowerThanThousand_whenPreVerifier_thenAmountIsVerified()
    {
        //given
        IRapporteur rapporteur = new DoublureRapporteur();
        target = new Cible(rapporteur);

        //when
        boolean actual = target.preVerifier(999);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void givenAmountAboveThousand_whenPreVerifier_thenAmountIsNotVerified()
    {
        //given
        IRapporteur rapporteur = new DoublureRapporteur();
        target = new Cible(rapporteur);

        //when
        boolean actual = target.preVerifier(1001);

        //then
        Assert.assertFalse(actual);
    }


}

package bloc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class TSFileUnitTests {

    private TSFile<Integer> target;

    @Before
    public void setUp() {
        target = new TSFile<>();
    }

    //region enfiler

    @Test
    public void givenTSFileIsEmpty_whenEnfiler_thenTSFileIsNotEmpty() {
        //when
        target.enfiler(5);

        //then
        Assert.assertFalse(target.estVide());
    }

    @Test
    public void givenTSFileWithElements_whenEnfiler_thenNewElementIsAddedAtTheEnd() {
        //given
        Integer alreadyIn = 8;
        target.enfiler(alreadyIn);
        Integer expectedLast = 12;

        //when
        target.enfiler(expectedLast);

        //then
        Assert.assertEquals(alreadyIn, target.defiler());
        Assert.assertEquals(expectedLast, target.defiler());
    }


    //endregion

    //region estVide

    @Test
    public void givenTSFileHasNoElement_whenEstVide_thenTrueIsObtain() {
        //given


        //when
        boolean actual = target.estVide();

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void givenTSFileHasAnElement_whenEstVide_thenFalseIsObtain() {
        //given
        target.enfiler(10);

        //when
        boolean actual = target.estVide();

        //then
        Assert.assertFalse(actual);
    }

    //endregion

    //region defiler

    @Test(expected = EmptyStackException.class)
    public void givenElementsAreEmpty_whenDefiler_thenEmptyStackExceptionIsThrown() {
        //given

        //when
        target.defiler();
    }

    @Test
    public void givenManyElementsInTSFile_whenDefiler_thenFirstAddedElementIsObtained() {
        //given
        Integer firstExpected = 8;
        target.enfiler(firstExpected);
        target.enfiler(12);

        //when
        Integer actual = target.defiler();

        //then
        Assert.assertEquals(firstExpected, actual);
    }


    //endregion
}

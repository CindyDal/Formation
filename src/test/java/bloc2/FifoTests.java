package bloc2;

import bloc2.bloc2.Fifo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class FifoTests {

    private Fifo<Integer> target;

    @Before
    public void setUp() {
        target = new Fifo<>();
    }

    @Test
    public void givenAnElementToPush_whenPush_thenElementIsAdded() {
        //given
        Integer element = 10;

        //when
        target.push(element);

        //then
        Assert.assertEquals(target.pop(), element);
    }

    @Test(expected = EmptyStackException.class)
    public void givenNoElementInFifo_whenPop_thenEmptyStackExceptionIsThrown() {
        //when
        target.pop();
    }

    @Test
    public void givenAnElementInFifo_whenPop_thenThisElementPopped() {
        //given
        Integer anElement = 10;
        target.push(anElement);

        //when
        Integer actual = target.pop();

        //then
        Assert.assertEquals(anElement, actual);
        Assert.assertTrue(target.isEmpty());
    }

    @Test
    public void givenFifoWithoutElements_whenIsEmpty_thenTrueIsObtain() {
        //when
        Assert.assertTrue(target.isEmpty());
    }

    @Test
    public void givenFifoWithElements_whenIsEmpty_thenFalseIsObtain() {
        //given
        target.push(10);

        //when
        Assert.assertFalse(target.isEmpty());
    }

}

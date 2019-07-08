import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrintTest {
    @Test
    public void should_return_num() {
        assertEquals(new Student().speak(1),"1");
        assertEquals(new Student().speak(2), "2");
    }

    @Test
    public void should_return_Fizz_given_3() {
        assertEquals(new Student().speak(3), "Fizz");
    }

    @Test
    public void should_return_Buzz_given_5() {
        assertEquals(new Student().speak(5), "Buzz");
    }

    @Test
    public void should_return_Whizz_given_7() {
        assertEquals(new Student().speak(7), "Whizz");
    }

    @Test
    public void should_return_Fizz_given_num_can_be_divided_by_3() {
        assertEquals(new Student().speak(6), "Fizz");
    }

    @Test
    public void should_return_Buzz_given_num_can_be_divided_by_5() {
        assertEquals(new Student().speak(10), "Buzz");
    }

    @Test
    public void should_return_Whizz_given_num_can_be_divided_by_
}

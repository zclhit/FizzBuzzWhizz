import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {
    @Test
    public void should_return_1_given_1() {
        assertEquals("1", new Student(1).speak());
    }

    @Test
    public void should_return_2_given_2() {
        assertEquals("2", new Student(2).speak());
    }

    @Test
    public void should_return_Fizz_given_3() {
        assertEquals("Fizz", new Student(3).speak());
    }

    @Test
    public void should_return_Buzz_given_5() {
        assertEquals("Buzz", new Student(5).speak());
    }

    @Test
    public void should_return_Whizz_given_7() {
        assertEquals("Whizz", new Student(7).speak());
    }

    @Test
    public void should_return_Fizz_given_6() {
        assertEquals("Fizz", new Student(6).speak());
    }

    @Test
    public void should_return_Buzz_given_10() {
        assertEquals("Buzz", new Student(10).speak());
    }

    @Test
    public void should_return_Whizz_given_14() {
        assertEquals("Whizz", new Student(14).speak());
    }

    @Test
    public void should_return_FizzBuzz_given_15() {
        assertEquals("FizzBuzz", new Student(15).speak());
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_105() {
        assertEquals("FizzBuzzWhizz", new Student(105).speak());
    }
}

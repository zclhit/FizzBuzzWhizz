public class Student {
    public String speak(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }

        if (num % 5 == 0) {
            return "Buzz";
        }

        if (7 == num) {
            return "Whizz";
        }
        return String.valueOf(num);
    }
}

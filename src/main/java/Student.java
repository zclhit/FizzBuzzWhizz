public class Student {
    private int position;

    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final String WHIZZ_STRING = "Whizz";
    private static final String SPECIAL_NUM = "3";

    Student(int position) {
        this.position = position;
    }

    public String speak() {

        if (!inAbnormalPosition(this)) {
            return String.valueOf(position);
        } else if (isPositionSpecial(this)) {
            return FIZZ_STRING;
        } else {
            StringBuilder speakBuilder = new StringBuilder();
            if (canBeDividedBy(3)) {
                speakBuilder.append(FIZZ_STRING);
            }
            if (canBeDividedBy(5)) {
                speakBuilder.append(BUZZ_STRING);
            }
            if (canBeDividedBy(7)) {
                speakBuilder.append(WHIZZ_STRING);
            }
            return speakBuilder.toString();
        }
    }

    private boolean inAbnormalPosition(Student student) {
        return student.canBeDividedBy(3) || canBeDividedBy(5) || canBeDividedBy(7) || isPositionSpecial(student);
    }

    private boolean isPositionSpecial(Student student) {
        return String.valueOf(student.position).contains(SPECIAL_NUM);
    }

    private boolean canBeDividedBy(int divider) {
        return position % divider == 0;
    }
}

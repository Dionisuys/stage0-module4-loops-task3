package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int value = 0;
        String tStr = Integer.toString(t);
        if (t >= 0) {
            for (int i = 0; i < tStr.length(); i++) {
                char digitChar = tStr.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                value += digit;
            }
        } else {
            for (int i = 0; i < tStr.length(); i++) {
                char digitChar = tStr.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                value += digit;
            }
            value++;
        }
        System.out.println(value);
    }
}

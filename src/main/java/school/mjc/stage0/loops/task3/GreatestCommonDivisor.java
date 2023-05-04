package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = findGCD(first, second);
        System.out.println(gcd);
    }

    private int findGCD(int first, int second) {
        if (second == 0) {
            return first;
        }
        return findGCD(second, first % second);
    }
}

import java.util.ArrayList;

public class L202 {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)  {
            if (n == 1) {
                return true;
            }

            n = process(n);
            list.add(n);

            for (int i = 0; i < list.size(); i++) {
                if (n == list.get(i)) {
                    return false;
                }
            }
        }
    }

    public int process(int number) {
        if (number < 10) {
            return number * number;
        } else {
            int lastDigit = number % 10;
            return lastDigit * lastDigit + process(number / 10);
        }
    }
}

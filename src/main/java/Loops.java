import java.util.ArrayList;


public class Loops {
    ArrayList<Integer> integers = new ArrayList<>();

    public Loops() {
        // [1, 2, 3] array
        integers.add(1);
        integers.add(2);
        integers.add(3);
    }

    public Integer sumForLoop() {
        Integer sum = 0;

        for (Integer i: integers) {
            sum += i;
        }

        return sum;
    }

    public Integer sumAnotherForLoop() {
        Integer sum = 0;

        for (int index = 0; index < integers.size(); ++index) {
            sum += integers.get(index);
        }

        return sum;
    }

    public Integer sumLoopWithContinue() {
        // continue skips current block
        Integer sum = 0;

        for (int index = 0; index < integers.size(); ++index) {
            if (index == 0)
                continue;

            sum += integers.get(index);
        }

        return sum;
    }

    public Integer sumLoopWithBreak() {
        // break causes the loop to stop running
        Integer sum = 0;

        for (int index = 0; index < integers.size(); ++index) {
            if (index == 1)
                break;

            sum += integers.get(index);
        }

        return sum;
    }

    public Integer whileForLoop() {
        Integer sum = 0;
        int index = 0;

        while (index < integers.size()) {
            sum += integers.get(index);

            ++index;
        }

        return sum;
    }
}

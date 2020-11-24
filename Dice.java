public class Dice
{
    private int value;

    public Dice(int startValue) {
        value = startValue;
    }

    public void roll() {
        double rawRandom = Math.random() * 6.0;
        value = (int)Math.abs(rawRandom);
    }

    public void incrementValue() {
        value =+ 1;
    }

    public void decrementValue() {
        value =- 1;
    }

    public String toString() {
        if (value % 2 == 0) {
            return "Even roll";
        } else {
            return "Odd roll";
        }
    }

    public int getValue() {
        return value;
    }
}
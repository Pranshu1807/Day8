import java.util.Arrays;

public class Max<T extends Comparable<T>> {
    public T[] values;

    Max(T... values) {
        this.values = values;
    }

    public T getMax() {
        return Max.getMax(values);
    }

    public static <T extends Comparable<T>> T getMax(T... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        Arrays.sort(values);
        return values[values.length - 1];
    }

    public void printMax() {
        T max = getMax();

        if (max == null)
            System.out.println("No number entered");
        else
            System.out.println("Max of given values: " + max);
    }
}
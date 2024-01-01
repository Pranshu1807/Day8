public class Max<T extends Comparable<T>> {
    public T a;
    public T b;
    public T c;

    Max(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getMax() {
        return Max.getMax(a, b, c);
    }

    public static <T extends Comparable<T>> T getMax(T a, T b, T c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }
}
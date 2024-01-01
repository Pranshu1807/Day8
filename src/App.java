public class App {
    public static Integer max(Integer a, Integer b, Integer c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }

    public static Float max(Float a, Float b, Float c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }

    public static String max(String a, String b, String c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("TC 1");
        System.out.println("Max of Peach, Apple, Banana: " + max("Peach", "Apple", "Banana"));

        System.out.println("TC 2");
        System.out.println("Max of Banana, Peach, Apple: " + max("Banana", "Peach", "Apple"));

        System.out.println("TC 3");
        System.out.println("Max of Banana, Apple, Peach: " + max("Banana", "Apple", "Peach"));
    }
}
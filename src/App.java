public class App {
    public static Integer max(Integer a, Integer b, Integer c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("TC 1");
        System.out.println("Max of 20, 15, 10: " + max(20, 15, 10));

        System.out.println("TC 2");
        System.out.println("Max of 20, 35, 10: " + max(20, 35, 10));

        System.out.println("TC 3");
        System.out.println("Max of 20, 15, 50: " + max(20, 15, 50));
    }
}
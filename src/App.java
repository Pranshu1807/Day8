public class App {
    public static Integer max(Integer a, Integer b, Integer c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }

    public static Float max(Float a, Float b, Float c) {
        return a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("TC 1");
        System.out.println("Max of 80.5, 12.1, 15.9: " + max(80.5F, 12.1F, 15.9F));

        System.out.println("TC 2");
        System.out.println("Max of 2.1, 33.8, 13.2: " + max(2.1F, 33.8F, 13.2F));

        System.out.println("TC 3");
        System.out.println("Max of 26.2, 35.5, 55.9: " + max(26.2F, 35.5F, 55.9F));
    }
}
public class App {

    public static void main(String[] args) throws Exception {
        Max<Integer> intObj = new Max<Integer>(20, 15, 25, 50, 10);
        System.out.println("Max among the values: " + intObj.getMax());

        Max<Float> floatObj = new Max<Float>(20.2F, 20.3F, 20.1F, 1.1F, 3.3F);
        System.out.println(
                "Max among the values :" + floatObj.getMax());

        Max<String> stringObj = new Max<String>("Apple", "Banana", "Peach", "Guava", "Grapes");
        System.out.println(
                "Max among the values: " + stringObj.getMax());
    }
}
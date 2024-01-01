public class App {

    public static void main(String[] args) throws Exception {
        Max<Integer> intObj = new Max<Integer>(20, 15, 25);
        System.out.println("Max of " + intObj.a + ", " + intObj.b + ", " + intObj.c + ": " + intObj.getMax());

        Max<Float> floatObj = new Max<Float>(20.2F, 20.3F, 20.1F);
        System.out.println(
                "Max of " + floatObj.a + ", " + floatObj.b + ", " + floatObj.c + ": " + floatObj.getMax());

        Max<String> stringObj = new Max<String>("Apple", "Banana", "Peach");
        System.out.println(
                "Max of " + stringObj.a + ", " + stringObj.b + ", " + stringObj.c + ": " + stringObj.getMax());
    }
}
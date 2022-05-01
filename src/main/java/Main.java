public class Main {
    public static void main(String[] args) {
        BinOps bin = new BinOps();

        String sumAB = bin.sum("0100", "0101"); //в десятичном виде a = 4, b = 5
        String multAB = bin.mult("0100", "0101"); //в десятичном виде a = 4, b = 5

        System.out.println(sumAB); //4 + 5 = 9 (1001 в двоичном виде)
        System.out.println(multAB); //4 * 5 = 20 (10100 в двоичном виде)
    }
}

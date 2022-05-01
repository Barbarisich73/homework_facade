public class BinOps {

    public String sum(String a, String b) {
        int resultStrA = Integer.parseInt(a, 2);
        int resultStrB = Integer.parseInt(b, 2);
        int sumAB = resultStrA + resultStrB;
        return Integer.toBinaryString(sumAB);
    }

    public String mult(String a, String b) {
        int resultStrA = Integer.parseInt(a, 2);
        int resultStrB = Integer.parseInt(b, 2);
        int multAB = resultStrA * resultStrB;
        return Integer.toBinaryString(multAB);
    }
}
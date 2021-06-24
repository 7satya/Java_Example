package Calculator;

public class MyCalculator {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getAddition(int x, int y) {
        return x+y;
    }

    public int getSubstraction(int x, int y) {
        return x-y;
    }

    public int getMultiplication(int x, int y) {
        return x*y;
    }

    public float getDivision(int x, int y) {
        return x/y;
    }

}

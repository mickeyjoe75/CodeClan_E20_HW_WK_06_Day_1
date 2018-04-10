public class Calculator {
    private int num1;
    private int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int doSum() {
        return (num1+num2);
    }

    public int doSubract() {
        return (num1-num2);
    }

    public int doMultiply() {
        return (num1*num2);
    }

    public int doDivide() {
        return (num1/num2);
    }


}
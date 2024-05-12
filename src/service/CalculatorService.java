package service;

public class CalculatorService {
    private double num1;
    private double num2;
    private char mathSymbol;

    public char getMathSymbol() {
        return mathSymbol;
    }

    public void setMathSymbol(char mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public double add(){
        return this.num1 + this.num2;
    }

    public double subtract(){
        return this.num1 - this.num2;
    }

    public double multiply(){
        return this.num1 * this.num2;
    }

    public double divide(){
        if (num2 != 0) {
            return this.num1 / this.num2;
        } else {
            // Handle division by zero error, for example, return NaN (Not a Number)
            return Double.NaN;
        }
    }
    
}

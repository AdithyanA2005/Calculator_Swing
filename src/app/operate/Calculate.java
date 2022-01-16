package app.operate;

public class Calculate {
    private float num1;
    private float num2;
    private float result;

    private float doAddition() {
        return this.num1 + this.num2;
    }

    private float doSubstraction() {
        return this.num1 - this.num2;
    }

    private float doMultiplication() {
        return this.num1 * this.num2;
    }

    private float doDivision() {
        return this.num1 / this.num2;
    }

    private float doPercentage() {
        return this.num1 / 100 * this.num2;
    }

    private float doRaiseToPower() {
        float result = 1;
        for (int i=0; i<this.num2; i++) {
            result = result * num1;
        }
        return result;
    }

    public float calculate(float num1, float num2, String operator) {
        float result = 0;
        this.num1 = num1;
        this.num2 = num2;

        if (operator == "a") { result = doAddition(); }
        else if (operator == "s") { result = doSubstraction(); }
        else if (operator == "m") { result = doMultiplication(); }
        else if (operator == "d") { result = doDivision(); }
        else if (operator == "p") { result = doPercentage(); }
        else if (operator == "r") { result = doRaiseToPower(); }
        return result;
    }
}
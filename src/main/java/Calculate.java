public class Calculate {
    private int input;
    private int length;

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
        length = String.valueOf(input).length();
    }

    public String getResult() {
        if(this.getInput() % 15 == 0)
        {
            return  "FizzBuzz";
        }
        else if (this.getInput() % 5 == 0 || this.hasDigit(5)){
            return  "Buzz";
        }
        else if (this.getInput() % 3 == 0 || this.hasDigit(3)){
            return  "Fizz";
        }
        return  String.valueOf(this.getInput());
    }

    private boolean hasDigit(int digit) {
        int d;
        int input = this.getInput();
        for (int i = 1; i <= length; i++) {
            d = (input%10);

            if(d == digit)
                return true;

            input = input / 10;
        }
        return false;
    }

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        for (int i = 1; i <= 325; i++) {
            calculate.setInput(i);
            System.out.println("i: "+ i+" "+calculate.getResult());
        }
    }
}

package me.xueyao;

/**
 * @author Simon.Xue
 * @date 2019-12-30 22:54
 **/
public class OperationHello {

    public static void main(String[] args) {
        System.out.println(getResult("*", 1, 3));
    }


    public static int getResult(String operationStr, int number1, int number2) {
        int result = 0;
        switch (operationStr) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }

        return result;
    }
}

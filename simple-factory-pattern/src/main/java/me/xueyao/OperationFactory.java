package me.xueyao;

/**
 * @author Simon.Xue
 * @date 2019-12-30 22:30
 **/
public class OperationFactory {

    public static Operation createOperation(String operationStr) {
        Operation operation = null;

        switch (operationStr) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}

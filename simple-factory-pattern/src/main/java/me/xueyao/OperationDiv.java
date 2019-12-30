package me.xueyao;

/**
 * @author Simon.Xue
 * @date 2019-12-30 22:26
 **/
public class OperationDiv extends Operation {
    @Override
    public int getResult() {
        return getNumber1() / getNumber2();
    }
}

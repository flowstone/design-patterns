package me.xueyao;

/**
 * @author Simon.Xue
 * @date 2019-12-30 22:25
 **/
public class OperationMul extends Operation {
    @Override
    public int getResult() {
        return getNumber1() * getNumber2();
    }
}

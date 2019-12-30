import me.xueyao.Operation;
import me.xueyao.OperationFactory;

/**
 * @author Simon.Xue
 * @date 2019-12-30 22:46
 **/

public class SimonFactoryPatternTest {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumber1(1);
        operation.setNumber2(3);
        System.out.println(operation.getResult());
    }
}

package advanced.lambda;

/**
 * Created by MaMingJiang on 2016/5/3.
 */
public class OperationUtils {

    public int executeOperation(int a, int b, MathOperation operation){
        return operation.operate(a,b);
    }
}

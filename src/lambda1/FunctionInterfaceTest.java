package lambda1;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        FunctionInterfaceTest fit = new FunctionInterfaceTest();
        fit.testLambda();
    }

    public void testLambda(){
        /*fun(new FunctionInterface() {
            @Override
            public void test() {
                System.out.println("InvocationHandler");
            }
        });*/
        fun(() -> System.out.println("InvocationHandler Interceptor"));
    }

    public void fun(FunctionInterface functionInterface){
        functionInterface.test();
    }
}

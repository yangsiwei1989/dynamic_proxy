package lambda2;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        FunctionInterfaceTest fit = new FunctionInterfaceTest();
        fit.testLambda();
    }

    public void testLambda(){
        /*fun(new FunctionInterface() {
            @Override
            public void test(String str) {
                System.out.println(str);
            }
        });*/
        fun((str) -> System.out.println(str));
    }
    public void fun(FunctionInterface functionInterface){
        functionInterface.test("bank of china");

    }
}

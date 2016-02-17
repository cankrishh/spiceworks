package SampleCode.Lambda;

/**
 * Created by omprakash.yadav on 14/02/16.
 */
public class LambdaSample {

    public static void main(String[] args) {
        LambdaSample sample= new LambdaSample();
        MathOperation sub= new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a-b;
            }
        };
        String salutation ="hello";
        MathOperation addition = (int a, int b) -> a+b;
        MathOperation divide = (int a , int b)->a/b;

        GreetingService greetService1 = messages->System.out.println(salutation + messages);

        greetService1.sayMessage("om");

        System.out.println("5+4 = " + sample.operate(5,4,addition));
        System.out.println("8/4 = " + sample.operate(8,4,divide));
        System.out.println("6+8 = " + addition.operation(6,8));
    }
    interface MathOperation {
        int operation(int a, int b);
    }
    interface GreetingService{
        void sayMessage(String msg);
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}

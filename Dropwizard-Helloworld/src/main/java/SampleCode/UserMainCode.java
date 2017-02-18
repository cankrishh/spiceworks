package SampleCode;

/**
 * Created by omprakash.yadav on 13/02/16.
 */
public class UserMainCode {

    public static int output1;

    private static int strToInt(String S){
        return 0;
    }

    public static void parseExp(String exp, Integer a, Integer b, Integer c, char op, char missing) {
            String del="=+-*/";
        String[] tokens = exp.split(del);

        if(tokens[0]!="X")
         a= Integer.parseInt(tokens[0]);
        if(tokens[2]!="X")
         b= Integer.parseInt(tokens[2]);
        if(tokens[4]!="X")
         c= Integer.parseInt(tokens[4]);


        if(tokens[0]!="X")
         a= Integer.parseInt(tokens[0]);


    }

    public static int performOp(int a, int b ,int c, char op) {
        switch (op) {
            case '*' :
                return a*b;
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '/':
                return a/b;
        }
        return a+b;
    }

    public static void main(String[] args) {
        Integer a=0,b=0,c=0;
        char op='+', missing='X';
        String input1="12+X=15";
        parseExp(input1, a , b, c, op, missing);
    }

    }


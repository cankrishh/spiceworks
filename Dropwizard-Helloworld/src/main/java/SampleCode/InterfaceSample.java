package SampleCode;

/**
 * Created by omprakash.yadav on 14/02/16.
 */

interface ProgrammerInterview  {
    public void read();
}

class InterfaceSample  {
    public static void main(String[] args) {


        ProgrammerInterview p = new ProgrammerInterview() {
            public void read() {
                System.out.println("interface ProgrammerInterview class implementer");
            }
        };
        p.read();
    }
}

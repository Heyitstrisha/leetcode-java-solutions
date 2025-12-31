package javaBasics;
interface A{
    void sayname();
}

public class DemoLambda {
    public static void main(String[] args) {

        A a = new A() {
            @Override
            public void sayname() {
                System.out.println("hello how are u");
            }
        };
        a.sayname();

        A a1 = ()-> System.out.println("successfully run the program using the java 8 feature  ");
        a1.sayname();

    }
}

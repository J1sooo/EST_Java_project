package Chap8.abst;

public class ImplementC implements InterfaceC{
    @Override
    public void interfaceA() {
        System.out.println("ImplementC.methodA");
    }

    @Override
    public void interfaceB() {
        System.out.println("ImplementC.methodB");
    }

    @Override
    public void interfaceC() {
        System.out.println("ImplementC.methodC");
    }

    public static void main(String[] args) {
        InterfaceA interA = new ImplementC();
        interA.interfaceA();
        System.out.println("============");

        InterfaceB interB = new ImplementC();
        interB.interfaceB();
        System.out.println("===========");

        ImplementC implC = new ImplementC();
        implC.interfaceA();
        implC.interfaceB();
        implC.interfaceC();
    }
}

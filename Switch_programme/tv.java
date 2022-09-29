package abstraction;

public class tv extends Switch{
    @Override
    void SwitchOn(){
        System.out.println("Switch on");
    }
    @Override
    void SwitchOff(){
        System.out.println("Switch off");
    }

    public static void main(String[] args) {
        tv t= new tv();
        t.SwitchOn();
        t.SwitchOff();
    }
}

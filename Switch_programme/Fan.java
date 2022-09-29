package abstraction;

public class Fan extends Switch {
    @Override
    public void SwitchOn(){
        System.out.println("Switch on");
    }
    @Override
    public void SwitchOff(){
        System.out.println("Switch off");
    }

    public static void main(String[] args) {
        Fan f = new Fan();
        f.SwitchOn();
        f.SwitchOff();
    }

}

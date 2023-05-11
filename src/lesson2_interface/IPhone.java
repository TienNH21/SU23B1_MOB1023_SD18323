package lesson2_interface;

public class IPhone implements SmartPhone {
    public void call()
    {
        System.out.println("Facetime");
    }
    
    public void luotFace()
    {
        System.out.println("Lướt Facebook");
    }
    
    public void taiApp()
    {
        System.out.println("AppStore");
    }
}

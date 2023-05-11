package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        IPhone ip = new IPhone();
        Samsung ss = new Samsung();
        suDungDT(ip);
        suDungDT(ss);
    }
    
    public static void suDungDT(SmartPhone ip)
    {
        ip.taiApp();
        ip.luotFace();
        ip.call();
    }
}

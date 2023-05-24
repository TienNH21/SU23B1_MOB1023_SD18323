package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        SmartPhone ip = new IPhone();
        SmartPhone ss = new Samsung();
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

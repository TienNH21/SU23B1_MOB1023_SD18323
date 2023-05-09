package lesson1_demo;

import lesson1_oop.Phone;

public class Samsung extends Phone {
    public void xuatThongTin()
    {
        System.out.println(
            this.getNsx() + " - " + 
            this.getImei() + " - " + 
            this.getGia()
        );
    }
}

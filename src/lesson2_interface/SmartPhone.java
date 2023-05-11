package lesson2_interface;

/*
 * Interface chỉ khai báo hàm, ko có thân hàm.
 * Class thực thi (implements) Interface. Khi đó, Class phải triển khai
    tất cả các hàm khai báo trong Interface
 * Khi Class thực thi Interface, đối tượng của Class đó được phép có kiểu
    của Interface
 */
public interface SmartPhone {
    public void call();
    public void luotFace();
    public void taiApp();
}

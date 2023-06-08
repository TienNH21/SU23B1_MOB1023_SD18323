package lesson3_swing;

import java.util.ArrayList;

public class SinhVienService {
    private ArrayList<SinhVien> listSV = new ArrayList<>();

    public void insert(SinhVien sv)
    {
        this.listSV.add(sv);
    }
    
    public void update(int viTri, SinhVien sv)
    {
        this.listSV.set(viTri, sv);
    }
    
    public void delete(int viTri)
    {
        this.listSV.remove(viTri);
    }

    public ArrayList<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(ArrayList<SinhVien> listSV) {
        this.listSV = listSV;
    }
    
    
}

package Bai10;
import Bai10.HocVien;

public class HocvienLT extends HocVien{
    public float dongiaLT;
    public HocvienLT(float dongiaLT){
        this.dongiaLT=dongiaLT;
    }
    public void nhapthongtin(){
        System.out.print("Nhap So Buoi :");
        sobuoi=sc.nextInt();
    }
    public float hocPhi(){
        if(lut=1)
            dongiaLT=1000000;
        else   
            dongiaLT=800000;
        hocPhi=sobuoi*dongiaLT-lut; 
        return hocPhi;
    }
}
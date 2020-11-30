import java.util.Scanner;

public class KhachHang {
    private  String hoTen;
    private int soNha;
    private int maCongTo;

    public KhachHang(String hoTen, int soNha, int maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public KhachHang(){

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(int maCongTo) {
        this.maCongTo = maCongTo;
    }


    public void nhapthongtin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ten chu ho");
        hoTen=sc.nextLine();
        System.out.println("nhap so nha");
        soNha=sc.nextInt();
        System.out.println("nhap ma cong to");
        maCongTo=sc.nextInt();
    }
    public void hienthithongtin(){
        System.out.println("ho ten" +hoTen);
        System.out.println("so nha" + soNha);
        System.out.println("ma so cong to " +maCongTo);
    }

}




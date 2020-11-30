import java.util.Scanner;

public class BienLai {
    private int chiSoCu;
    private int chiSoMoi;
    private double soTienPhaiTra;
    private KhachHang khachHang ;
    public BienLai(){
        super();
    }

    public BienLai(int chiSoCu, int chiSoMoi, double soTienPhaiTra, KhachHang khachHang) {
        super();
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienPhaiTra = soTienPhaiTra;
        this.khachHang = khachHang;
    }

    public void nhapBienLai(){
        khachHang= new KhachHang();
        khachHang.nhapthongtin();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chi so cu");
        chiSoCu=scanner.nextInt();
        System.out.println("nhap chi so moi");
        chiSoMoi=scanner.nextInt();
        if (chiSoCu>chiSoMoi){
            System.out.println("ban da nhap sai");
        }else {
            soTienPhaiTra=(chiSoMoi - chiSoCu)*750;
        } return;
    }
    public void hienThiBienLai(){
        khachHang.hienthithongtin();
        System.out.println("chi so cu "+ chiSoCu);
        System.out.println("ch so moi" +chiSoMoi);
        System.out.println("so tien phai tra" +soTienPhaiTra);
    }
}

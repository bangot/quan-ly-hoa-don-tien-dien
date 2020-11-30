import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        BienLai bienLai;
        Scanner scanner=new Scanner(System.in);
        ArrayList<BienLai> arrayList=new ArrayList<>();
        System.out.println("Nhap so ho gia dinh");
        n=scanner.nextInt();
        for (int i=0;i<n;i++){
            bienLai=new BienLai();
            System.out.println("nhap thong tin cua ho gia dinh");
            bienLai.nhapBienLai();
            arrayList.add(bienLai);
        }
        System.out.println("Thong tin bien lai cac ho gia dinh");
        for (int i=0;i<arrayList.size();i++){
            System.out.println("thong tin bien lai ho gia dinh thu "+(i+1) +":");
            arrayList.get(i).hienThiBienLai();
        }
    }
}

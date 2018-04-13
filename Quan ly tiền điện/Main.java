package quanlytiendien;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int luachon , n;
	 	 Biênlai[] danhsachHD = null ;
		System.out.println("1.Nhap thong tin cho n ho su dung dien");
		System.out.println("2.Hien thi thong tin tat ca ho dan");
		System.out.println("3.thoat chuong trinh");
		do {
			
		System.out.println("Moi ban nha lua chon : ");
		luachon= Integer.parseInt(sc.nextLine());
		if(luachon<1|| luachon>2)
		{
			System.out.println("ban nhap khong hop le , vui long nhap lai.");
			
		}
		switch(luachon)
		{
		
		case 1:
		{
			System.out.println("nhap vao so luong ho dan:");
			n = Integer.parseInt(sc.nextLine());
			danhsachHD = new Biênlai[n];
			
			for(int i=0 ; i<danhsachHD.length;i++)
			{	danhsachHD[i] = new Biênlai();
				danhsachHD[i].NhapThongTin();
			}
			break; 
		}
		case 2 :
		{	System.out.println("thong tin ho dan:");
			for(int i=0;i<danhsachHD.length; i++)
			{
				
				danhsachHD[i].HienThiThongTin();
			}
			break;
		}
	 	case 3:
		{
			break;
		}	
		}
		}while(luachon!=3);
		
	}
}


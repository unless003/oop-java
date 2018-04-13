package quanlikhachhang;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class quanlikhachhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <KhachHang> danhsach = new ArrayList();
		int n ,luachon,Array[] ;
		
		System.out.println("==============================");
		System.out.println("1.nhap vao n khach hang. ");
		System.out.println("2. hien thi thong tin danh sach khach hang.");
		System.out.println("3.hien thi khach hang co tong luong lon hon x.");
		System.out.println("4.thoat chuong trinh");
		System.out.println("===============================");
		Scanner sc = new Scanner(System.in);
		do
		{
			
			System.out.println("moi ban nhap vao lua chon :");
			
			
			try {
				
				
				luachon = Integer.parseInt(sc.nextLine());
				
				
				
			} catch (NumberFormatException e) {
				
				luachon=0;
				System.out.println("ban can nhap vao so nguyen.");
				
			}
			switch(luachon)
		{
			case 1:
			{	System.out.print("nhap vao so luong khach hang :");
				n=Integer.parseInt(sc.nextLine());
				Array = new int[n]; // tao lap so luong phan tu cho mang
				for(int i=0; i<Array.length;i++)
				{
					KhachHang KH = new KhachHang();
					System.out.println("thong tin khach hang:"+(i+1));
					KH.NhapThongTin();
					danhsach.add(KH);//them khach hang duoc luu vao danh sach
				}
				break;
			}
			case 2 :
			{	System.out.println("Thong Tin Khach Hang co trong danh sach");
					for(int i=0;i<danhsach.size();i++)
					{	System.out.println("thong tin khach hang : "+(i+1));
						danhsach.get(i).HienThiThongTin();
						
					}
				
				break;
			}
			case 3:
				
			{	
				int x =0;
				System.out.print("nhap vao tong luong:");
				for(int i=0;i<danhsach.size();i++)
				{	System.out.println("thong tin khach hang co tong luong lon hon gia tri luong ban vua nhap");
					if(x>=danhsach.get(i).getTongLuong()) 
				{	danhsach.get(i).HienThiThongTin();
						
						
					}
					
					
				}
				
				break;
				
			}
			case 4 :
			{
				
				break;
			}
		}
		
		}while(luachon!=4);
		
	}

}

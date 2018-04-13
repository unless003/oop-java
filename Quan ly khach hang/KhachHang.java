package quanlikhachhang;
import java.util.Scanner;
public class KhachHang {
	
	private String maKH;
	private String hoten;
	private int namSinh;
	private int tongLuong;
	
  public	KhachHang() {
			
		
	}
  
  public KhachHang(String maKH)
  {
	  this.maKH = maKH;
	  
  }
  
	public KhachHang(String maKH , String hoten , int  namSinh , int tongluong)
	{
		
		this.maKH = maKH;
		this.hoten= hoten;
		this.namSinh = namSinh;
		this.tongLuong = tongLuong;
		
	}
	
	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public int getTongLuong() {
		return tongLuong;
	}

	public void setTongLuong(int tongLuong) {
		this.tongLuong = tongLuong;
	}

	public void NhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma khach hang :");
		maKH =	sc.nextLine();
		System.out.print("ten khach hang");
		hoten = sc.nextLine();
		System.out.print("nam sinh");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.print("tong luong khach hang ");
		tongLuong = Integer.parseInt(sc.nextLine());
		
	}
	public void HienThiThongTin()
	{
		System.out.println("ma khach hang : "+ maKH);
		System.out.println("ho ten : "+ hoten);
		System.out.println("nam sinh : " + namSinh);
		System.out.println("tong luong" + tongLuong);
		
	}
	
}

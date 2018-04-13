package quanlytiendien;
import java.util.*;
public class Khachhang {
	 
	private String hoten;
	private int sonha;
	private int socongto;
	
	
	public Khachhang()
	{
		
	}
	
	public Khachhang(String hoten, int sonha, int socongto )
	{
		this.hoten = hoten;
		this.sonha = sonha;
		this.socongto = socongto;
	}
	
	public void NhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho Ten Ho Dan Su Dung:");
		hoten = sc.nextLine();
		System.out.println("so nha:");
		sonha = Integer.parseInt(sc.nextLine());
		System.out.println("so cong to:");
		socongto = Integer.parseInt(sc.nextLine());
		
	}
	public void HienThiThongTin()
	{
		System.out.println("Ho Ten Ho Dan: " + hoten);
		System.out.println("So Nha :"+ sonha);
		System.out.println("So Cong To: " + socongto);
		
		
		
	}
	
}

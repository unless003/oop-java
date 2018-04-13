package quanlytiendien;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
public class Biênlai extends Khachhang  {
	private int soMoi;
	private int soCu;
	private int soTienTra;
	
	public Biênlai()
	{
		
	}
	
	public Biênlai(String hoten, int sonha, int socongto , int soMoi ,int soCu)
	{
		super( hoten, sonha , socongto );
		this.soCu = soCu;
		this.soMoi = soMoi;
	}
	
	@Override
	public void NhapThongTin(){
		Scanner sc =  new Scanner(System.in);
		super.NhapThongTin();
		System.out.println("chi so moi:");
		soMoi = Integer.parseInt(sc.nextLine());
		System.out.println("chi so cu:");
		soCu = Integer.parseInt(sc.nextLine());
	}	
	 
	@Override
	public void HienThiThongTin() {
		super.HienThiThongTin();
		System.out.println("chi so moi:"+soMoi);
		System.out.println("chi so cu"+ soCu);
		System.out.println("so tien phai tra" + TinhTienDien());
		
		
		
	}
	public int TinhTienDien()
	{
	 soTienTra =(soMoi-soCu)*850000;
	 return soTienTra;
	}
}
	
 
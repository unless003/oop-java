package QLHD;

import java.util.Scanner;

public class HoDan  extends NhanSu {
	
	private int sothanhvien;
	private String sonha;
	
	public HoDan()
	{
		
	} 
	public HoDan(String hoten,int tuoi,int namsinh,String nghenghiep,int sothanhvien,String sonha )
	{	super(hoten ,tuoi,namsinh,nghenghiep);
		this.sothanhvien = sothanhvien;
		this.sonha = sonha;
	}NhanSu[] danhsach = null;
	@Override
	public void NhapTT()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try {
				System.out.print	("so thanh vien :");
				sothanhvien = Integer.parseInt(sc.nextLine());
				if(sothanhvien<0)
				{
					throw new NumberFormatException();
					
					
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("ban can nhap so nguyen duong :");
			}
			
		}
		
		danhsach = new NhanSu[sothanhvien];
		System.out.print("so nha : ");
		sonha = sc.nextLine();
		for(int i=0 ; i<danhsach.length;i++)
		{	System.out.println("thong tin thanh vien thu : "+(i+1));
			danhsach[i] = new NhanSu();
			danhsach[i].NhapTT();
			
		}
	}@Override
	public void HienTT()
	{	System.out.println("so thanh vien:" +sothanhvien);
		System.out.println(" so nha :"+ sonha);
		for(int i =0 ;i<danhsach.length;i++)
		{	System.out.println("thong tin thanh vien thu : "+(i+1));
			danhsach[i].HienTT();
			
		}
		
		
	}
}

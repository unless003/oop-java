package QLHD;

import java.util.Scanner;

public class NhanSu {
	private String hoten;
	private int tuoi;
	private int namsinh;
	private String nghenghiep;

	public NhanSu()
	{

	}
	public NhanSu(String hoten,int tuoi,int namsinh,String nghenghiep)
	{
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.namsinh = namsinh;
		this.nghenghiep = nghenghiep;
	
	}
	public void NhapTT()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ho ten thanh vien : ");
		hoten  = sc.nextLine();
		while(true)
		{
			try {
				System.out.print("tuoi : ");
				tuoi   =Integer.parseInt(sc.nextLine());
				if(tuoi<0)
				{
					throw new NumberFormatException();
					
					
				}
				break; 
			} catch (NumberFormatException e) {
				System.out.println("ban nhap vao so nguyen duong .");
			}
			
			
		}
		while(true)
		{
			try {
				System.out.print("nam sinh :");
				namsinh = Integer.parseInt(sc.nextLine());
				if(namsinh<0)
				{
					
					throw new NumberFormatException();
					
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("ban can nhap vao so nguyen duong > 0");
			}
			
			
		}
		
		System.out.print("nghe nghiep : ");
		nghenghiep = sc.nextLine();
	}
	public void HienTT()
	{
		System.out.println("ho ten thanh vien : " +hoten);
		System.out.println(" tuoi :" + tuoi);
		System.out.println("nam sinh : " +namsinh);
		System.out.println(" nghe nghiep :  "+ nghenghiep);
		
	}
}



package quanlisach;

import java.util.ArrayList;
import java.util.Scanner;

public class quanlisach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<sach> danhsach = new ArrayList<>();
		int n;
		int luachon;
		int[]Array = null;
		
		
		System.out.println("-----------------------------");
		System.out.println("|                            |");
		System.out.println("| 1. nhap vao n quyen sach. |");
		System.out.println("| 2.hien thi toan bo quyen sach.");
		System.out.println("| 3.liet ke sach xb truoc nam n.");
		System.out.println("| 4. thoat chuong trinh.");
		System.out.println("-----------------------------");
		
		
		do {
			try {
				System.out.println("moi ban nhap lua chon.");
				luachon  =Integer.parseInt( new Scanner( System.in).nextLine());
				
			} catch (NumberFormatException e) {
				System.out.println("ban can nhap so nguyen.");
				luachon=0;
			}
			switch(luachon)
			{
			case 1 : 
			{
				System.out.println("so luong sach : ");
				n= Integer.parseInt(new Scanner(System.in).nextLine());
				Array = new int[n]; 
				for(int i =0 ; i<Array.length;i++)
				{	
					System.out.println(" Quyen sach thu : "+(i+1));
					sach s = new sach();
					s.NhapThongTin();
					danhsach.add(s);
					
				}
				break;
			}
			
			case 2 :
			{	System.out.println("\t\t\t-------------danh sach co trong danh sach------------");
				
				for(int i=0; i<danhsach.size();i++)
				{
					
					danhsach.get(i).HienThiThongTin();
				}
					
				
					break;
			}
			  
			case 3 : 
			{	
				int nam;
				int dem=0;
				while(true)
				{
					try {
						
						System.out.println("nhap vao namXB");
						nam = Integer.parseInt(new Scanner(System.in).nextLine());
						if(nam<0)
						{
							throw new NumberFormatException();
							
						}
						break;
						
					} catch ( NumberFormatException e) {
						System.out.println("ban can nhap so nguyen duong");
					}
					
				}
				
				
				for (int i=0;i<danhsach.size();i++)
		{
				if(nam>danhsach.get(i).getNamSX())
				{
					
					danhsach.get(i).HienThiThongTin();
					dem++;
				}
					
		}		System.out.println("\n");
				if(dem==0)
				{
					System.out.println("khong co quyen sach nao xuat ban truoc nam:"+nam);
					
				}
				
				break;
				
			}
			
			case 4 :
			{
				
				
			}
			}
			
		}while(luachon!=4);
	

		
		
		
	}

}

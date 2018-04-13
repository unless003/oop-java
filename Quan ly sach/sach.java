package quanlisach;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class sach {
	private String tensach;
	private String tentacgia;
	private int namSX;
   public sach(){
		
		
		
		
	}
   public sach(String tensach,String tentacgia,int namSX)
   {
	   this.tensach = tensach;
	   this.tentacgia = tentacgia;
	   this.namSX = namSX;
   }
   public void  NhapThongTin ()
   {	Scanner sc = new Scanner(System.in);
	   System.out.println("ten sach:");
	   tensach = new Scanner(System.in).nextLine();
	   System.out.println("ten tac gia");
	   tentacgia = new Scanner(System.in).nextLine();
	   while(true)
	   {
		   try {
			System.out.println("nam xuat ban :");
			 namSX = Integer.parseInt(sc.nextLine());
			   if(namSX<0)
			   {
				   throw new NumberFormatException();
				   
			   }
			   break;
		} catch (NumberFormatException e) {
		System.out.println("ban can nhap so nguyen duong > 0.");
		}
		   
	   }
	  
	   
   }
   
   
   public String getTensach() {
	return tensach;
}
public void setTensach(String tensach) {
	this.tensach = tensach;
}
public String getTentacgia() {
	return tentacgia;
}
public void setTentacgia(String tentacgia) {
	this.tentacgia = tentacgia;
}
public int getNamSX() {
	return namSX;
}
public void setNamSX(int namSX) {
	this.namSX = namSX;
}
public void HienThiThongTin()
   {
	   System.out.print("ten sach + "  +tensach );
	   System.out.println("\nten tac gia :"+tentacgia);
	   System.out.println("nam xuat ban : "+namSX);
   }
}

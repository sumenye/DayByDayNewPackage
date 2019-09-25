package May7;

import java.util.ArrayList;

public class ComputerFactory {

	public static void main(String[] args) {
		Computer iMac = new Computer();
		Computer macPro = new Computer();
		iMac.type="Mac desktop";
		iMac.OS = "MacOS";
		iMac.ram=128;
		iMac.screenSize = 27.0;
		iMac.color = "silver";
		iMac.isPersonal = true;


		System.out.println("----IMAC----");
		System.out.println(iMac.type);
		System.out.println(iMac.OS);
		System.out.println(iMac.screenSize);
		System.out.println(iMac.color);
		System.out.println(iMac.isPersonal);
	
//		macPro.type
//		macPro.OS
//		macPro.screenSize
//		macPro.color
//		macPro.isPersonal
		
		System.out.println("----MACPRO----");
		System.out.println(macPro.type);
		System.out.println(macPro.OS);
		System.out.println(macPro.screenSize);
		System.out.println(macPro.color);
		System.out.println(macPro.isPersonal);
		
	}

}

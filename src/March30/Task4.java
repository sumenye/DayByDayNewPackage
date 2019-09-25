package March30;

public class Task4 {

	public static void main(String[] args) {
		
String star = "*";
//use while loop to generate this shape
//*
//**
//***
//****
//*****
/*-------------------------------------------
	int x = 0;
	while (x< 5) {
		System.out.println(star);
		star = star+"*";
		x++;
	}
	//------------------------------------------------------*/
int x = 1;
String allStar = "";
while(x<=5) {
	allStar = allStar +star;
	System.out.println(allStar);
	x++;
}
System.out.println(allStar);

	
	}

}

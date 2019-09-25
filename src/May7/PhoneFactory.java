package May7;

public class PhoneFactory {

	public static void main(String[] args) {
		
Phone iphone = new Phone();
iphone.brand ="Apple";
iphone.OS = "IOS";
iphone.ring();
iphone.dial(425678936L);

iphone.displayBrand();

System.out.println();



System.out.println( iphone.OS  );

Phone samsung  = new Phone ();
samsung.brand = "Samsung" ; 
samsung.OS = "Android";
samsung.capacity= 124;
samsung.ring();
samsung.dial(425678936L);

System.out.println( samsung.capacity  );


Phone pixel  = new Phone ();
pixel.brand = "Google" ; 
pixel.OS = "Google OS";
pixel.capacity = 32;
pixel.ring();
pixel.dial(425678936L);

System.out.println( pixel.brand  );
	}

}

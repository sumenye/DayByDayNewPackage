package May14;

public class HouseCompany {

	public static void main(String[] args) {
		House h1 = new House("single house", 5, 120000);
		House h2 = new House("town house", 4, 20000);
		House h3 = new House("apartment", 2, 10000);
		House h4 = new House("single house", 4, 110000);
		
		h1.setBedroom(6);
		h3.setType("single house");
		
		//immutable object means 
		//when it is created it cannot be changed
		//if we command out the setters we make our object immutable
		
		//non-resizable---> arrays
		//it cannot change in size, cant shrink or expand
		//?can we change array--> yes , arr[0] = new value
		
		System.out.println(h1);//it uses toString automatically
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
	}

}

package May8;

public class ACTester {

	public static void main(String[] args) {
		
		AirConditioner ac1 = new AirConditioner();
		ac1.brand="Philips";
		ac1.currentTemp = 64.3f;
		ac1.isOn=true;

		
		ac1.displayTheBrand();
		ac1.displayAllInfo();
		ac1.turnOff();
		ac1.turnOn();
		ac1.showCurrentTemp();
		ac1.increaseTemp(10);
		System.out.println(ac1.currentTemp);
		ac1.decreaseTemp(20);
		ac1.showCurrentTemp();
		ac1.setTemperature(80f);
		
		System.out.println("***********");
		
		 AirConditioner ac = new AirConditioner(); 
		    ac.brand= "Samsung" ; 
		        ac.currentTemp=79.7f;
		        ac.isOn=true;
		        
		        ac.displayTheBrand();;
		        ac.displayAllInfo();
		        
		        ac.turnOff();
		        ac.turnOn();
		        ac.showCurrentTemp();
	}

}

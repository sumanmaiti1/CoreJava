package corejava.java_basic.oops.class_object;

class Address {
	String name;
	String village;
	int pinCode;
	
	void showAddress(){
		System.out.println(name + ", " + village + ", " + pinCode);
	}
}


class Human{
	String scientificName = "Homo Sapience";
	Address address = new Address();
}

public class DemoSimpleClass{
	public static void main(String[] args) {
		Human h = new Human();
		System.out.println(h.scientificName);
		h.address.name ="Sri Krishna";
		h.address.village ="Vrindaban";
		h.address.pinCode = 281121;
		h.address.showAddress();
	}
}
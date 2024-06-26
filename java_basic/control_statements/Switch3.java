// -------------- This will showcase Nested Switch Statements -------------
package corejava.java_basic.control_statements;

public class Switch3 {
	public static void main(String... args){
		String strCountryState = "Bharat-Kashmir";
		String[] arrCountryState = strCountryState.split("-");
		switch(arrCountryState[0]) {
            case "Bharat":
				System.out.println("Bharat is the Greatest Country");
                switch (arrCountryState[1]){
					case "Hariyana":
						System.out.println("Welcome to Hariyana Gurugram");
                        break;
					case "Kashmir":
						System.out.println("Welcome to kashmir. This is the Land of Rishi Kashyap");
                        break;
					default:
						System.out.println("Welcome to Bharat. This is the land of the Ramayana nd the Mahabharata");
                        break;
				} break;
            default:
                System.out.println("You are outside of Bharat");
                break;
		}
	}
}

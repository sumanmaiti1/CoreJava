package corejava.java_basic.oops.constructor;

public class SingleToneClass {
	public static void main(String... args) {
		
		DBConnection a = DBConnection.getDBConnection();
		DBConnection b = DBConnection.getDBConnection();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a==b);
	}
}

class DBConnection{
	private int port;
	private String pwd;
	private static DBConnection dbCon;
	
	// ------------- Private Constructor ------------
	private DBConnection() {
	}
	
	
	//--------------- Private method to Establish DB connection
	private void connectToDB() {
		dbCon.port = 1000;
		System.out.println("DB Connection Established");
	}
	
	//--------- public method to return DBConnection object -----------
	public static DBConnection getDBConnection() {
		if (dbCon != null) {
			
		} else {dbCon = new DBConnection();
		dbCon.connectToDB();}
		return dbCon;
	}
	
}


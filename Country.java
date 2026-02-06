class Country{
	public static void main(String[] Country){
	String country="India";
	String capital="New-Delhi";
	String stateNum="29";
	String UTNum="7";
	String UT[]={"Andaman and Nicobar Islands","Dadra and Nagar Haveli", "Daman and Diu", "Jammu and Kashmir", "Ladakh", "Lakshadweep", "Puducherry"};
	String states[]={"karnataka","andra pradesh","kerala","tamil nadu","telangana"};

	System.out.println("Information of the Country is:");
	System.out.println("The name of the Country is:"+country);
	System.out.println("The capital of the Country is:"+capital);
	System.out.println("The number of the states is:"+stateNum);
	System.out.println("The number of the union territories is:"+UTNum);
	System.out.println("The union territories of the india are:");


	for(String UTList:UT){
	System.out.println(UTList);
	}
	System.out.println("The states of the india are:");

	for(String statesList:states){
	System.out.println(statesList);
	}
	
	}
	}
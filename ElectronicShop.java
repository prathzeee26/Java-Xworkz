class ElectronicShop{
 public static void main(String[] ElectronicShop){
	String name="Gada electronics";
	String owner="Jetalal Gada";
	String address="Anderi East,Mumbai";
	String branches[]={"banglore","udupi","manglore","kumta","mysore","chennai"};
	String managers[]={"bhide","tarak mehta","sodhi","iyer","abdul","popatlal"};
	
	System.out.println("Information of the ElectronicShop is:");
	System.out.println("The name of the ElectronicShop is:"+name);
	System.out.println("The owner of the ElectronicShop is:"+owner);
	System.out.println("The address of the ElectronicShop is:"+address);
	System.out.println("The branches of the ElectronicShop is:");

	for(String location:branches){
	System.out.println(location);
	}
	System.out.println("The managers of the ElectronicShop is:");

	for(String manage:managers){
	System.out.println(manage);
	}
	
	}
	}


 
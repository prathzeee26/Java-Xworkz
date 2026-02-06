class Hospital{
	public static void main(String[] args){
		String hospitalName="City Care Hospital";
		String location="Bangalore";

		String departments[]={"Cardiology","Neurology","Orthopedics","Pediatrics","Dermatology","ENT"};

		System.out.println("hospital name:"+hospitalName);
		System.out.println("location:"+location);

		System.out.println("departments list");
		for(String departmentlist:departments){
			System.out.println(departmentlist);
		}
	}
}

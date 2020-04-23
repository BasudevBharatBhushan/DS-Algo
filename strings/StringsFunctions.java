package strings;

public class StringsFunctions {

	public static void main(String[] args) {

		String name = "Anuj Kumar Sharma";
		String name2 = new String("Anuj Kumar Sharma");
		
		
		System.out.println(name2.charAt(0));  
		
		System.out.println(name.length());
		
		System.out.println(name.substring(5));
		
		System.out.println(name.substring(5,12));
		
		System.out.println(name.contains("Anuj"));
		System.out.println(name.contains("Aman"));
		System.out.println(name.contains("Kumar"));
		System.out.println(name.contains("Sh"));
		
		System.out.println(name.contentEquals("Anuj Kumar Sharma"));
		System.out.println(name.equals(name2));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.concat(" is my JAVA Instructor"));
		
		System.out.println(name.replace('A','O'));
		
		
		String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lambhorgini";
		String allCars[] = cars.split(",");
		for(String car: allCars) {
			System.out.print(car+" ");
		}
		System.out.println();
		
		System.out.println(name.indexOf('S'));
		System.out.println(name.indexOf('z'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
		String name3 = "      Anuj     ";
		System.out.println(name3.trim());
	}

}
 
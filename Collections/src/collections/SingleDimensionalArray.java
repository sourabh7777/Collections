package collections;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		String city[] = new String[5];
		
		city[0] = "Bangalore";
		city[1] = "Chennai";
		city[2] = "Delhi";
		city[3] = "Mumbai";
		city[4] = "Bhubaneswar";
		
		for (String cityName : city) {
			System.out.println(cityName);
		}

	}

}

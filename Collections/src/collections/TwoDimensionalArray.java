package collections;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String[][] city = new String[2][2];
		
		city[0][0] = "Bangalore";
		city[0][1] = "Delhi";
		city[1][0] = "Mumbai";
		city[1][1] = "Chennai";
		
		for (int i = 0; i< city.length ; i++) {
			for(int j = 0;j<city.length;j++) {
				System.out.println(city[i][j]);
			}
		}
								

	}

}

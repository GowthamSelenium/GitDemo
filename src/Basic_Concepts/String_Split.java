package Basic_Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class String_Split {

	public static void main(String[] args) {
		String Cities = "pune,mumbai,tamilnadu,pune,kerala,chennai,madras,pune";
		String[] CityArray = Cities.split(",");
		Set<String> City = new HashSet<String>();
		for(int i=0; i< CityArray.length; i++) {
		City.add(CityArray[i]);}
		System.out.println(City);
		
		String Pincodes = "641048,641014,641036";
		String[] PinCodeArray = Pincodes.split(",");
		for(int i=0;i<PinCodeArray.length;i++) {
			//System.out.println(PinCodeArray[i]);
			List<Integer> pin = new ArrayList<Integer>();
			pin.add(Integer.parseInt(PinCodeArray[i]));
			System.out.println(pin);
			System.out.println("Hello world");
			System.out.println("Gowtham Here");
			System.out.println("Created new master branch");
			System.out.println("created new master branch for another one too");
			
		}
		
	}

}

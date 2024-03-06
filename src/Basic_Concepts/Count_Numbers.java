package Basic_Concepts;

public class Count_Numbers {

	public static void main(String[] args) {
		String string = "123gowtham456kabi";
		//To find the count of numbers in string
		int sum = 0;
		StringBuilder currentNumber = new StringBuilder();
		for(char c : string.toCharArray()) {
			if(Character.isDigit(c)) {
				currentNumber.append(c);
			}
			else
				if(currentNumber.length()>0) {
					sum+=Integer.parseInt(currentNumber.toString());
					currentNumber.setLength(0);
				}
		}
		if(currentNumber.length()>0) {
			sum+=Integer.parseInt(currentNumber.toString());
		
		}
		System.out.println(sum);
	}

}
package Basic_Concepts;

public class letter_count {

	public static void main(String[] args) {
		String str = "Hello";
		char[] array = str.toCharArray();
		char lettercount = 'l';
		int count = 0;
		for(int i=0; i<array.length;i++) {
			if(array[i]==lettercount) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("Completed");
	}

}

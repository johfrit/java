import java.util.*;

public class Hello {

    public static void main(String[] args) {
		// Input scanner
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		// Create a list to hold each character of the string as a String element
		List<String> si = new ArrayList<>();

		// Convert each character of the string to a String and add to list
		for (char ch : s.toCharArray()) {
		    si.add(Character.toString(ch));  // Convert char to String
		}

		// Check if the list has more than 1 element before removing
		si.remove(0);
    si.remove(si.size()-1);

		// Print remaining elements in the list
		for (int i = 0; i < si.size(); i++) {
		    System.out.print(si.get(i));
		}
	}
}

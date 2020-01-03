package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<10; i++) {
			JOptionPane.showMessageDialog(null, list);
			if (i%2==0) {
				JOptionPane.showMessageDialog(null, list);
			}
			JOptionPane.showMessageDialog(null, list);
			if (list.contains("e")) {
				
			
			JOptionPane.showMessageDialog(null, list);
		}
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}

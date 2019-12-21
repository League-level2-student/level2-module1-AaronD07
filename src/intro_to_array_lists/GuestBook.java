package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	String list = "";

	public static void main(String[] args) {
		GuestBook book = new GuestBook();

		book.createUI();
	}

	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();

	public void createUI() {
		panel.add(button);
		button.addActionListener(this);
		panel.add(button2);
		frame.add(panel);
		button.setText("Add name");
		button2.setText("View Names");
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String add = JOptionPane.showInputDialog("Enter a name");
			names.add(add);
		} 
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "Hi");
			for (int i = 0; i < names.size(); i++) {

				JOptionPane.showMessageDialog(null, names.get(i));
			}
		}
	}

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

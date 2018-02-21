package random;

import javax.swing.JOptionPane;

public class PhotoBooth {
	public static void main(String[] args) {
		
	
	String Input=JOptionPane.showInputDialog("What is your age");
	
	int age= Integer.parseInt(Input);
		
	
	if(age>18) {
//		JOptionPane.showMessageDialog(null,"Who do you think the next president should be?");
	}
	
	else {
	JOptionPane.showMessageDialog(null,"Who cares what you think");	
	}
	
	}	
	
}


import javax.swing.*;
import java.awt.*;
public class TempWindow extends JFrame {
    private Container pane;

    private JButton CtoF;
    private JButton FtoC;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
 
    //CONSTRUCTOR SETS EVERYTHING UP
    public Window2() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
	CtoF = new JButton("CtoF");
	FtoC = new JButton("FtoC");
	l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
	t = new JTextField(12);
	c = new JCheckBox("Overclock!!!");

	public void actionPerformed(ActionEvent e){
	    String cmd = e.getActionCommand();
	}

	
	pane.add(l);
	pane.add(b);
	pane.add(t);
	pane.add(c);
 }

    //MAIN JUST INSTANTIATES + MAKE VISIBLE
    public static void main(String[] args) {
	Window2 g = new Window2();
	g.setVisible(true);
    }
}

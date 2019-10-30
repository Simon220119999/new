import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZweiteSeite extends JFrame implements ActionListener {


	public void actionPerformed (ActionEvent e)
    {    setVisible(true);
    }
	
	
	public ZweiteSeite() {
	//	setSize(1600, 850);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*ohne Taskleiste	
		setResizable(false);*/

		setContentPane(new BackGroundPane("C:\\\\Users\\\\Simon\\\\Documents\\\\Studium\\\\Semester 3\\\\Programmierpraktikum\\\\wow2.jpg"));

	
		Box box = Box.createVerticalBox();
		{
    
			box.add(Box.createVerticalStrut(100));
			
			
			JButton button4 = new JButton("Battleships");
			button4.setAlignmentX(Component.CENTER_ALIGNMENT);
			button4.setPreferredSize(new Dimension(400,80));
			button4.setBackground(Color.gray);
			Font i = new Font("Arial", Font.BOLD,60);
			button4.setFont(i);
			button4.addActionListener(
					(e) -> { System.out.println("Knopf gedrückt"); }
					);
		    box.add(button4);
		    box.add(Box.createVerticalStrut(200));
			
		    
			JButton button = new JButton("Einzelspieler");
			button.setAlignmentX(Component.CENTER_ALIGNMENT);
			button.setPreferredSize(new Dimension(300,50));
			button.setBackground(Color.gray);
			Font f = new Font("Arial", Font.BOLD,30);
			button.setFont(f);
			button.addActionListener(
					(e) -> { System.out.println("Knopf gedrückt"); }
					);
			box.add(button);
			box.add(Box.createVerticalStrut(30));
			
			
			
			JButton button2 = new JButton(" Mehrspieler ");
			button2.setAlignmentX(Component.CENTER_ALIGNMENT);
			button2.setPreferredSize(new Dimension(300,50));
			button2.setBackground(Color.gray);
			Font g = new Font("Arial", Font.BOLD,30);
			button2.setFont(g);
			button2.addActionListener(
					(e) -> { System.out.println("Knopf gedrückt"); }
					);
		    box.add(button2);
		    box.add(Box.createVerticalStrut(30));
		    
		    

			JButton button3 = new JButton("    KI vs. KI    ");
			button3.setAlignmentX(Component.CENTER_ALIGNMENT);
			button3.setPreferredSize(new Dimension(150,50));
			button3.setBackground(Color.gray);
			Font h = new Font("Arial", Font.BOLD,30);
			button3.setFont(h);
			button3.addActionListener(
					(e) -> { System.out.println("Knopf gedrückt"); }
					);
			box.add(button3);
			box.add(Box.createVerticalStrut(130));
			 
			 
			JButton button5 = new JButton(" Back ");
			button5.setAlignmentX(Component.CENTER_ALIGNMENT);
			button5.setPreferredSize(new Dimension(300,50));
			button5.setBackground(Color.gray);
			Font j = new Font("Arial", Font.BOLD,30);
			button5.setFont(j);
			button5.addActionListener(
					(e) -> { System.out.println("Knopf gedrückt"); }
					);
			box.add(button5);
			 
			 
			 
			 
		}
		add(box);
		
		
		
		
		
		
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new ZweiteSeite();	
	}

	class BackGroundPane extends JPanel {
		Image img = null;

		BackGroundPane(String imagefile) {
			if (imagefile != null) {
				MediaTracker mt = new MediaTracker(this);
				img = Toolkit.getDefaultToolkit().getImage(imagefile);
				mt.addImage(img, 0);
				try {
					mt.waitForAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
		}
	}
	
}
	
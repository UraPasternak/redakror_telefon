package redakror_telefon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


class MyFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 300;
	
	public MyFrame()   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("Телефони");
      JButton button = new JButton("Форматувати");
      JLabel headingLabel = new JLabel("Введіть шлях файлу, який форматувати");
      JTextField nameInput = new JTextField(100);
      button.setBounds(190, 190, 115, 55);
      headingLabel.setBounds(50, 20, 400, 20);
      nameInput.setBounds(50, 45, 400, 20);
      add(headingLabel);
      add(nameInput);
      add(button);
      button.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  try(FileReader reader = new FileReader(nameInput.getText()))
    	        {
    				Filtr filtr = new Filtr();
    				String s;
    	            int c;
    	            FileWriter nfile = new FileWriter("C:/Users/Manager1/eclipse-workspace/redakror_telefon/txt/file.txt");
    	            while((c=reader.read())!=-1){
    	                 s = Character.toString((char)c);
    	                 nfile.write(filtr.cifry(s)); 
    	             } 
    	            nfile.close();
    	        }
    	        catch(IOException ex){
    	             
    	            System.out.println(ex.getMessage());
    	        }   
    			
    			try(FileReader reader = new FileReader("C:/Users/Manager1/eclipse-workspace/redakror_telefon/txt/file.txt"))
    	        {
    				
    				Filtr filtr = new Filtr();
    	            BufferedReader buf = new BufferedReader(reader);
    	            String line = buf.readLine();
    	            FileWriter nfile1 = new FileWriter("C:/Users/Manager1/eclipse-workspace/redakror_telefon/txt/tel_ok.txt");
    	            while (line != null) {
    	            	nfile1.write(filtr.tel063(line));
    	            	nfile1.write(filtr.tel073(line));
    	            	nfile1.write(filtr.tel093(line));
    	            	nfile1.write(filtr.tel067(line));
    	            	nfile1.write(filtr.tel068(line));
    	            	nfile1.write(filtr.tel096(line));
    	            	nfile1.write(filtr.tel097(line));
    	            	nfile1.write(filtr.tel098(line));
    	            	nfile1.write(filtr.tel050(line));
    	            	nfile1.write(filtr.tel066(line));
    	            	nfile1.write(filtr.tel095(line));
    	            	nfile1.write(filtr.tel099(line) + "\n");
    	                line = buf.readLine();
    	            }
    	            nfile1.close();
    	            JOptionPane.showMessageDialog(new JFrame(), "Відформатовано");
    	        }
    	        catch(IOException ex){
    	             
    	            System.out.println(ex.getMessage());
    	            JOptionPane.showMessageDialog(new JFrame(), "Помилка!!!");
    	        }
    			
    			
    	    }
    		  
    	  }
      );
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      setVisible(true);
   }
   
}

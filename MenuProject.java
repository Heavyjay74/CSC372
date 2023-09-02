import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class MenuProject  extends JFrame implements ActionListener, ItemListener {


    JPanel p = new JPanel();
    JFrame myFrame = new JFrame("Jason's Frame");
    JTextField dateField;


    MenuProject()  {
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600,800);
        myFrame.getContentPane().setBackground( Color.red );

        dateField = new JTextField("date and time", 16);
        JMenuBar mb = new JMenuBar();

        //1st menu item to display date/time
        JMenu menu = new JMenu("Jason's Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "Display date/time");
        mb.add(menu);

        //Create first menu item to display date/time
        JMenuItem menuItem1 = new JMenuItem("Get Date/Time",
                KeyEvent.VK_T);
        menuItem1.addActionListener(new MenuListener1());
        //menuItem1.setAccelerator(KeyStroke.getKeyStroke(
         //       KeyEvent.VK_1, InputEvent.ALT_MASK));
        menuItem1.getAccessibleContext().setAccessibleDescription(
                "Get Date/Time");
        menu.add(menuItem1);

        //Create second menu item to get text and write to file log.txt
        JMenuItem menuItem2= new JMenuItem("Write to File");
        menuItem2.addActionListener(new MenuListener2());
        menu.add(menuItem2);

        //Create third menu item to change background color of panel to random hue of green
        JMenuItem menuItem3 = new JMenuItem("Change Background Color");
        menuItem3.addActionListener(new MenuListener3());
        menu.add(menuItem3);

        //Create fourth menu item to exit
        JMenuItem menuItem4 = new JMenuItem("Exit");
        //menuItem4.setActionCommand(myFrame.dispose());
        menuItem4.addActionListener(new MenuListener4());
        menu.add(menuItem4);

        p.add(dateField);
        p.setBackground(Color.red);
        myFrame.add(p, BorderLayout.CENTER);
        myFrame.setJMenuBar(mb);
        //myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
    }

    class MenuListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date d = new Date();
            dateField.setText(d.toString());
        }
    }
    class MenuListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //TODO add text in dateField to log.txt
            String text = dateField.getText();
            try {
                MenuProjectIO.writeToFile(text);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                MenuProjectIO.readFromFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    class MenuListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //TODO Change Background color to random hue of green
            Random rand = new Random();
            int green = rand.nextInt(256);
           p.setBackground(new Color(0, green, 0));
        }
    }
    class MenuListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        MenuProjectIO.readFromFile();
        new MenuProject();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {
    private JButton jbn1 = new JButton("Generate");
    private JButton jbn2 = new JButton("exit");
    private JLabel jbn [] = new JLabel[6];
    private Container cp;
    private JPanel jpcenter = new JPanel(new GridLayout(1,6,3,3));
    private JPanel jpsouth = new JPanel(new GridLayout(1,2,3,3));
    Random ran = new Random();
    public MainFrame(){
       init();
    }
    private void init(){
     this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     this.setBounds(100,50,800,200);
     this.cp = this.getContentPane();
     this.cp.setLayout(new BorderLayout(3,3));
     this.cp.add(this.jpcenter,"Center");
     this.cp.add(this.jpsouth,"South");
     this.jpsouth.add(this.jbn1);
     jbn1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         for(int i=0 ; i<6 ; i++){
             jbn[i].setEnabled(true);
             jbn[i].setText(Integer.toString(ran.nextInt(49)+1));
         }

         }
     });
     this.jpsouth.add(this.jbn2);
     jbn2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             System.exit(0);
         }
     });
     for(int i=0 ; i<6 ; i++){
      jbn[i] = new JLabel();
      this.jpcenter.add(this.jbn[i]);
      jbn[i].setOpaque(true);
      jbn[i].setBackground(new Color(0,150,255));
      jbn[i].setFont(new Font(null,Font.BOLD,72));
      jbn[i].setEnabled(false);


     }
    }
}

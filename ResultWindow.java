import javax.swing.*;
import java.awt.event.*;


public class ResultWindow extends JFrame implements ActionListener {
    
    ResultWindow(String winner){
    this.setSize(426,240);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setIconImage(new ImageIcon("icon.jpg").getImage());
    JButton close = new JButton("close");
    close.setVisible(true);
    close.setBounds(165,120,80,45);
    close.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    });
    JLabel result = new JLabel(winner + " has won!");
    result.setBounds(150,10,100,70);
    result.setHorizontalAlignment(JLabel.CENTER);
    this.add(close);
    this.add(result);
    this.setVisible(true);
    this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}

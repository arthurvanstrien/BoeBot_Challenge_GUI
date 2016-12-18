import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class Main here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class Main extends JFrame
{
    JPanel panel;
    JButton goButton;
    JButton stopButton;
    
    public Main()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel(new BorderLayout());
        setContentPane(panel);
        
        panel.add(createControlButtons(), BorderLayout.CENTER);
        
        setSize(600, 300);
        setVisible(true);
    }
    
    private JPanel createControlButtons()
    {
        JPanel buttons = new JPanel(new GridLayout(1, 2));
        
        ImageIcon goImage = new ImageIcon("go.png");
        goButton = new JButton(goImage);
        goButton.setBackground(Color.WHITE);
        buttons.add(goButton);
        
        ImageIcon stopImage = new ImageIcon("stopSmall.jpg");
        stopButton = new JButton(stopImage);
        stopButton.setBackground(Color.WHITE);
        buttons.add(stopButton);
        
        return buttons;
    }
}

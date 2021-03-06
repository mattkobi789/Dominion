package mkobilas.game.Dominion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions
{
    public void PrintInstructions()
    {
        final JFrame frame = new JFrame("Instructions");
        //JPanel
        JPanel pnlButton = new JPanel();
        //Buttons
        JButton Back = new JButton("Back");
        Back.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                UserInterface.createMenu();
                frame.setVisible(false);
            }
        });        
        //Label for the whole instructions
        JLabel textInstructionsLine1 = new JLabel("Player one, the purple character with red moves must kill",JLabel.CENTER);
        JLabel textInstructionsLine2 = new JLabel("\nplayer two, the blue character with green moves or the other way around.\n",JLabel.CENTER);
        JLabel textInstructionsLine3 = new JLabel("To move, player one uses 'wsad' while player two uses the arrow keys.",JLabel.CENTER);
        JLabel textInstructionsLine4 = new JLabel("\nIn order to kill the enemy, you must also use abilities, 'erty' for player one",JLabel.CENTER);
        JLabel textInstructionsLine5 = new JLabel("\nand 'uiop' for player two.",JLabel.CENTER);
        pnlButton.setLayout(null);
        //Set bounds
        Back.setBounds(250,500,100,30);
        textInstructionsLine1.setBounds(50,100,500,30);
        textInstructionsLine1.setForeground(Color.CYAN);
        textInstructionsLine2.setBounds(50,130,500,30);
        textInstructionsLine2.setForeground(Color.CYAN);
        textInstructionsLine3.setBounds(50,160,500,30);
        textInstructionsLine3.setForeground(Color.CYAN);
        textInstructionsLine4.setBounds(50,190,500,30);
        textInstructionsLine4.setForeground(Color.CYAN);
        textInstructionsLine5.setBounds(50,210,500,30);
        textInstructionsLine5.setForeground(Color.CYAN);
        //JPanel bounds
        pnlButton.setBounds(0, 0, 600, 600);
        pnlButton.setBackground(Color.GRAY);
        //Adding to JFrame
        pnlButton.add(Back);
        pnlButton.add(textInstructionsLine1);
        pnlButton.add(textInstructionsLine2);
        pnlButton.add(textInstructionsLine3);
        pnlButton.add(textInstructionsLine4);
        pnlButton.add(textInstructionsLine5);
        frame.add(pnlButton);
        // JFrame properties
        frame.setSize(600, 600);
        frame.setBackground(Color.GRAY);
        frame.setTitle("Instructions");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

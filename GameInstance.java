package mkobilas.game.Dominion;
import javax.swing.*;

public class GameInstance
{
    public static Dominion f = new Dominion();
    public static int w = 1024;
    public static int h = 768;
    public static void main(String args[])
    {
        f.setSize(w, h);
        f.setResizable(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("DOMINION!");
        f.setLocationRelativeTo(null);
        f.setAlwaysOnTop(true);
    }
}
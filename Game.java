package mkobilas.game.Dominion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.geom.Ellipse2D;

public class Game extends JPanel
{
    private static final long serialVersionUID = 8646217681419756592L;
    public Dominion f;
    public static boolean alwaysTrue = true;
    public static Ellipse2D.Double force;
    public static  Rectangle sword;
    public static  Ellipse2D.Double bomb;
    public static Rectangle player;
    public static Ellipse2D.Double force2;
    public static Rectangle sword2;
    public static Ellipse2D.Double bomb2;
    public static Rectangle player2;
    public static int charW = 24;
    public static int charH = 36;
    public static int forcW = 20;
    public static int forcH = 20;
    public static int sworW = 50;
    public static int sworH = 10;
    public static int bombW = 20;
    public static int bombH = 20;
    public static boolean right = false;
    public static boolean left = false;
    public static boolean up = false;
    public static boolean down = false;
    public static boolean attacking = false;
    public static boolean charging = false;
    public static boolean bombing = false;
    public static boolean right2 = false;
    public static boolean left2 = false;
    public static boolean up2 = false;
    public static boolean down2 = false;
    public static boolean attacking2 = false;
    public static boolean charging2 = false;
    public static boolean bombing2 = false;
    public Game(Dominion f)
    {
        this.f = f;
        player = new Rectangle(1, 1, charW, charH);
        player2 = new Rectangle(992, 700, charW, charH);
        f.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_D)
                {
                    right = true;
                    player.x++;
                }
                if(e.getKeyCode() == KeyEvent.VK_A)
                {
                    left = true;
                    player.x--;
                }
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    up = true;
                    player.y--;
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    down = true;
                    player.y++;
                }
                if(e.getKeyCode() == KeyEvent.VK_E)
                {
                    if(right)
                    {
                        player.x += 35;
                    }
                    if(left)
                    {
                        player.x -= 35;
                    }
                    if(down)
                    {
                        player.y += 35;
                    }
                    if(up)
                    {
                        player.y -= 35;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_R)
                {
                    charging = true;
                    force = new Ellipse2D.Double(player.x, player.y+10, forcW, forcH);
                    
                }
                if(e.getKeyCode() == KeyEvent.VK_T)
                {
                    attacking = true;
                    sword = new Rectangle(player.x, player.y, sworW, sworH);
                }
                if(e.getKeyCode() == KeyEvent.VK_Y)
                {
                    bombing = true;
                    bomb = new Ellipse2D.Double(player.x-9, player.y-3, bombW, bombH);
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    right2 = true;
                    player2.x++;
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    left2 = true;
                    player2.x--;
                }
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    up2 = true;
                    player2.y--;
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    down2 = true;
                    player2.y++;
                }
                if(e.getKeyCode() == KeyEvent.VK_U)
                {
                    if(right2)
                    {
                        player2.x += 35;
                    }
                    if(left2)
                    {
                        player2.x -= 35;
                    }
                    if(down2)
                    {
                        player2.y += 35;
                    }
                    if(up2)
                    {
                        player2.y -= 35;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_I)
                {
                    charging2 = true;
                    force2 = new Ellipse2D.Double(player2.x, player2.y+10, forcW, forcH);
                    
                }
                if(e.getKeyCode() == KeyEvent.VK_O)
                {
                    attacking2 = true;
                    sword2 = new Rectangle(player2.x, player2.y, sworW, sworH);
                }
                if(e.getKeyCode() == KeyEvent.VK_P)
                {
                    bombing2 = true;
                    bomb2 = new Ellipse2D.Double(player2.x-9, player2.y-3, bombW, bombH);
                }
            }
            public void keyReleased(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_D)
                {
                    right = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_A)
                {
                    left = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    up = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    down = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_R)
                {
                    charging = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_T)
                {
                    attacking = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    right2 = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    left2 = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    up2 = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    down2 = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_I)
                {
                    charging2 = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_O)
                {
                    attacking2 = false;
                }
            }
        });
        
    }
    public int get1X()
    {
        return player.x;
    }
    public int get1Y()
    {
        return player.y;
    }
    public int get2X()
    {
        return player2.x;
    }
    public int get2Y()
    {
        return player2.y;
    }
    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        this.setBackground(Color.GRAY);
        g.setColor(Color.MAGENTA);
        g.fillRect(player.x, player.y, player.width, player.height);
        g.setColor(Color.BLUE);
        g.fillRect(player2.x, player2.y, player2.width, player2.height);
        if(right)
        {
            player.x++;
        }
        if(left)
        {
            player.x--;
        }
        if(up)
        {
            player.y--;
        }
        if(down)
        {
            player.y++;
        }
        if(charging)
        {
            g2.setPaint(Color.RED);
            g2.fill(force);
            force.x++;
            if(player2.contains(force.x, force.y))
            {
                f.setVisible(false);
                PrintWinner.Print();
                reset();
                repaint();
            }
        }
        if(attacking)
        {
            g.setColor(Color.RED);
            g.fillRect(sword.x, sword.y, sword.width, sword.height);
            sword.x = player.x + 10;
            sword.y = player.y + 10;
            if(player2.contains(sword.x, sword.y))
            {
                f.setVisible(false);
                PrintWinner.Print();
                reset();
                repaint();
            }
        }
        if(bombing)
        {
            g2.setPaint(Color.RED);
            g2.fill(bomb);
            if(player2.contains(bomb.x+10, bomb.y+10))
            {
                f.setVisible(false);
                PrintWinner.Print();
                reset();
                repaint();
            }
        }
        if(right2)
        {
            player2.x++;
        }
        if(left2)
        {
            player2.x--;
        }
        if(up2)
        {
            player2.y--;
        }
        if(down2)
        {
            player2.y++;
        }
        if(charging2)
        {
            g2.setPaint(Color.GREEN);
            g2.fill(force2);
            force2.x--;
            if(player.contains(force2.x, force2.y))
            {
                f.setVisible(false);
                PrintWinnerTwo.Print();
                reset();
                repaint();
            }
        }
        if(attacking2)
        {
            g.setColor(Color.GREEN);
            g.fillRect(sword2.x, sword2.y, sword2.width, sword2.height);
            sword2.x = player2.x - 35;
            sword2.y = player2.y + 10;
            if(player.contains(sword2.x, sword2.y))
            {
                f.setVisible(false);
                PrintWinnerTwo.Print();
                reset();
                repaint();
            }
        }
        if(bombing2)
        {
            g2.setPaint(Color.GREEN);
            g2.fill(bomb2);
            if(player.contains(bomb2.x+10, bomb2.y+10))
            {
                f.setVisible(false);
                PrintWinnerTwo.Print();
                reset();
                repaint();
            }
        }
        if(player.x > 992)
        {
            player.x -= 5;
        }
        if(player.x < 0)
        {
            player.x += 5;
        }
        if(player.y > 700)
        {
            player.y -= 5;
        }
        if(player.y < 0)
        {
            player.y += 5;
        }
        if(player2.x > 992)
        {
            player2.x -= 5;
        }
        if(player2.x < 0)
        {
            player2.x += 5;
        }
        if(player2.y > 700)
        {
            player2.y -= 5;
        }
        if(player2.y < 0)
        {
            player2.y += 5;
        }
        repaint();
    }
    public static void reset()
    {
        player.x = 1;
        player.y = 1;
        player2.x = 992;
        player2.y = 700;
        sword.x = 1;
        sword.y = 1;
        sword2.x = 992;
        sword2.y = 700;
        force.x = 1;
        force.y = 1;
        force2.x = 992;
        force2.y = 700;
        bomb.x = 1;
        bomb.y = 1;
        bomb2.x = 992;
        bomb2.y = 700;
        right = false;
        left = false;
        up = false;
        down = false;
        attacking = false;
        charging = false;
        bombing = false;
        right2 = false;
        left2 = false;
        up2 = false;
        down2 = false;
        attacking2 = false;
        charging2 = false;
        bombing2 = false;
    }

}

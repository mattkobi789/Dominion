package mkobilas.game.Dominion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Keying extends JPanel
{
    private static final long serialVersionUID = 3432853369750582697L;
    public Rectangle character;
    public Rectangle character2;
    public int charW = 24;
    public int charH = 36;
    public boolean right = false;
    public boolean left = false;
    public boolean up = false;
    public boolean down = false;
    public boolean right2 = false;
    public boolean left2 = false;
    public boolean up2 = false;
    public boolean down2 = false;
    public Keying(Dominion f, Images i)
    {
        character = new Rectangle(180, 180, charW, charH);
        character2 = new Rectangle(180, 180, charW, charH);
        f.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_D)
                {
                    right = true;
                    character.x++;
                }
                if(e.getKeyCode() == KeyEvent.VK_A)
                {
                    left = true;
                    character.x--;
                }
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    up = true;
                    character.y--;
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    down = true;
                    character.y++;
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    right2 = true;
                    character2.x++;
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    left2 = true;
                    character2.x--;
                }
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    up2 = true;
                    character2.y--;
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    down2 = true;
                    character2.y++;
                }
                if(e.getKeyCode() == KeyEvent.VK_U)
                {
                    if(right || left)
                    {
                        character.x += 20;
                    }
                    if(up || down)
                    {
                        character.y += 20;
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_I)
                {
                    Shooting.ShootBullet(character.x, character.y, up, down, left, right);
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
            }
        });
    }
    public int get1X()
    {
        return character.x;
    }
    public int get1Y()
    {
        return character.y;
    }
    public int get2X()
    {
        return character2.x;
    }
    public int get2Y()
    {
        return character2.y;
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.GRAY);
        g.setColor(Color.WHITE);
        g.fillRect(character.x, character.y, character.width, character.height);
        g.setColor(Color.BLUE);
        g.fillRect(character2.x, character2.y, character2.width, character2.height);
        if(right)
        {
            character.x++;
        }
        if(left)
        {
            character.x--;
        }
        if(up)
        {
            character.y--;
        }
        if(down)
        {
            character.y++;
        }
        if(right2)
        {
            character2.x++;
        }
        if(left2)
        {
            character2.x--;
        }
        if(up2)
        {
            character2.y--;
        }
        if(down2)
        {
            character2.y++;
        }
        if(character.x > 992)
        {
            character.x -= 5;
        }
        if(character.x < 0)
        {
            character.x += 5;
        }
        if(character.y > 700)
        {
            character.y -= 5;
        }
        if(character.y < 0)
        {
            character.y += 5;
        }
        if(character2.x > 992)
        {
            character2.x -= 5;
        }
        if(character2.x < 0)
        {
            character2.x += 5;
        }
        if(character2.y > 700)
        {
            character2.y -= 5;
        }
        if(character2.y < 0)
        {
            character2.y += 5;
        }
        repaint();
    }
}

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class event extends Applet implements MouseListener,MouseMotionListener
{
    int x=0;
    int y=0;
    String msg="";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        x=200;
        y=400;
        msg="Mouse Clicked";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        x=300;
        y=600;
        msg="Mouse Pressed";

        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        x=300;
        y=600;
        msg="Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        x=400;
        y=800;
        msg="Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        x=400;
        y=800;
        msg="Mouse Exited";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        x=me.getX();
        y=me.getY();
        showStatus("Currently mouse dragged"+mx+" "+my);

        repaint(); }
    public void mouseMoved(MouseEvent me)
    {
        x=me.getX();
        y=me.getY();
        showStatus("Currently mouse is at"+x+" "+y);
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Handling Mouse Events",300,200);
        g.drawString(msg,600,400);
    }
}

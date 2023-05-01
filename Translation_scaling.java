import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Translation_scaling extends JFrame implements MouseListener
{
    Graphics g;
    /*double xarr[] = {500,600,400};
    double yarr[] = {500,700,700};*/

    double xarr[] = {300,400,200};
    double yarr[] = {300,500,500};

    Translation_scaling()
    {
        setSize(1000,1000);
        setTitle("Translation & Scaling");
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        g=getGraphics();
    }

    public void mouseEntered(MouseEvent m){}
    public void mouseClicked(MouseEvent m)
    {
        g.drawLine((int)xarr[0], (int)yarr[0], (int)xarr[1], (int)yarr[1]);
        g.drawLine((int)xarr[1], (int)yarr[1], (int)xarr[2], (int)yarr[2]);
        g.drawLine((int)xarr[2], (int)yarr[2], (int)xarr[0], (int)yarr[0]);

        g.setColor(Color.blue);
        //Scaling(0.5, 0.5);
        Translate(10, 10);
        g.drawLine((int)xarr[0], (int)yarr[0], (int)xarr[1], (int)yarr[1]);
        g.drawLine((int)xarr[1], (int)yarr[1], (int)xarr[2], (int)yarr[2]);
        g.drawLine((int)xarr[2], (int)yarr[2], (int)xarr[0], (int)yarr[0]);
    }
    public void mousePressed(MouseEvent m){}
    public void mouseReleased(MouseEvent m){}
    public void mouseExited(MouseEvent m){}

    //Translation - change position
    public void Translate(double tx, double ty)
    {
        for(int i=0; i<3; i++)
        {
            xarr[i] = xarr[i]+tx;
            yarr[i] = yarr[i]+ty;
        }
    }

    //Scaling - resizing
    public void Scaling(double sx, double sy)
    {
        for(int i=0; i<3; i++)
        {
            xarr[i] = xarr[i]*sx;
            yarr[i] = yarr[i]*sy;
        }
    }

    public static void main(String []args)
    {
        new Translation_scaling();
    }
} 
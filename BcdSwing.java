import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BcdSwing extends JFrame implements MouseListener, MouseMotionListener {

int mx = 0;
int my = 0;
String msg = "";
public BcdSwing() {
setTitle("Mouse Event Handling");
setSize(400, 250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
addMouseListener(this);
addMouseMotionListener(this);
setVisible(true);
}
public void mouseClicked(MouseEvent me) {
mx = 20;
my = 40;
msg = "Mouse Clicked";
repaint();
}
public void mousePressed(MouseEvent me) {
mx = 30;
my = 60;
msg = "Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent me) {
mx = 30;
my = 60;
msg = "Mouse Released";
repaint();
}
public void mouseEntered(MouseEvent me) {
mx = 40;
my = 80;
msg = "Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent me) {
mx = 40;
my = 80;
msg = "Mouse Exited";
repaint();
}
public void mouseDragged(MouseEvent me) {
mx = me.getX();
my = me.getY();
setTitle("Currently mouse at " + mx + " and " + my);  
repaint();
}
public void mouseMoved(MouseEvent me) {
mx = me.getX();
my = me.getY();
setTitle("Currently mouse at " + mx + " and " + my); 
repaint();
}
public void paint(Graphics g) {
super.paint(g);  
g.drawString("Handling Mouse Events", 30, 80);
g.drawString(msg, 60, 110);
}
public static void main(String[] args) {
new BcdSwing();
}
}

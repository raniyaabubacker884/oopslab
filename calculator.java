import javax.swing.*;
import java.awt.event.*;

class calculator extends JFrame implements ActionListener {

    private JTextField t1;

    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;

    private int res = 0;
    private String operation = "";

    public calculator() {

        setLayout(null);
        setSize(400,400);

        t1 = new JTextField();
        t1.setBounds(50,50,200,30);
        add(t1);

        b1 = new JButton("1"); b1.setBounds(50,100,50,30);
        b2 = new JButton("2"); b2.setBounds(100,100,50,30);
        b3 = new JButton("3"); b3.setBounds(150,100,50,30);
        b4 = new JButton("+"); b4.setBounds(200,100,50,30);

        b5 = new JButton("4"); b5.setBounds(50,140,50,30);
        b6 = new JButton("5"); b6.setBounds(100,140,50,30);
        b7 = new JButton("6"); b7.setBounds(150,140,50,30);
        b8 = new JButton("-"); b8.setBounds(200,140,50,30);

        b9 = new JButton("7"); b9.setBounds(50,180,50,30);
        b10 = new JButton("8"); b10.setBounds(100,180,50,30);
        b11 = new JButton("9"); b11.setBounds(150,180,50,30);
        b12 = new JButton("*"); b12.setBounds(200,180,50,30);

        b13 = new JButton("/"); b13.setBounds(50,220,50,30);
        b14 = new JButton("%"); b14.setBounds(100,220,50,30);
        
        
        b15 = new JButton("="); b15.setBounds(150,220,50,30);
        b16 = new JButton("C"); b16.setBounds(200,220,50,30);

        b17 = new JButton("0"); b17.setBounds(50,260,200,30);

        // add buttons
        add(b1); add(b2); add(b3); add(b4);
        add(b5); add(b6); add(b7); add(b8);
        add(b9); add(b10); add(b11); add(b12);
        add(b13); add(b14); add(b15); add(b16);
        add(b17);

        // action listeners
        b1.addActionListener(this); b2.addActionListener(this);
        b3.addActionListener(this); b4.addActionListener(this);
        b5.addActionListener(this); b6.addActionListener(this);
        b7.addActionListener(this); b8.addActionListener(this);
        b9.addActionListener(this); b10.addActionListener(this);
        b11.addActionListener(this); b12.addActionListener(this);
        b13.addActionListener(this); b14.addActionListener(this);
        b15.addActionListener(this); b16.addActionListener(this);
        b17.addActionListener(this);
    }

    public void doAction(String op) {

        if(operation.equals("")) {
            res = Integer.parseInt(t1.getText());
        } else {
            int val = Integer.parseInt(t1.getText());

            switch(operation) {
                case "+": res = res + val; break;
                case "-": res = res - val; break;
                case "*": res = res * val; break;
                case "/":
                    try {
                        if(val == 0) throw new ArithmeticException("Divide by zero");
                        res = res / val;
                    } catch(Exception e) {
                        t1.setText(e.getMessage());
                        return;
                    }
                    break;
                case "%": res = res % val; break;
            }
        }

        if(op.equals("=")) {
            t1.setText(String.valueOf(res));
            operation = "";
            res = 0;
        } else {
            operation = op;
            t1.setText("");
        }
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1) t1.setText(t1.getText()+"1");
        else if(e.getSource() == b2) t1.setText(t1.getText()+"2");
        else if(e.getSource() == b3) t1.setText(t1.getText()+"3");
        else if(e.getSource() == b4) doAction("+");

        else if(e.getSource() == b5) t1.setText(t1.getText()+"4");
        else if(e.getSource() == b6) t1.setText(t1.getText()+"5");
        else if(e.getSource() == b7) t1.setText(t1.getText()+"6");
        else if(e.getSource() == b8) doAction("-");

        else if(e.getSource() == b9) t1.setText(t1.getText()+"7");
        else if(e.getSource() == b10) t1.setText(t1.getText()+"8");
        else if(e.getSource() == b11) t1.setText(t1.getText()+"9");
        else if(e.getSource() == b12) doAction("*");

        else if(e.getSource() == b13) doAction("/");
        else if(e.getSource() == b14) doAction("%");
        else if(e.getSource() == b15) doAction("=");

        else if(e.getSource() == b16) {
            t1.setText("");
            res = 0;
            operation = "";
        }

        else if(e.getSource() == b17) t1.setText(t1.getText()+"0");
    }

    public static void main(String[] args) {
        calculator c = new calculator();
        c.setVisible(true);
    }
}


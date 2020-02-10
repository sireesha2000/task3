import javax.swing.*;
import java.awt.*;
import java.math.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
	JFrame f=new JFrame("Calculator");
	JButton[] b=new JButton[10];
	JButton add=new JButton("+");
	JButton div=new JButton("/");
	JButton mul=new JButton("*");
	JButton sub=new JButton("-");
	JButton dec=new JButton(".");
	JButton eq=new JButton("=");
	JButton clear=new JButton("clear");
	JTextField t=new JTextField();
	JPanel p=new JPanel();
	int op;
	static double x,y,result=0;
	public Calculator()
	{
		t.setHorizontalAlignment(JTextField.RIGHT);
		for(int i=0;i<10;i++)
		{
			b[i]=new JButton(Integer.toString(i));
			p.add(b[i]);
		}
		p.add(add);p.add(sub);p.add(mul);p.add(div);p.add(dec);p.add(clear);p.add(eq);
		p.setLayout(new GridLayout(5,4,10,30));
		p.setBackground(Color.pink);
		f.add(t,BorderLayout.NORTH);
		f.add(p,BorderLayout.CENTER);
		f.setSize(400,400);
		f.setVisible(true);
		for(int i=0;i<10;i++)
			b[i].addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		dec.addActionListener(this);
		clear.addActionListener(this);
		eq.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(b[0]))
		{
			t.setText(t.getText().concat("0"));
		}
		if(e.getSource().equals(b[1]))
		{
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource().equals(b[2]))
		{
			t.setText(t.getText().concat("2"));
		}
		if(e.getSource().equals(b[3]))
		{
			t.setText(t.getText().concat("3"));
		}
		if(e.getSource().equals(b[4]))
		{
			t.setText(t.getText().concat("4"));
		}
		if(e.getSource().equals(b[5]))
		{
			t.setText(t.getText().concat("5"));
		}
		if(e.getSource().equals(b[6]))
		{
			t.setText(t.getText().concat("6"));
		}
		if(e.getSource().equals(b[7]))
		{
			t.setText(t.getText().concat("7"));
		}
		if(e.getSource().equals(b[8]))
		{
			t.setText(t.getText().concat("8"));
		}
		if(e.getSource().equals(b[9]))
		{
			t.setText(t.getText().concat("9"));
		}
		if(e.getSource().equals(add))
		{
			x=Double.parseDouble(t.getText());
			t.setText("");
			op=1;
		}
		if(e.getSource().equals(sub))
		{
			x=Double.parseDouble(t.getText());
			t.setText("");
			op=2;
		}
		if(e.getSource().equals(mul))
		{
			x=Double.parseDouble(t.getText());
			t.setText("");
			op=3;
		}
		if(e.getSource().equals(div))
		{
			x=Double.parseDouble(t.getText());
			t.setText("");
			op=4;
		}
		if(e.getSource().equals(dec))
		{
			t.setText(t.getText().concat("."));
		}
		if(e.getSource().equals(clear))
		{
			t.setText("");
		}
		if(e.getSource().equals(eq))
		{
			y=Double.parseDouble(t.getText());
			switch(op)
			{
				case 1:result=x+y;break;
				case 2:result=x-y;break;
				case 3:result=x*y;break;
				case 4:result=x/y;break;
			}
			BigDecimal bd=new BigDecimal(result);
			t.setText(""+bd);
		}
		
	}
	public static void main(String[] z)
	{
		new Calculator();
	}
}

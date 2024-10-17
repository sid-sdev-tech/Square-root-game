import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.lang.Thread;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.WindowConstants;

class dialogbox extends Dialog implements ActionListener
{
	JButton db,okb;
	int rs = 0;
	public dialogbox(JFrame jf,String st,int P)
	{
		super(jf,st,true);
		setLayout(null);
		Font ft = new Font("Times New Roman", Font.BOLD, 18);
		Color mycolor1 = new Color(255,165,0);
		int hs = P;
		JLabel lb = new JLabel("Your Highest score is : " + hs);
		db = new JButton("Restart ");
		okb = new JButton("OK");

		db.setBounds(30,75,100,40);okb.setBounds(150,75,75,40);
		db.setFont(ft);okb.setFont(ft);
		db.setBackground(Color.blue);okb.setBackground(Color.blue);
		db.setForeground(Color.white);okb.setForeground(Color.white);
		add(db);add(okb);
		db.addActionListener(this);okb.addActionListener(this);
		lb.setBounds(25,35,210,35);lb.setForeground(mycolor1);
		lb.setFont(ft); add(lb);

		setSize(275,150);
		setVisible(true);
	}

	int restart()
	{
		System.out.println("Restart value :" + rs);

		return rs;
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object a = ae.getSource();
 			if(a == db)
		    {
	    		System.out.println(db.getText());
	    		rs = 1;
	    		restart();
	    		setVisible(false);

		    }
		    if(a == okb)
		    {
		    	setVisible(false);
		    	System.exit(0);
		    	//dispose();
		    }
	}
}

class sqrtgame extends Frame implements ActionListener,WindowListener
{
			
		    JFrame fr = new JFrame("SquareRoot Game Puzzle");
		    JPanel panel = new JPanel();

			JButton btn1,btn2,btn3,btn4;
			JLabel l,ll,tl,tupl,t;
			dialogbox d;
			String num;
			int flag = 0;
			int p = 0,count = 0;
			JButton[] button = new JButton[4];

			int sqrtg()
			{

				Color mycolor1 = new Color(255,165,0);

             	Font f0 = new Font("Times New Roman", Font.PLAIN, 58);
				Font f1 = new Font("Times New Roman", Font.PLAIN, 28);
				Font f2 = new Font("Times New Roman", Font.PLAIN, 34);
				Font f = new Font("Times New Roman", Font.PLAIN, 22);
	          	fr.setLayout(null);
	          	panel.setLayout(null);

	          	t = new JLabel("[SquareRoot Game]");
	          	l = new JLabel("	      sqrt()");
	          	ll = new JLabel(" 0");
	          	tl = new JLabel("10");
	          	tupl = new JLabel("  ");

	            button[0] = new JButton("B1");button[1] = new JButton("B2");button[2] = new JButton("B3");button[3] = new JButton("B4");

				Color color = new Color(0,0,204);
				Color mycolor = new Color(255,255,255);
				Color brown = new Color(150,75,0);

	            for(int b = 0;b<4;b++)
	            {
					button[b].setFont(f);
					button[b].setBackground(color);
					button[b].setForeground(mycolor);
					panel.add(button[b]);
					button[b].addActionListener(this);

	            }

	  			button[0].setBounds(75,165,75,75);button[1].setBounds(155,165,75,75);
	            button[2].setBounds(75,250,75,75);button[3].setBounds(155,250,75,75);
	            t.setBounds(100,0,200,55);l.setBounds(70,90,200,55);ll.setBounds(130,40,58,58);
	            tl.setBounds(255,25,65,65);tupl.setBounds(235,85,95,35);
	            t.setFont(f);l.setFont(f1);ll.setFont(f2);tl.setFont(f0);tupl.setFont(f);
	            fr.add(t);panel.add(l);panel.add(ll);panel.add(tl);panel.add(tupl);
	            
	            l.setForeground(color);tl.setForeground(brown);tupl.setForeground(brown);

				addWindowListener(this);
			
				panel.setBounds(25,45,340,340);
		    	panel.setBackground(mycolor);
				fr.add(panel);
				fr.setTitle("Square Root Game");
			    fr.setBackground(color);
                fr.setVisible(true);
                fr.setSize(410,435);
				puzzlegame();	

				return 0;

			}

			int puzzlegame()
			{
							System.out.println("abcd");
				boolean b = true;
					int[] a = new int[4];
				int sqrt,n1,n2,n3,n4;
			int[] ar ={2,4,6,8,10,1,3,5,7,9,12,14,16,18,20,11,13,15,17,19,22,24,26,28,30,21,23,25,27,29,32,34,36,38,40,
							31,33,35,37,39,42,44,46,48,50,41,43,45,47,49};
										System.out.println("abcdefgh");

			int [][] arr = {{1,2,3,4},{4,3,2,1},{5,6,7,8},{8,7,6,5},{10,9,8,7},{4,3,2,1},{1,2,3,4},{5,6,7,8},{5,7,9,12},{10,9,8,7},{12,14,16,18},
			{7,9,12,14},{16,18,20,11},{12,14,16,18},{20,11,13,15},{11,13,15,17},{13,15,17,19},{15,17,19,22},{11,13,15,17},{19,22,24,26},{22,24,26,28},
			{24,26,28,30},{19,22,24,26},{28,30,21,23},{24,26,28,30},{21,23,25,27},{28,30,21,23},{25,27,29,32},{21,23,25,27},{29,32,34,36},{32,34,36,38},
			{27,29,32,34},{36,38,40,31},{38,40,31,33},{40,31,33,35},{31,33,35,37},{33,35,37,39},{35,37,39,42},{31,33,35,37},{39,42,44,46},{42,44,46,48},
			{42,44,46,48},{44,46,48,50},{44,46,48,50},{50,41,43,45},{46,48,50,41},{50,41,43,45},{41,43,45,47},{43,45,47,49},{43,45,47,49}};
										System.out.println("abcd");

				try
				{
					int i = 0;
					int t = 10;
 
						System.out.println("abcdjklmn");
	
					while(b == true)
					{
						int Yy = 1,Nn = 0;
						int dc = 0;

						b = false;
						System.out.println(b);

						while(i<arr.length)
						{
							System.out.println("I is : "+i);
							System.out.println("flag is : " + flag);

							sqrt = ar[i]*ar[i];
							num = "" + ar[i];
							l.setText("      sqrt("+sqrt+")");
							//System.out.print(sqrt + "--" + num);
							System.out.println("abcdabcd");

							for(int j = 0;j < 4;j++)
							{
								//System.out.println(ar.length);
								//System.out.println(arr.length);
								//System.out.print(arr[i][j] + " ");
								a[j] = arr[i][j];
								//System.out.println(a[j] + " ");
								button[0].setText(""+a[0]);
								button[1].setText(""+a[1]);
								button[2].setText(""+a[2]);
								button[3].setText(""+a[3]);
								System.out.println(j);

							}

							while(flag == 0 && t>=0)
							{
								if(t==0)
								{
									dc++;
									i = 50;
									System.out.println(i);
									tupl.setText("Time-Up!!");
									if(dc == 1)
									{
										 d = new dialogbox(fr,"Dialog Box",p);
										System.out.println("Dialog Box : " + dc);
										t = -1;
										dc++;
									} 
										System.out.println("Out of Dialog Box "+ dc);

								}
								else
								{
									Thread.sleep(1000);
									//System.out.println();
									tl.setText("" + t);
									System.out.println(">>>>>>>>"+ t);
									t--;
								}
							}

							if(flag == 1) // to go for the next i value or next array index..
								{

									i++; 
									flag = 0;
									t = 10;
									count = 0;
								}
						}

						System.out.println("Out of Outer while loop");
						int rv = d.restart();
						System.out.println("Restart value is : " + rv);

								Scanner sc = new Scanner(System.in);

						// System.out.println("Do you want to replay ? \n Please,provide your option..?");
						// 		Integer input = sc.nextInt();
						// 		System.out.println("You selected :" + input);

						Integer replay = (rv == 1) ? Yy : Nn;

						System.out.println("You selected :" + replay);

						if(replay == Yy)
						{
							b = true;
							i = 0;
							p = 0;
							t = 10;
							ll.setText("" + 0);
							tupl.setText(" ");
							System.out.println(b);
						}
					}
					System.out.println("Program..");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}

				return 0;
			}

		public void actionPerformed(ActionEvent ae)
    	{
        	Object o = ae.getSource();
 
        //System.out.println("Object o contains :- " + o);

        	for(int L = 0;L<4;L++)
        	{

				if(o == button[L])
		        {
		            String B = button[L].getText();
		            System.out.println(num);
	        		System.out.println(B);

	        		if(num.equals(B))
	        		{
	        			count++;
	        			if(count==1)
	        			{
	        				System.out.println("JButton " + (L+1));
	        			  flag = 1;
	        			  p++;
	        			  ll.setText(p + ""); 	
	        			}
	        			  
	        		}
	        		else
	        		{
	        			if(p!=0 && p>0)
	        			{
	        				p--;
	        				ll.setText(p+"");
	        			} 
	        		}
		            
		        }
		        else
		        {
		        	System.out.println("-->>" + L);
		        }
		    }

	    }

			public void windowActivated(WindowEvent we)
		    { }
		    public void windowClosed(WindowEvent ce)
		    { }
		    public void windowClosing(WindowEvent we)
		    {
		        dispose();
		    }
		    public void windowDeactivated(WindowEvent we)
		    { }
		    public void windowDeiconified(WindowEvent de)
		    { }
		    public void windowIconified(WindowEvent ie)
		    { }
		    public void windowOpened(WindowEvent oe)
		    { }

		public static void main(String[] args)
		{

			Scanner sc = new Scanner(System.in);
			
			sqrtgame SG = new sqrtgame();
			SG.sqrtg();
        	System.out.println("-->>");       	
		}
}

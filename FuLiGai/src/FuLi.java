import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

public class FuLi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JButton jButton0;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField4;
	private JLabel jLabel5;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JButton jButton1;
	public FuLi() {
		initComponents();
	}

	private void initComponents() {
		setTitle("复利计算器");
		setLayout(new GroupLayout());
		add(getJTextField5(), new Constraints(new Leading(206, -87, 10, 10), new Leading(7, 12, 12)));
		add(getJTextField6(), new Constraints(new Leading(164, -48, 10, 10), new Leading(7, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(32, 12, 12), new Leading(93, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(138, 148, 10, 10), new Leading(93, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(29, 10, 10), new Leading(139, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(26, 12, 12), new Leading(186, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(26, 12, 12), new Leading(232, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(26, 12, 12), new Leading(274, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(138, 148, 12, 12), new Leading(139, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(137, 148, 12, 12), new Leading(186, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(137, 148, 12, 12), new Leading(236, 12, 12)));
		add(getJTextField4(), new Constraints(new Leading(136, 152, 12, 12), new Leading(276, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(325, 86, 12, 12), new Leading(129, 12, 12)));
		add(getJButton3(), new Constraints(new Leading(325, 86, 12, 12), new Leading(165, 10, 10)));
		add(getJButton4(), new Constraints(new Leading(325, 12, 12), new Leading(202, 12, 12)));
		add(getJButton5(), new Constraints(new Leading(325, 12, 12), new Leading(236, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(169, 12, 12), new Leading(312, 10, 10)));
		add(getJButton6(), new Constraints(new Leading(325, 12, 12), new Leading(270, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(325, 87, 12, 12), new Leading(89, 12, 12)));
		add(getJTextField7(), new Constraints(new Leading(159, 97, 12, 12), new Leading(41, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(88, 12, 12), new Leading(43, 12, 12)));
		setSize(432, 349);
	}

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("还款金额");
			jButton6.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton6MouseMouseClicked(event);
				}
			});
		}
		return jButton6;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("投资回报");
			jButton5.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton5MouseMouseClicked(event);
				}
			});
		}
		return jButton5;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("求利率比");
			jButton4.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton4MouseMouseClicked(event);
				}
			});
		}
		return jButton4;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("求年份");
			jButton3.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton3MouseMouseClicked(event);
				}
			});
		}
		return jButton3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("求本金");
			jButton2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton2MouseMouseClicked(event);
				}
			});
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("复利终值");
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JTextField getJTextField7() {
		if (jTextField7 == null) {
			jTextField7 = new JTextField();
		}
//		jTextField7.setText("1");
		return jTextField7;
	}

	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
		}
		return jTextField6;
	}

	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
		}
		return jTextField5;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("计算目标：");
		}
		return jLabel5;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
		}
		return jTextField4;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
//		jTextField1.setText("0.3");
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
//		jTextField0.setText("10000");
		return jTextField0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("计算");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("复利终值：");
			jLabel4.setFont(new Font("宋体",Font.BOLD,20));
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("复利次数：");
			jLabel3.setFont(new Font("宋体",Font.BOLD,20));
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("存入年限：");
			jLabel2.setFont(new Font("宋体",Font.BOLD,20));
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("年利率比：");
			jLabel1.setFont(new Font("宋体",Font.BOLD,20));
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("存入本金：");
			jLabel0.setFont(new Font("宋体",Font.BOLD,20));
		}
		return jLabel0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FuLi frame = new FuLi();
				frame.setDefaultCloseOperation(FuLi.EXIT_ON_CLOSE);
				frame.setTitle("FuLi");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				

				
			}
		});
	}
	int tages=1;     //默认计算目标为复利终值
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";

 
	private void jButton0MouseMouseClicked(MouseEvent event) {
		HanShu Jisuan = new HanShu(jTextField0.getText(),jTextField1.getText(),jTextField2.getText(),
				jTextField3.getText(),jTextField4.getText());
		
		int select=0;
//		if(Integer.parseInt(jTextField7.getText())==1)
		if(tages==1)
			select=1;
//		if(Integer.parseInt(jTextField7.getText())==2)
		if(tages==2)
			select=2;
//		if(Integer.parseInt(jTextField7.getText())==3)
		if(tages==3)
			select=3;
//		if(Integer.parseInt(jTextField7.getText())==4)
		if(tages==4)
			select=4;
//		if(Integer.parseInt(jTextField7.getText())==5)
		if(tages==5)
			select=5;
//		if(Integer.parseInt(jTextField7.getText())==6)
		if(tages==6)
			select=6;
		if(select==1){
			int num=(int)Jisuan.SuanFa01();
			JOptionPane.showMessageDialog(null, "复利终值为： "+num, "求复利终值", JOptionPane.CLOSED_OPTION);
			
		}		  
		if(select==2){
			double num2=Jisuan.SuanFa02();
			JOptionPane.showMessageDialog(null, "本金为：  "+num2, "求本金", JOptionPane.CLOSED_OPTION);
		}
		if(select==3){
			double num3=Jisuan.Time();
			JOptionPane.showMessageDialog(null, "存入年份为：  "+num3, "求年份", JOptionPane.CLOSED_OPTION);
		}
		if(select==4){
			double num4=Jisuan.Li();
			JOptionPane.showMessageDialog(null, "年利率比为：  "+num4, "求利率比", JOptionPane.CLOSED_OPTION);
		}
		if(select==5){
			double num5=Jisuan.HuiBao();
			JOptionPane.showMessageDialog(null, "投资回报为：  "+num5, "求投资回报", JOptionPane.CLOSED_OPTION);
		}
		if(select==6){
			double num6=Jisuan.HuanKuan();
			JOptionPane.showMessageDialog(null, "还款金额为：  "+num6, "求还款金额", JOptionPane.CLOSED_OPTION);
		}
		

	}	
	private void jButton1MouseMouseClicked(MouseEvent event) {
	    tages=1;
//	    System.out.println(tages);
//	    jTextField0.setText("");
	    jTextField1.setText("0.3");
	    jTextField2.setText("5");
	    jTextField3.setText("3");
	    jTextField7.setText("求复利终值");
//	    jTextField4.disable();
	    jTextField4.setEditable(false);
	    jTextField0.setEditable(true);
	    jTextField1.setEditable(true);
	    jTextField2.setEditable(true);
	    jTextField3.setEditable(true);
	}

	private void jButton2MouseMouseClicked(MouseEvent event) {
		 tages=2;
//		 jTextField0.disable();
		 jTextField0.setEditable(false);
		jTextField1.setText("0.6");
	    jTextField2.setText("10");
	    jTextField3.setText("2");
//	    jTextField4.setText("");
	    jTextField7.setText("求本金");
	    jTextField1.setEditable(true);
	    jTextField2.setEditable(true);
	    jTextField3.setEditable(true);
	    jTextField4.setEditable(true);
	}

	private void jButton3MouseMouseClicked(MouseEvent event) {
		tages=3;
//		jTextField0.setText("");
		jTextField1.setText("0.4");
//	    jTextField2.disable();
		jTextField2.setEditable(false);
	    jTextField3.setText("3");
	    jTextField2.setText("");
	    jTextField7.setText("求年份");
	    jTextField0.setEditable(true);
	    jTextField1.setEditable(true);
	    jTextField3.setEditable(true);
	    jTextField4.setEditable(true);
	}

	private void jButton4MouseMouseClicked(MouseEvent event) {
		tages=4;
//		jTextField1.disable();
		jTextField1.setText("");
		jTextField1.setEditable(false);
	    jTextField2.setText("6");
	    jTextField3.setText("3");
//	    jTextField4.setText("");
	    jTextField7.setText("求利率比");
	    jTextField0.setEditable(true);
	    jTextField2.setEditable(true);
	    jTextField3.setEditable(true);
	    jTextField4.setEditable(true);
	}

	private void jButton5MouseMouseClicked(MouseEvent event) {
		tages=5;
//		jTextField0.setText("");
		jTextField1.setText("0.6");
	    jTextField2.setText("5");
	    jTextField3.setText("3");
//	    jTextField4.disable();
	    jTextField4.setEditable(false);
	    jTextField7.setText("求投资回报");
	    jTextField0.setEditable(true);
	    jTextField1.setEditable(true);
	    jTextField2.setEditable(true);
	    jTextField3.setEditable(true);
	}

	private void jButton6MouseMouseClicked(MouseEvent event) {
		tages=6;
//		jTextField0.setText("");
		jTextField1.setText("0.5");
	    jTextField2.setText("5");
	    jTextField3.setText("2");
//	    jTextField4.disable();
	    jTextField4.setEditable(false);
	    jTextField7.setText("求还款金额");
	    jTextField0.setEditable(true);
	    jTextField1.setEditable(true);
	    jTextField2.setEditable(true);
	    jTextField3.setEditable(true);
	}


}


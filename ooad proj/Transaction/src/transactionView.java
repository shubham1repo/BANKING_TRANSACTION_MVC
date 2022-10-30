import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class transactionView extends JFrame{
	
	private JLabel tran = new JLabel("TRANSACTION");
	private JLabel trann = new JLabel("PES1UG19CS475");
	private JLabel t = new JLabel("                   ");
	private JLabel trannn = new JLabel("SHUBHAM M MAHALE");
	private JLabel Bal = new JLabel("Balance");
	private JLabel Bala = new JLabel("____");
	private JButton balcheck = new JButton("Check_Balance");
	private JButton deposit = new JButton("Deposit");
	
	private JTextField depamount = new JTextField(10);
	private JButton withdrawal = new JButton("Withdrawal");
	private JTextField withamount = new JTextField(10);
	
	transactionView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(150, 350);
		this.setVisible(true);
		calcPanel.add(tran);
		calcPanel.add(trann);
		calcPanel.add(trannn);
		calcPanel.add(Bal);
		calcPanel.add(Bala);
		calcPanel.add(balcheck);
		calcPanel.add(t);
		calcPanel.add(depamount);
		calcPanel.add(deposit);
		
		calcPanel.add(withamount);
		calcPanel.add(withdrawal);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	void addactioListener(ActionListener listenbalcheck){
		
		balcheck.addActionListener(listenbalcheck);
		
	}
	public int getdepamount(){
		
		return Integer.parseInt(depamount.getText());
		
	}
	
	void adddepoListener(ActionListener depo){
		
		deposit.addActionListener(depo);
		
	}
	public int getwithamount(){
		
		return Integer.parseInt(withamount.getText());
		
	}
	
	void addwithListener(ActionListener withdraw){
		
		withdrawal.addActionListener(withdraw);
		
	}
	
	public void setbala(int solution){
		
		Bala.setText(Integer.toString(solution));
		
	}
}
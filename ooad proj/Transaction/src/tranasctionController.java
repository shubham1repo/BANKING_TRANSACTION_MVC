import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class transactionController {
	
	transactionView theView;
	transactionModel theModel;
	
	public transactionController(transactionView theView, transactionModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		
		
		this.theView.addactioListener(new checkbalListener());
		this.theView.adddepoListener(new depoListener());
		this.theView.addwithListener(new withListener());
	}
	class checkbalListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
						
			
							
				theView.setbala(theModel.getbal());
			
			}
	}
	class depoListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int amount=0;
			amount = theView.getdepamount();
			theModel.deposit(amount);
			theView.setbala(theModel.getbal());
				
			
			}
	}
	class withListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int amoun=0;
			amoun = theView.getwithamount();
			theModel.withdrawal(amoun);
			theView.setbala(theModel.getbal());
				
			
			}
	}
	
}
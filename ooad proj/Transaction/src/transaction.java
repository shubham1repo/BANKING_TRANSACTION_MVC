import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class transaction {
    
    public static void main(String[] args) {
    	
    	transactionView theView = new transactionView();
        
    	transactionModel theModel = new transactionModel();
        theModel.balance=1000;
        String user="transaction";
        String pass="Sucess@1";
        Connection connection=null;
        ResultSet rs=null;
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/transaction","transaction","Sucess@1");
        String query = "insert into transaction(deposit,withdraw,balance)" +"values("+"'"+0+"'"+","+"'"+0+"'"+","+"'"+theModel.balance+"'"+")";
        		
        Statement sta = connection.createStatement();
        int x = sta.executeUpdate(query);
        String query1 = "SELECT balance FROM transaction";
        Statement statement=connection.createStatement();
        rs=statement.executeQuery(query1);
        ArrayList<String> ans=new ArrayList<String>();
        while(rs.next()) {
        	ans.add(rs.getString(1));
        }
        for(String s:ans) {
        	System.out.println("balance:"+s);
        }
        
        
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
        transactionController theController = new transactionController(theView,theModel);
        theView.setVisible(true);
        
        
    }
}
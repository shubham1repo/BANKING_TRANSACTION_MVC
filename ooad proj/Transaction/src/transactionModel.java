import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class transactionModel{
	
	public int balance;
	
	public void deposit(int amount)
	{
		balance=balance+amount;
		String user="transaction";
        String pass="Sucess@1";
        Connection connection=null;
        ResultSet rs=null;
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/transaction","transaction","Sucess@1");
        
        
        String query = "insert into transaction(deposit,withdraw,balance)" +"values("+"'"+amount+"'"+","+0+","+"'"+balance+"'"+")";
        
        
        Statement sta = connection.createStatement();
        int x = sta.executeUpdate(query);
        System.out.println("deposit amount :"+amount);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}
	
	public void withdrawal(int amount)
	{
		balance=balance-amount;
		String user="transaction";
        String pass="Sucess@1";
        Connection connection=null;
        ResultSet rs=null;
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/transaction","transaction","Sucess@1");
        
        
        String query = "insert into transaction(deposit,withdraw,balance)" +"values("+"'"+0+"'"+","+"'"+amount+"'"+","+"'"+balance+"'"+")";
        
        
        Statement sta = connection.createStatement();
        int x = sta.executeUpdate(query);
        
        System.out.println("withdraw amount :"+amount);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
		
	}
	public int getbal(){
		String user="transaction";
        String pass="Sucess@1";
        Connection connection=null;
        ResultSet rs=null;
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/transaction","transaction","Sucess@1");
        
        String query1 = "SELECT balance FROM transaction";
        Statement statement=connection.createStatement();
        rs=statement.executeQuery(query1);
        ArrayList<String> ans=new ArrayList<String>();
        while(rs.next()) {
        	ans.add(rs.getString(1));
        }
        
        System.out.println("balance:"+ans.get(ans.size()-1));
        
        
        
        }
        catch(Exception e) {
        	System.out.println(e);
        }
		return balance;
		
	}
	
}
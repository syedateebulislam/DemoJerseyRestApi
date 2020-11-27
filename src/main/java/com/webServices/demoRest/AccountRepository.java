package com.webServices.demoRest;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class AccountRepository {

	List<Account> accounts;
//	Connection con=null;
	
	public AccountRepository() {

//		String url="jdbc:mysql://localhost:";
//		String dbUsername="root";
//		String dbPassword="";
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con=DriverManager.getConnection(url,dbUsername,dbPassword);
//			
//
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		//Mocking Database
		accounts = new ArrayList<>();
		Account a1=new Account();
		a1.setAccount_number(101);
		a1.setBalance(51);
		a1.setStatus("freeze");
		
		
		Account a2=new Account();
		a2.setAccount_number(102);
		a2.setBalance(25560);
		a2.setStatus("active");
		
		accounts.add(a1);
		accounts.add(a2);
		
	}
	
	public List<Account> getAccounts(){		
		//List<Account> accounts=new ArrayList<>();

//		String sql="select * from accounts";
//		try {
//			Statement st=con.createStatement();
//			ResultSet rs=st.executeQuery(sql);
//			while(rs.next()) {
//				Account a1=new Account();
//				a1.setAccount_number(rs.getInt(1));
//				a1.setBalance(rs.getInt(2));
//				a1.setStatus(rs.getString(3));
//				
//				accounts.add(a1);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return accounts;
	}
	
	public Account searchAccount(int account_number) {
		Account a1=new Account();
//		String sql="select * from account where account_number="+account_number;
//		try {
//				Statement st=con.createStatement();
//				ResultSet rs=st.executeQuery(sql);
//				if(rs.next()) {
//					a1.setAccount_number(rs.getInt(1));
//					a1.setBalance(rs.getInt(2));
//					a1.setStatus(rs.getString(3));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		return a1;
//		for(Account a2 : accounts) {
//			if(a2.getAccount_number()==account_number) {
//				return a2;
//			}
//		}
//		
//		return null;
	}
	
	public void createAccount(Account a1) {
		
//		String sql="insert into account values (?,?,?)";
//		try {
//				PreparedStatement st=con.prepareStatement(sql);
//				
//				st.setInt(1, a1.getAccount_number());
//				st.setInt(2, a1.getBalance());
//				st.setString(3, a1.getStatus());
//				
//				st.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
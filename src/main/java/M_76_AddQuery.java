import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class M_76_AddQuery {

	Connection con;
	
	public M_76_AddQuery() {
		
		try {
			Class.forName(DbConnProperties.driver);
			
			this.con = DriverManager.getConnection(
					DbConnProperties.dburl, 
					DbConnProperties.uname, 
					DbConnProperties.password
			);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int addNewFriend(M_76_Friends friend) throws Exception {
		
		String insertQuery = "insert into friend values (?, ?, ?, ?, ?);";
		PreparedStatement prd = con.prepareStatement(insertQuery);
		
		prd.setString(1, Integer.toString(friend.getFriendID()));
		prd.setString(2, friend.getFriendName());
		prd.setString(3, friend.getEmailAddr());
		prd.setString(4, Integer.toString(friend.getAge()));
		prd.setString(5, friend.getFavoriteColor());
		
		return prd.executeUpdate();
		
	}
	
	public ResultSet readData() throws Exception {
		
		String selectQuery = "select * from friend;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectQuery);
		
		return rs;
		
	}
	
	
	
	
}

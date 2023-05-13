import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class M_76_DeleteQuery {

	Connection con;

	public M_76_DeleteQuery() {

		try {
			Class.forName(DbConnProperties.driver);

			this.con = DriverManager.getConnection(DbConnProperties.dburl, DbConnProperties.uname,
					DbConnProperties.password);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int deleteRecord(int id) throws Exception {

		String deleteQuery = "delete from friend where friend_id = ?;";
		PreparedStatement prd = con.prepareStatement(deleteQuery);

		prd.setInt(1, id);

		return prd.executeUpdate();

	}

}

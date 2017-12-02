package mail;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DAO {
	static Connection currentCon = null;
	static ResultSet rs = null;



	public static List<animalBean> selectListAnimal() throws SQLException {

		Statement stmt = null;
		List<animalBean> beans = new ArrayList<animalBean>();
		try {
			currentCon = DConnection.getConnection();
			String animalSearchQuery = "SELECT * FROM news_information";
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(animalSearchQuery);

			while (rs.next()) {
				animalBean bean = new animalBean();
				bean.setNewsid(rs.getString("news_id"));
				bean.setNewstitle(rs.getString("news_title"));
				bean.setNewsdecription(rs.getString("news_descrption"));
				bean.setCreateon(rs.getString("created_on"));
				
				beans.add(bean);
			}

		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException logOrIgnore) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException logOrIgnore) {
				}
			if (currentCon != null)
				try {
					currentCon.close();
				} catch (SQLException logOrIgnore) {
				}
		}
		return beans;

	}

}

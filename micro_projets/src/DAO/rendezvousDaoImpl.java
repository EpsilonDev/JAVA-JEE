package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ConnectionBD.ConnectionBd;
import Models.rv;

public class rendezvousDaoImpl implements rendezvousDao {

	@Override
	public List<rv> ListRv() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		List<rv> rvs = new ArrayList<>();

		String query = "SELECT *  FROM rv";
		PreparedStatement pr = (PreparedStatement) conn.prepareStatement(query);
		ResultSet rs = pr.executeQuery();

		while (rs.next()) {
			rv rv = new rv();
			rv.setId(rs.getInt("id"));
			rv.setJour(rs.getDate("jour"));
			rvs.add(rv);
		}
		pr.close();
		return rvs;
	}

	@Override
	public void addrv(rv c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Deleterv(int id) {
		// TODO Auto-generated method stub

	}

}

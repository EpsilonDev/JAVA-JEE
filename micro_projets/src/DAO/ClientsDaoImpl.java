package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ConnectionBD.ConnectionBd;
import LesClasses.Clients;

public class ClientsDaoImpl implements ClientsDao {

	@Override
	public List<Clients> ListClients() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		List<Clients> clients = new ArrayList<>();

		String query = "SELECT *  FROM clients";
		PreparedStatement pr = (PreparedStatement) conn.prepareStatement(query);
		ResultSet rs = pr.executeQuery();

		while (rs.next()) {
			Clients client = new Clients();
			client.setId(rs.getInt("id"));
			client.setVersion(rs.getInt("version"));
			client.setTitre(rs.getString("titre"));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			clients.add(client);
		}
		pr.close();
		return clients;
	}

	@Override
	public void addClient(Clients c) {
		// TODO Auto-generated method stub
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		String query = "INSERT INTO Clients (id,version,titre,nom,prenom) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pr = (PreparedStatement) conn.prepareStatement(query);
			pr.setInt(1, c.getId());
			pr.setInt(2, c.getVersion());
			pr.setString(3, c.getTitre());
			pr.setString(4, c.getNom());
			pr.setString(5, c.getPrenom());

			pr.executeUpdate();
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Ajoutee !");
	}

	@Override
	public void DeleteClient(int id) {
		// TODO Auto-generated method stub
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		String query = "delete from Clients where id=" + id;
		try {
			PreparedStatement pr = (PreparedStatement) conn.prepareStatement(query);
			pr.executeUpdate();
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client Suprimee !");
	}

}

package DAO;

import java.sql.SQLException;
import java.util.List;

import Models.Clients;

public interface ClientsDao {
	public List<Clients> ListClients() throws SQLException;

	public void addClient(Clients c);

	public void DeleteClient(int id);
}

package DAO;

import java.sql.SQLException;
import java.util.List;

import Models.rv;

public interface rendezvousDao {
	public List<rv> ListRv() throws SQLException;

	public void addrv(rv c);

	public void Deleterv(int id);
}

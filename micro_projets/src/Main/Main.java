package Main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import DAO.ClientsDao;
import DAO.ClientsDaoImpl;
import Models.Clients;

public class Main {
	public static void menu() {
		System.out.println("1- Afficher Clients ");
		System.out.println("2- Ajouter Clients ");
		System.out.println("3- Supprimer Clients ");
		System.out.println("0- Quit");
	}

	public static void main(String[] args) throws SQLException {
		Scanner s = new Scanner(System.in);
		ClientsDao clientsDao = new ClientsDaoImpl();
		int choice;
		do {
			menu();
			System.out.println("Entrer votre choix :");
			choice = s.nextInt();
			switch (choice) {
			case 1: {
				List<Clients> clients = clientsDao.ListClients();
				for (Clients c : clients) {
					System.out.println(c.toString());
				}
			}
				break;
			case 2: {
				int id, version;
				String titre, nom, prenom;
				System.out.println("id :");
				id = s.nextInt();
				System.out.println("version :");
				version = s.nextInt();
				System.out.println("titre :");
				titre = s.next();
				System.out.println("nom :");
				nom = s.next();
				System.out.println("prenom :");
				prenom = s.next();
				clientsDao.addClient(new Clients(id, version, titre, nom, prenom));
			}
				break;
			case 3: {
				System.out.println("Enter id :");
				int id = s.nextInt();
				clientsDao.DeleteClient(id);
			}
				break;
			}
		} while (choice != 0);
	}
}
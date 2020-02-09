package LesClasses;

import java.util.Date;

public class rv {

	private int id;
	private Date jour;
	private Creneaux creneaux;
	private Clients client;

	public rv() {

	}

	public rv(int id, Date jour, Creneaux creneaux, Clients client) {
		super();
		this.id = id;
		this.jour = jour;
		this.creneaux = creneaux;
		this.client = client;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public Creneaux getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(Creneaux creneaux) {
		this.creneaux = creneaux;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "rv [id=" + id + ", jour=" + jour + ", creneaux=" + creneaux + ", client=" + client + "]";
	}

}

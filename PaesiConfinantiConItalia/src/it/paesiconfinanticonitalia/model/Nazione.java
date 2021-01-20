package it.paesiconfinanticonitalia.model;

public class Nazione {
	
	private String nome;
	private String capitale;
	
	public Nazione() {}
	
	public Nazione(String nome, String capitale) {
		super();
		this.nome = nome;
		this.capitale = capitale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCapitale() {
		return capitale;
	}
	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	@Override
	public boolean equals(Object object) {
		   if (this == object) return true;
		   if (object == null || getClass() != object.getClass()) return false;
		   Nazione nazione = (Nazione) object;
		   return nome.equalsIgnoreCase(nazione.nome) && capitale.equalsIgnoreCase(nazione.capitale);
		}

	@Override
	public int hashCode() {
		  return java.util.Objects.hash(super.hashCode(), nome, capitale);
	}

	@Override
	public String toString() {
		return "Nazione{" +
				"nome=" + nome +
				", capitale='" + capitale +
				"}";
	}
	
	
	

	

	
	
	

}

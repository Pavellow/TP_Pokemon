package tppokemon;

public class Oeuf {
	protected String nom;
	protected int pokemonContenu;
	private int id;
	
	Oeuf(String nom) {
		this.setId(0);
		this.nom = nom;
		this.pokemonContenu = setPokemonContenu();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPokemonContenu() {
		return pokemonContenu;
	}

	public int setPokemonContenu() {
		this.pokemonContenu = (int)Math.random() % 2;
		return this.pokemonContenu; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = 0;
	}
	
	public String toString() {
		return(this.nom + " " + this.pokemonContenu + " " + this.id);
	}
	
	
}

package tppokemon;

public abstract class Pokedex extends DonneePokedex {
	DonneePokedex ligne = new DonneePokedex();
	
	Pokedex(DonneePokedex ligne) {
		this.ligne = ligne;
	}

	
}

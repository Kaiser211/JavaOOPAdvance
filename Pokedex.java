package com.assignmentsjavaoopadvance;

import java.util.ArrayList;

public   class Pokedex extends AbstractPokemon {
		public ArrayList<Object> pokemonInfo(Pokemon pokemon){
			ArrayList<Object> info = new ArrayList<Object>();
			info.add( pokemon.getName());
			info.add( pokemon.getType());
			info.add( pokemon.getHealth());
			
			return info;
		}

		@Override
		public Pokemon createPokemon(String name, int health, String type) {
			// TODO Auto-generated method stub
			return null;
		}

}

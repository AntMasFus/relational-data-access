package com.example.accessingdatajpa;

import java.util.List;

import javax.persistence.*;
import javax.persistence.ManyToMany;

@Entity
public class Personaje {


    @Id
    private String nombre;
    private String clase;
    private int vida_max;
    private int energia_max;
    private int vida_actual;
    private int energia_actual;
    private int monedas;
    private boolean npc;
    private boolean hostil;

    @ManyToMany
    @JoinTable(
        name = "personaje_habilidad",
        joinColumns = @JoinColumn(name = "personaje_nombre"),
        inverseJoinColumns = @JoinColumn(name = "habilidad_nombre")
        )
    private List<Habilidad> habilidades;


	public  Personaje()
	{
		nombre = "ninguno";
		clase = "ninguna";
		vida_max = 0;
		energia_max = 0;
		vida_actual = 0; 
		energia_actual = 0;
		monedas = 0;
	
		npc = false;
		hostil = false;	 
		
	}
	
	//Constructor sobrecargado
	public Personaje(String nombre, String clase, int vida_max, int energia_max, int vida_actual, int energia_actual, 
            int monedas, boolean npc, boolean hostil, List<Habilidad> habilidades) {
		
	this.nombre = nombre;
	this.clase = clase;
	this.vida_max = vida_max;
	this.energia_max = energia_max;
	this.vida_actual = vida_actual;
	this.energia_actual = energia_actual;
	this.monedas = monedas;
	this.npc = npc;
	this.hostil = hostil;
	this.habilidades = habilidades;
	}
	
	//Constructor de copia
	public Personaje(Personaje personaje)
	{
		this.nombre = personaje.nombre;
		this.clase = personaje.clase;
		this.vida_max = personaje.vida_max;
		this.energia_max = personaje.energia_max;
		this.vida_actual = personaje.vida_actual;
		this.energia_actual = personaje.energia_actual;
		this.monedas = personaje.monedas;
		
		this.npc = personaje.npc;
		this.hostil = personaje.hostil;
	}
	
	//gets y sets
	
	public List<Habilidad> getHabilidades() {
	    return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
	    this.habilidades = habilidades;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getVida_max() {
		return vida_max;
	}

	public void setVida_max(int vida_max) {
		this.vida_max = vida_max;
	}

	public int getEnergia_max() {
		return energia_max;
	}

	public void setEnergia_max(int energia_max) {
		this.energia_max = energia_max;
	}

	public int getVida_actual() {
		return vida_actual;
	}

	public void setVida_actual(int vida_actual) {
		this.vida_actual = vida_actual;
	}

	public int getEnergia_actual() {
		return energia_actual;
	}

	public void setEnergia_actual(int energia_actual) {
		this.energia_actual = energia_actual;
	}

	public int getMonedas() {
		return monedas;
	}

	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}


	public boolean isNpc() {
		return npc;
	}

	public void setNpc(boolean npc) {
		this.npc = npc;
	}

	public boolean isHostil() {
		return hostil;
	}

	public void setHostil(boolean hostil) {
		this.hostil = hostil;
	}
	
	//Metodo para comparar
	
	public boolean esIgual(Personaje personaje)
	{
		boolean salida = false;
		
		if(this.nombre.equals(personaje.nombre))
		{
			salida = true;
			
		}
		
		return salida;
	}
	
	@Override
	public boolean equals(Object per_entrada)
	{
		boolean salida = false;
		
		Personaje personaje = (Personaje) per_entrada;
		
		if(this.nombre.equals(personaje.nombre))
		{
			salida = true;
		}
		
		return salida;
	}
	
	//Metodo para mostrar
	
	public void visualizar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Clase: "+clase);
		System.out.println("Vida_max: "+vida_max);
		System.out.println("Energia_max: "+energia_max);
		System.out.println("Vida_actual: "+vida_actual);
		System.out.println("Energia_actual: "+energia_actual);
		System.out.println("Monedas: "+monedas);
		

		
		System.out.println();
		System.out.print("NPC: ");
		if(npc == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		System.out.println();
		System.out.print("Hostil: ");
		if(hostil == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		
		System.out.println();
		
	
	}
	
	
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Clase: "+clase);
		System.out.println("Vida_max: "+vida_max);
		System.out.println("Energia_max: "+energia_max);
		System.out.println("Vida_actual: "+vida_actual);
		System.out.println("Energia_actual: "+energia_actual);
		System.out.println("Monedas: "+monedas);

		
		System.out.println();
		System.out.print("NPC: ");
		if(npc == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		System.out.println();
		System.out.print("Hostil: ");
		if(hostil == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		
		System.out.println();
		
	}
	
	//Metodo tiene
	public boolean tiene_habilidad(Habilidad habilidad)
	{
		boolean salida = false;

		return salida;
	}
	
	
	

	
	public boolean addHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		boolean encontrado = false;

		return salida;
	}
	
	public boolean eliminarHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		boolean encontrado = false;
		int pos = 0;

		

		
		return salida;
	}
	
	
	public String toString()
	{
		String cad;
		String hab = "";
		boolean primero = false;
		

			
		cad = this.nombre+";"+this.clase+";"+this.vida_max+";"+this.energia_max+";"+this.vida_actual+";"
				+this.energia_actual+";"+this.monedas+";"+this.npc+";"+this.hostil+";"+hab;
		
		return cad;
	}
	
	
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainbiblioteca;

/**
 *
 * @author baldo
 */

class Biblioteca{
    String nome_libro;
    int prezzo;
    int scaffale;
    int pagine;
    String casa_editrice;
    String autore;
    int copie_disp;
    String genere;
	
    //costruttore
    public Biblioteca(String nome_libro, int prezzo, int scaffale, int pagine, String casa_editrice, String autore, int copie_disp, String genere){
        this.nome_libro = nome_libro;
        this.prezzo = prezzo;
        this.scaffale = scaffale;
        this.pagine = pagine;
        this.casa_editrice = casa_editrice;
        this.autore = autore;
        this.copie_disp = copie_disp;
	this.genere = genere;
    }
    
    //metodi
    public void stampa(){
        System.out.println("Libro: "+ nome_libro+"\n"+"Prezzo: "+prezzo+"\n"+"Scaffale: "+scaffale+"\n"+"Pagine: "+pagine+"\n"+"Casa editrice: "+casa_editrice+"\n"+"Autore: "+autore+"\n"+"Copie disponibili: "+copie_disp+"\n"+"Genere: "+genere);

//Da aggiungere: diminuzione del prezzo del 10% e inizializzazione dei campi
    
            }
}

class Negozio{
	String indirizzo;
	String nome;
	String libri_disp;
	
	public Negozio(String indirizzo, String nome, String libri_disp){
		this.indirizzo = indirizzo;
		this.nome = nome;
		this.libri_disp = libri_disp;
	}
	
	public void vendita(){
		System.out.println("Il libro: "+libri_disp+" e' disponibile");

	//Da aggiungere: inserimento nuovi libri e ricerca di libri disponibili

	}
}






public class MainBiblioteca {

    public static void main(String[] args) {
        Biblioteca libro1 = new Biblioteca("Il diario di una schiappa",10,2,200,"Mondadori","Elisabetta Dami",20,"Giallo");
        libro1.stampa();
    	Negozio negozio1 = new Negozio("Via XXII Aprile, 23","Il libraio","Il diario di una schiappa");
    	negozio1.vendita();
    }
}

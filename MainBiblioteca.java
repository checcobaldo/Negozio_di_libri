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
    
    //costruttore
    public Biblioteca(String nome_libro, int prezzo, int scaffale, int pagine, String casa_editrice, String autore, int copie_disp){
        this.nome_libro = nome_libro;
        this.prezzo = prezzo;
        this.scaffale = scaffale;
        this.pagine = pagine;
        this.casa_editrice = casa_editrice;
        this.autore = autore;
        this.copie_disp = copie_disp;
    }
    
    //metodi
    public void stampa(){
        System.out.println("Libro: "+ nome_libro+"\n"+"Prezzo: "+prezzo+"\n"+"Scaffale: "+scaffale+"\n"+"Pagine: "+pagine+"\n"+"Casa editrice: "+casa_editrice+"\n"+"Autore: "+autore+"\n"+"Copie disponibili: "+copie_disp);
    }
}




public class MainBiblioteca {

    public static void main(String[] args) {
        Biblioteca libro1 = new Biblioteca("Geronimo",10,2,200,"Mondadori","Elisabetta Dami",20);
        libro1.stampa();
    }
}

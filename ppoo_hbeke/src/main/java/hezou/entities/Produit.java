/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.entities;

/**
 *
 * @author BEKE hezou
 */
public class Produit {
    
    private int idProduit;
    private String libelle;
     private boolean actif;
     
     public Produit(String libelle, boolean actif) {
        this.libelle = libelle;
        this.actif = actif;
    }

    public Produit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

  

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }
    


    public String getLibelle() {
        return libelle;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    
}

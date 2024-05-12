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
    private String actif;


    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setActif(String actif) {
        this.actif = actif;
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

    public String getActif() {
        return actif;
    }
    
}

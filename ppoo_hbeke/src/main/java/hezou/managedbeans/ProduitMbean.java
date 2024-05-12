/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.managedbeans;

import hezou.entities.Produit;
import hezou.services.ProduitService;

/**
 *
 * @author BEKE hezou
 */
public class ProduitMbean {
   
    private ProduitService produitService;

    public void addProduitsActifs() {
        Produit epargne = new Produit("Epargne", true);
        Produit courant = new Produit("Courant", true);
        produitService.addProduit(epargne);
        produitService.addProduit(courant);
        System.out.println("Les produits actifs ont été ajoutés avec succès.");
    }
    
}


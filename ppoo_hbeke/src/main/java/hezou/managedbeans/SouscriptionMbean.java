/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.managedbeans;

import hezou.entities.Client;
import hezou.entities.Produit;
import hezou.services.ClientService;
import hezou.services.ProduitService;
import hezou.services.SouscriptionService;

/**
 *
 * @author BEKE hezou
 */
public class SouscriptionMbean {
 private ProduitService produitService;
    private SouscriptionService souscriptionService;
    private ClientService clientService;

        private int idClient1; 
        private int idClient2; 
        
    public void souscrireProduit() {
        
        Client client1 = clientService.getClientById(idClient1); 
        Produit epargne = produitService.getProduitByName("Epargne");
        Produit courant = produitService.getProduitByName("Courant");
        souscriptionService.souscrireProduit(client1, epargne);
        souscriptionService.souscrireProduit(client1, courant);
        System.out.println("Souscriptions aux produits pour client1 effectuées avec succès.");
        
 
        Client client2 = clientService.getClientById(idClient2); 
        souscriptionService.souscrireProduit(client2, courant);
        System.out.println("Souscription au produit pour client2 effectuée avec succès.");
    }
    
}

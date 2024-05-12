/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hezou.services;

import hezou.entities.Souscription;
import java.util.List;

/**
 *
 * @author BEKE hezou
 */
public interface SouscriptionService {
    
    void addSouscription(Souscription souscription);
    
    void updateSouscription(Souscription souscription);
    
    void deleteSouscription(int Id);

    Souscription getSouscriptionById(int Id);
    
 
    List<Souscription> getSouscriptionsByClientId(int iclient);
    
    List<Souscription> getAllSouscriptions();
}

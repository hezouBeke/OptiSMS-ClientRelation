/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hezou.services;

import hezou.entities.Client;
import java.util.List;

/**
 *
 * @author BEKE hezou
 */
public interface ClientService {
    
    void addClient(Client client);
    
    Client getClientById(int idClient);
    
    List<Client> getAllClients();
 
    void updateClient(Client client);
    
    void deleteClient(int idClient);
}

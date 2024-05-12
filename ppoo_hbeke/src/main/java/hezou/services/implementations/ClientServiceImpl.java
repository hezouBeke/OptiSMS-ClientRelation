/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hezou.services.implementations;

import hezou.entities.Client;
import hezou.services.ClientService;

/**
 *
 * @author BEKE hezou
 */
public class ClientServiceImpl implements ClientService {
     private ClientService clientService;

    // Constructeur pour l'injection de dépendances du DAO
    public ClientServiceImpl(ClienService clientService) {
        this.clientService = clientService;
    }

    @Override
    public void addClient(Client client) {
        clientDAO.addClient(client);
    }
    
    
}

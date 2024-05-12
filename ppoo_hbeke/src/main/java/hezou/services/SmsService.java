/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hezou.services;

import hezou.entities.Sms;
import java.util.List;

/**
 *
 * @author BEKE hezou
 */
public interface SmsService {
     void envoyerSMS(Sms sms);
    
   
    void updateStatutSMS(int Id, boolean statut);
    
   
    void deleteSMS(int id);
    
   
    Sms getSMSById(int Id);
    
   
    List<Sms> getSMSByclientId(int IdClient);
    
    List<Sms> getAllSMS();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import ma.service.EmployeService;
import ma.beans.Employe;

/**
 *
 * @author PC
 */
public class TestEmploye {
    public static void main(String[] args) {
         EmployeService es = new EmployeService();
    
    //creation d'un employee 
      //   es.create(new Employe("Lagnidi", "Amina"));
        // es.create(new Employe("Laili", "assmae"));
         // es.create(new Employe("amina", "amina"));
         
         //modification des clients
        /// Employe e = es.findById(5);
        // e.setNom("Houda");
       //  e.setPrenom("Ahmed");
       //  es.update(e);
         
         //supression d'une employee
         es.delete(es.findById(6));
         
         
         //afficher touts les employee
         for(Employe em : es.findAll()){
             System.out.println(em+"\n");
         }
             
       
         
    }
  
   
    
    
    
}

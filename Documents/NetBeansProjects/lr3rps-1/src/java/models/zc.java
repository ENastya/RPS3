/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;

/**
 *
 * @author Настя
 */
public class zc {
   @PrePersist 
   void userPrePersist (User user) {
   System.out.println("userPrePersist loaded");
   }
   
   @PostRemove 
   void userPostRemove (User user) {
   System.out.println("userPostRemove loaded");
   }
   
   @PreRemove 
   void userPreRemove (User user) {
   System.out.println("userPreRemove loaded");
   }
}

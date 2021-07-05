/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import static hospital.HospitalManagementSystem.No_of_active_pat;
import static hospital.HospitalManagementSystem.No_of_admitted_pat;
import static hospital.HospitalManagementSystem.No_of_patients;
import static hospital.HospitalManagementSystem.No_of_rooms;
import static hospital.HospitalManagementSystem.objarray;

/**
 *
 * @author Admin Trisha Baldha (18BCP118)
 */
public class HospitalManagementSystem {
    
    public static int No_of_rooms=100;
    public static int No_of_Doctors =11;
    public static int No_of_patients =0;
    public static int No_of_active_pat =0;
    public static int No_of_admitted_pat =0;
    public static Patient_details[] objarray = new Patient_details[20];
    
    public static class Patient_details{
        
        
        public int patient_id;
        public String name;
        public int contact;         
        public int age;
        public boolean status;
        public boolean admitted;
        public String gender;
        public String doc; 
        
        Patient_details(String name,int contact, int age ,boolean status, boolean admitted, String doc, String gender)
        {
          this.patient_id = 100 + 1 + No_of_patients;
          this.name = name;
          this.contact = contact;
          this.age = age;
          this.status = status;
          this.admitted = admitted;
          this.doc = doc;
          this.gender = gender;
          
          if(this.status == true)
          {
              No_of_active_pat++;
          }
          if(this.admitted == true)
          {
              No_of_admitted_pat ++;
              No_of_rooms--;
          }
          objarray[No_of_patients] = this;
          No_of_patients++;
      
        }
    
    
    
    }

        
    
     
            
        
    
    
    
    
  
    public static void main(String[] args) {
        
        Patient_details P2 = new Patient_details("Raj Kundra",123456789,12,true,true,"Rajesh Sharma","male");
        Patient_details P3 = new Patient_details("Neha Sharma",123456789,24,false,false,"Amrita Patel ","female");
        Patient_details P4 = new Patient_details("Sunil Mehta",123456789,47,true,false,"Amrita Shah","male");
        Patient_details P5 = new Patient_details("Aditya Singh",123456789,34,true,true,"Ravi Tiwari","male");
        Patient_details P6 = new Patient_details("Aditi Joshi",123456789,34,true,false,"Abhinav Patil","female");
        Patient_details P7 = new Patient_details("Suresh Sukla",123456789,64,true,true,"Meet Joshi","male");
        
        new Hospital().setVisible(true);
        // TODO code application logic here
        
    }
    
}

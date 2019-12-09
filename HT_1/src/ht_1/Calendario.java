
package ht_1;


public class Calendario {
    
    public void Calendario(int dia, int mes , int año){
        
        System.out.println(dia+"/"+mes+"/"+año);
           switch(mes){
               case 1: System.out.println(dia);
               break;
               case 2: System.out.println(dia+31);
               break;
               case 3: System.out.println(dia+58);
               break;
               case 4: System.out.println(dia+90);
               break;
               case 5: System.out.println(dia+120);
               break;
               case 6: System.out.println(dia+151);
               break;
               case 7: System.out.println(dia+181);
               break;
               case 8: System.out.println(dia+212);
               break;
               case 9: System.out.println(dia+243);
               break;
               case 10: System.out.println(dia+273);
               break;
               case 11: System.out.println(dia+304);
               break;
               case 12: System.out.println(dia+334);
               break;
               
           }
           
       
    }
    
}


package ht_1;

public class MediaE {
    
   public void MediaEd(int a,int b,int c,int d, int e,int f){
      int cont=0;
       
           
           if(a>=18){cont=cont+1;
           }  
           if(b>=18){cont=cont+1;
           }
           if(c>=18){cont=cont+1;
           }
           if(d>=18){cont=cont+1;
           }
           if(e>=18){cont=cont+1;
           } 
           if(f>=18){cont=cont+1;
           } else{
               cont=cont;
           }
       
       
       System.out.println("alumnos mayores a 18 años: "+ cont);
       int m=(a+b+c+d+e+f)/6;
       System.out.println("edad media: " + m);
       
   }
   
      public void MediaEs(double aa,double bb,double cc,double dd, double ee,double ff){
      int cont=0;
      
           if(aa>=1.70){cont=cont+1;
           } 
               if(bb>=1.70){cont=cont+1;
           } 
               if(cc>=1.70){cont=cont+1;
           } 
               if(dd>=1.70){cont=cont+1;
           } 
               if(ee>=1.70){cont=cont+1;
           } 
               if(ff>=1.70){cont=cont+1;
           }else{
                   cont=cont;
               }    
       
       System.out.println("alumnos mayores a 18 años: "+ cont);
       double mm=(aa+bb+cc+dd+ee+ff)/6;
       System.out.println("edad media: " + mm);
       
   }
   
   
   } 
    
   

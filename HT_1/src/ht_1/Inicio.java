package ht_1;

import java.util.Scanner;

public class Inicio {
ContarDigitos con= new ContarDigitos();
Calendario cal= new Calendario();
Convercione cv = new Convercione();
MediaE Me = new MediaE();
    int in = 0;
    Scanner Entrada = new Scanner(System.in);

    public void inicio() {
        System.out.println("Bienvenido a la HT1");
        System.out.println("porfavor preciona un numero");
        System.out.println("--+--+--+--+--+--+--+--+--+--");
        System.out.println("1) conteo de digitos en un numero"+
                            "\n2) numero de dia en el año mediante fecha" +
                             "\n3) comvercion de masa y longitud" +
                              "\n4) edad y estatura media de alumnos" );
        in = Entrada.nextInt();
        if (in <=4){
               Opcion(in);
        }else{
            System.out.println("ingresa de nuevo el numero");
            in = Entrada.nextInt();
            Opcion(in);
        }
     

    }
    
    public void Opcion(int in){
        switch (in) {
            case 1:System.out.println("ingresa un numero");
                 double dig;
                 dig=Entrada.nextDouble();
                 con.ContarDigitos(dig);
                
                break;
            case 2:
                int dia;
                int mes;
                int año;
                System.out.println("ingresa: Dia");
                dia= Entrada.nextInt();
                System.out.println("ingresa: Mes");
                mes= Entrada.nextInt();
                System.out.println("ingresa: Año");
                año= Entrada.nextInt();
                cal.Calendario(dia, mes,año);
                break;
            case 3:  double pul;
                double kil;
                System.out.println("ingresa las pulgadas:");
                pul= Entrada.nextDouble();
               System.out.println("ingresa las kilogramos:");
               kil= Entrada.nextDouble();
               cv.Convercione(pul,kil);
               
                break;
            case 4: 
                int a[]=new int[6];
                double b[]=new double[6];
                
                for(int i=0;i<=5;i++){
                    int e=i+1;
                    System.out.println("ingresa la edad del alumno numero: " + e);
                    a[i]= Entrada.nextInt();
                                
               }
                 for(int i=0;i<=5;i++){
                    int e=i+1;
                    System.out.println("ingresa la altura del alumno numero: " + e);
                    b[i]= Entrada.nextDouble();
                                
               }
               Me.MediaEd(a[0], a[1], a[2], a[3], a[4], a[5]); 
                System.out.println("--+--+--+--+--+--+--+--+--+--"); 
                Me.MediaEs(b[0], b[1], b[2], b[3], b[4], b[5]);
                
                break;
        }
    }

}


/**
* @author Rebecca Smith 
* @date 19/01/2021
* @proposito Clase--> Post
* @seccion 30
*/

import java.util.*;

public class Vista{
  int opcion = 0;

  public void menu(Radio radio){
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Bienvenido al radio\n===================");
    System.out.println(showStation(radio));
    System.out.println("===================\nEliga una opción\n1. Enceder radio");
    System.out.println("2. Cambiar de AM a FM o de FM a AM");
    System.out.println("3. Avanzar emisora");
    System.out.println("4. Guardar emisora actual");
    System.out.println("5. Seleccionar emisora guardada");
    System.out.println("6. Apagar el radio");

    opcion = scan.nextInt();

  }

  public int getOpcion(){
    return opcion;
  }

  //Métodos locales para mostrar emisora

  public boolean getAMFMbool(Radio radio){
    boolean x = radio.amfm();
    x = radio.amfm();
    return x;
  }

  public String getAMFMstr(Radio radio){
    boolean x = radio.amfm();
    x = radio.amfm();
    if(x){
      return "AM";
    }
    else{
      return "FM";
    }
  }

  public double getStation(Radio radio){
    boolean amfmState = getAMFMbool(radio);
    double station = 0.0;
    if(amfmState){
      for(int i=1; i<=109;i++){
        station = radio.avanzar();
      }
      return station;
    }
    else{
      for(int i=1; i<=101;i++){
        station = radio.avanzar();
      }
      return station;
    }
  }

  public String showStation(Radio radio){
    String station = String.valueOf(getStation(radio));
    String amfm = getAMFMstr(radio);
    String str = station + " " + amfm;
    return str;
  }

}




























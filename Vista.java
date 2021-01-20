
/**
* @author Rebecca Smith 
* @date 19/01/2021
* @proposito Clase--> Post
* @seccion 30
*/

public class Vista(){
  int opcion = 0;

  public void menu(Radio radio){
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Bienvenido al radio");
    System.out.println(showStation(radio));
    System.out.println("Eliga una opción\n1. Enceder radio");
    System.out.println("2. Cambiar de AM a FM o de FM a AM");
    System.out.println("3. Avanzar emisora");
    System.out.println("4. Guardar emisora actual");
    System.out.println("5. Seleccionar emisora guardada");
    System.out.println("6. Apagar el radio");

    opcion = scan.nextInt();

  }

  //Métodos locales para mostrar emisora
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
    double station;
    if(amfmState){
      for(int i;i<=109;i++){
        station = radio.avanzar();
      }
      return station;
    }
    else{
      for(int i;i<=101;i++){
        station radio.avanzar();
      }
      return station;
    }
  }

  public String showStation(Radio radio){
    String station = String.valueOf(getStation(radio));
    String amfm = getAMFMstr(radio);
    String str = "===================\n" + station + " " + amfm + "\n===================";
    return str;
  }

}




























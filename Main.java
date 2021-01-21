import java.util.Scanner;
class Main {
  

  public static void main(String[] args) {

    Vista vis = new Vista();

    Radio radio = new Radio();
    
    Scanner scan = new Scanner(System.in);
    int op = 0;
    
    while(op != 6){
      
      try{
        System.out.println("\n");
        vis.menu(radio);
        op = vis.getOpcion();
        if (op == 1){
          System.out.println("El radio ya está encendido");     
        }else if( op == 2){
          radio.amfm();
        }else if (op == 3){
          radio.avanzar();
        }else if (op == 4){
          System.out.println("Eliga en que boton desea guardar la emisora actual");
          int btn = scan.nextInt();
          radio.guardar(btn);
          String estacion = showStation(radio);
          System.out.println("Emisora: " + estacion + " guardada en botón: "+ btn);
        }else if(op == 5){
          System.out.println("Seleccione un botón del 1 al 12");
          int btn = scan.nextInt();
          String msj = radio.seleccionar(btn);
          System.out.println(msj);
        }else if(op == 6){
          System.out.println("Hasta pronto :)");
        }
        else{
          System.out.println("Ingrese una opcion correcta");
        }

        }catch(Exception e){
          System.out.println("Ingrese un numero para elegir su opcion");
          scan.next();
          continue;

        }

    
    }
    
  }

  //Métodos Gets 
  public static boolean getAMFMbool(Radio radio){
    boolean x = radio.amfm();
    x = radio.amfm();
    return x;
  }

  public static String getAMFMstr(Radio radio){
    boolean x = radio.amfm();
    x = radio.amfm();
    if(x){
      return "AM";
    }
    else{
      return "FM";
    }
  }

  public static boolean getStatus(Radio radio){
    boolean x = radio.encenderApagar();
    x = radio.encenderApagar();
    return x;
  }

  public static double getStation(Radio radio){
    boolean amfmState = getAMFMbool(radio);
    double station = 0.0;
    if(amfmState){
      for(int i=1;i<=109;i++){
        station = radio.avanzar();
      }
      return station;
    }
    else{
      for(int i=1;i<=101;i++){
        station = radio.avanzar();
      }
      return station;
    }
  }

  public static String showStation(Radio radio){
    String station = String.valueOf(getStation(radio));
    String amfm = getAMFMstr(radio);
    String str = "===================\n" + station + " " + amfm + "\n===================";
    return str;
  }
}

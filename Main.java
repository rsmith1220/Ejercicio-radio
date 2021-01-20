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
          int bnt = scan.nextInt();
          radio.guardar(btn);
          System.out.println("Emisora: " + showStation(radio) + " guardada en botón: "+ btn);
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

  public boolean getStatus(Radio radio){
    boolean x = radio.encenderApagar();
    x = radio.encenderApagar();
    return x;
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

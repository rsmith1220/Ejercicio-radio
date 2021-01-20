import java.util.Scanner;
class Main {
  

  public static void main(String[] args) {

    Vista vis = new Vista();
    
    Scanner scan = new Scanner(System.in);
    int op = 0;
    
    while(op != 6){
      
      try{
        System.out.println("\n");
        vis.menu();
        op = vis.getOpcion();
        if (op == 1){
        System.out.println("El radio ha sido encendido");
        
        }else if( op == 2){
          System.out.println("opcion 2");
        }else if (op == 3){
          System.out.println("Ha cambiado de emisora");
        }else if (op == 4){
          System.out.println("Eliga la emisora que quiere guardar");
        }else if(op == 5){
          System.out.println("Seleccione una emisora que ha guardado");
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
}

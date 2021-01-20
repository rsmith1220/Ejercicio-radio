
/**
* @author Rebecca Smith 
* @date 19/01/2021
* @proposito Clase--> Post
* @seccion 30
*/

class Vista(){
    int opcion = 0;

public menu(){
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Bienvenido al radio\nEliga una opcion");
  System.out.println("1. Enceder radio");
  System.out.println("2. Cambiar de AM a FM o de FM a AM");
  System.out.println("3. Cambiar emisora");
  System.out.println("4. Guardar una emisora");
  System.out.println("5. Seleccionar emisora guardada");
  System.out.println("6. Apagar el radio");

  opcion = scan.nextInt();

}

}
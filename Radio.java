/**
* @author Jose De La Vega 
* @fecha 07/10/2020
* @proposito Clase--> Post
* @seccion POO 40
*/

import java.util.*;


public class Radio implements Interface{
  //atributos
  protected boolean onStatus;
  protected boolean amfmStatus;
  protected double currentAM;
  protected double currentFM;
  protected double botones[];

  //constructor
  public Radio(){
  	onStatus = true;
  	amfmStatus = true;
  	currentAM = 530.0;
  	currentFM = 87.9;
  	botones = new double[12];
  }

  //métodos de interfaz
  public boolean encenderApagar(){
  	if (onStatus){
  		onStatus = false;
  	}
  	else{
  		onStatus = true;
  	}
    return onStatus;
  }

  public boolean amfm(){
  	if (amfmStatus){
  		amfmStatus = false;
  	}
  	else{
  		amfmStatus = true;
  	}
    return amfmStatus;
  }

  public String guardar(int btn){
  	if(amfmStatus){
  		botones[btn-1] = currentAM;
  		String btnStr = String.valueOf(btn);
  		String amStr = String.valueOf(currentAM);
  		String str = "Estación: " + amStr + " AM --> Guardada en boton " + btnStr;
  		return str;
  	}
  	else{
  		botones[btn-1] = currentFM;
  		String btnStr = String.valueOf(btn);
  		String amStr = String.valueOf(currentFM);
  		String str = "Estación: " + amStr + " FM --> Guardada en boton " + btnStr;
  		return str;
  	}
  }

  public String seleccionar(int btn){
    double station = botones[btn-1];
    if(station == 0){
      return "Este botón no ha sido asignado";
    }
  	else if(station > 200.0){
  		currentAM = station;
  		String amStr = String.valueOf(currentAM);
  		String str = "La estación actual es: " + amStr + " AM";
  		return str;
  	}
  	else{
  		currentFM = station;
  		String fmStr = String.valueOf(currentFM);
  		String str = "La estación actual es: " + fmStr + " FM";
  		return str;
  	}
  }

  public double avanzar(){
  	if(amfmStatus){
  		if(currentAM == 1610.0){
  			currentAM = 530.0;
  			return currentAM;
  		}
  		else{
  			currentAM = currentAM + 10.0;
  			return currentAM;
  		}
  	}
  	else{
  		if(currentFM == 107.9){
  			currentFM = 87.9;
  			return currentFM;
  		}
  		else{
        currentFM = currentFM * 10;
        currentFM = currentFM + 2;
  			currentFM = currentFM / 10;
  			return currentFM;
  		}
  	}
  }

  //métodos Gets

  //otros métodos
}

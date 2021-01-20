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
  protected double listAM[];
  protected double listFM[];

  //constructor
  public Radio(){
  	onStatus = false;
  	amfmStatus = true;
  	currentAM = 530.0;
  	currentFM = 87.9;
  	listAM = new double[12];
  	listFM = new double[12];
  }

  //métodos de interfaz
  public boolean encenderApagar(){
  	if (onStatus){
  		onStatus = false;
  	}
  	else{
  		onStatus = true;
  	}
  }

  public boolean amfm(){
  	if (amfmStatus){
  		amfmStatus = false;
  	}
  	else{
  		amfmStatus = true;
  	}
  }

  public String guardar(int btn){
  	if(amfmStatus){
  		listAM[btn-1] = currentAM;
  		String btnStr = String.valueOf(btn);
  		String amStr = String.valueOf(currentAM)
  		String str = "Estación: " + amStr + " AM --> Guardada en boton " + btnStr;
  		return str;
  	}
  	else{
  		listFM[btn-1] = currentFM;
  		String btnStr = String.valueOf(btn);
  		String amStr = String.valueOf(currentFM)
  		String str = "Estación: " + amStr + " FM --> Guardada en boton " + btnStr;
  		return str;
  	}
  }

  public String seleccionar(int btn){
  	if(amfmStatus){
  		currentAM = listAM[btn-1];
  		String amStr = String.valueOf(currentAM);
  		String str = "La estación actual es: " + amStr + " AM";
  		return str;
  	}
  	else{
  		currentFM = listFM[btn-1];
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
  			currentFM = currentFM + 0.2;
  			return currentFM;
  		}
  	}
  }

  //métodos Gets

  //otros métodos
}

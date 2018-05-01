/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentrabajo;

/**
 *
 * @author Erick
 */
public class Bomberman {


// matriz de bombas
int laberinto [][]={
    {0, 0, 1, 1,0},
    {0, 0, 0, 0,1},
    {1, 0, 1, 0,0},
    {1, 1, 1, 1,1},
    {1, 0, 1, 0,1}
};

int f = 3;
int c = 3; // filas y columnas del laberinto

void imprime_matriz(){
	int i, j;
	for(i = 0; i < f; i++){
		for(j = 0; j < c; j++){
			System.out.print( laberinto[i][j]);
		}
		System.out.print("\n");
	}
	System.out.printf("\n");
}


void buscar_camino(int x, int y, int b, int i){
    
    if((laberinto[x][y] == 0) &&         
		((x < f) && (x >= 0)) && 
		((y < c) && (y >= 0)) &&
		(b >= 0)) { 
        laberinto[x][y] = 2; //hizo explosion
	} else if((laberinto[x][y] == 1) &&
        ((x < f) && (x >= 0)) && 
		((y < c) && (y >= 0)) &&
		(b >= 0)){
        laberinto[x][y] = 2; //hizo expolision
		buscar_camino(x+1, y, i, i);
		buscar_camino(x, y+1, i, i); 
		buscar_camino(x-1, y, i, i); 
		buscar_camino(x, y-1, i, i);
	}
}
public static void main(String[]x){
    
    
	Bomberman a =  new Bomberman();
        a.imprime_matriz(); 
	a.buscar_camino(3,0, 1, 1);
	a.imprime_matriz();	
	
}
    
    
    
}

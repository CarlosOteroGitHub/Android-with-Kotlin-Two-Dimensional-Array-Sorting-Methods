package com.example.myapplicationkootlin

class Clase1 {

    //Metodo de Ordenamiento: "Burbuja".
    fun ordenamientoBurbuja(matriz: Array<IntArray>) {
        var aux:Int = 0;
        for(i in 0..matriz.size-1){
            for(j in 0..matriz[i].size-1){
                for(k in 0..matriz.size-1){
                    for(l in 0..matriz[k].size-1){
                        if(matriz[i][j]>matriz[k][l]){
                            aux=matriz[i][j];
                            matriz[i][j]=matriz[k][l];
                            matriz[k][l]=aux;
                        }
                    }
                }
            }
        }
    }

    //Metodo para Imprimir los Valores de la Matriz
    fun imprimirValores(matriz: Array<IntArray>): String {
        var guardar:String = "";
        for(i in 0..matriz.size-1){
            for(j in 0..matriz[i].size-1){
                guardar += "[" + matriz[i][j] + "] ";
            }
            guardar += "\n";
        }
        return guardar;
    }
}
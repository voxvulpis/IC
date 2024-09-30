package br.unesp;

public class Vector {

    private Vector(){

    }

    public static boolean equal(int[] a, int[] b){
        if((a == null) || (b == null)){
            throw new IllegalArgumentException("null argument");
        }
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean size(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Valores negativos não permitidos");
        }

        return a==b;
    }

}

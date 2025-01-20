package br.unesp;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VectorService {
    private VectorService(){

    }
    
    public boolean equal(int a[], int b[]){
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

    public boolean size(int a, int b){
        if ((a < 0) || (b < 0)) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }

        return a==b;
    }
}

package br.unesp.junitTutorial;

public class Vector {
    private Vector(){}

    public static boolean equals(int[] a, int[] b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Null argument");
        }
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++) 
            if(a[i] != b[i]) return false;
        
        return true;
    }

    public static boolean size(int[] a, int[] b){
        return a.length == b.length;
    }
}

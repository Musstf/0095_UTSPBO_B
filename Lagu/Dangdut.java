/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Muss
 */
public class Dangdut {
    
 String Penyanyi = "Ayu Ting Ting";
    String lagu ="Alamat Palsu";
    
    Dangdutstatic static {
        
    }
    private String penyanyi;
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    public void song (String Lagu){
        this.lagu = lagu;
        
    }
    
    Private void cetakLabel(){
        System.out.println(this.penyanyi+ "<=>" +this.lagu);
    }

    void song(String via_Vallen, String kopi_Dangdut) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Dangdutstatic {

        public Dangdutstatic() {
        }
    }

    private static class Private {

        public Private() {
        }
    }
}    


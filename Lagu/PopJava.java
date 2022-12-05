/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Muss
 */
public class PopJava {
    
    String Penyanyi = "Raisa";
    String lagu ="kali Kedua";
    private String penyanyi;
    
    PopJava{
        
    }
    
    PopJavaing penayanyi,String lagu){
        this.Penyanyi = penyanyi ;
        this.lagu = lagu ;
        System.out.println(this.penyanyi + "<=>" + this.lagu );
        
    }
    public void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    protected void song (String Lagu){
        this.lagu = lagu;
        
    }
    
    Private void cetakLabel(){
        System.out.println(this.penyanyi+ "<=>" +this.lagu);
    }

    private static class Private {

        public Private() {
        }
    }

    private static class lagu {

        public lagu() {
        }
    }

    private static class PopJavaing {

        public PopJavaing() {
        }
    }
}    


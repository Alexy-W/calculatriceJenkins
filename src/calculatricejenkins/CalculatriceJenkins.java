/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatricejenkins;

/**
 *
 * @author alexywehrey
 */
public class CalculatriceJenkins {

    /**
     * @param args the command line arguments
     */
    
    
    public CalculatriceJenkins(){}
    
    
    public int somme( int a, int b){
        return a+b;
    }
    
    public int soustraction(int a, int b){
        return a-b;
    }
    
    public int division(int a, int b){
        if(a!=0){
            return a/b;
        }
        return 0;
    }
    
    public int mutiplication(int a, int b){
        return a*b;
    }
    
}
    


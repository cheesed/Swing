/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.integrador.javaswing;

/**
 *
 * @author Info7
 */
public class Conversora {
        double CelsiusToFahrenheit(double ctemp){
        double fTemp;
        fTemp= ctemp * 9/5 + 32;
        return fTemp;
        }
        double CelsiusToKelvin(double ctemp){
        double kTemp;
        kTemp=  ctemp  + 273.15;
        return kTemp;  
        }
        double FahrenheitToCelsius(double fTemp){
        double cTemp;
        cTemp= (fTemp -32) *5 /9  ;
        return cTemp;  
        }
        double FahrenheitToKelvin(double fTemp){
        double kTemp;
        kTemp= (fTemp -32) *5 /9 + 273.15  ;
        return kTemp;  
        }
        double KelvinToCelsius (double kTemp){
        double cTemp;
        cTemp= (kTemp -273.15) ;
        return cTemp;  
        }
        double KelvinToFahrenheit (double kTemp){
        double fTemp;
        fTemp= (kTemp -273.15)*9 /5 +32 ;
        return fTemp;  
        }

    public Conversora() {
    }
        
        
}

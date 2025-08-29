import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String [] args) {
        Scanner sc = new
        Scanner(System.in);
        
        //Input temperature value 
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        
        // Input original unit 
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = 
        sc.next().toUpperCase().charAt(0);
        
        double celsius, fahrenheit, kelvin;
        
        switch (unit) {
            case 'C':
                celsius = temp;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        
        System.out.println("Kelvin: " + kelvin + " K");
                 break;
                 
            case 'F':
                fahrenheit = temp;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                
        System.out.println("Celsius: " + celsius + "°C");
        
        System.out.println("Kelvin: " + kelvin + " K");
                 break;
                 
                 case 'K': 
                     kelvin =  temp;
                     celsius = kelvin -273.15;
                     fahrenheit = (celsius * 9/5) + 32;
                     
        System.out.println("Celsius: " + celsius + "°C");
        
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
                      break;
                      
                    default:
                        
        System.out.println("Invalid unit entered.");
    }
    
              sc.close();
              
                
                
                
                 
                
                
                
                
                
                

        }
        
    }

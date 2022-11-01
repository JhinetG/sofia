import java.util.Scanner;
class salario {
public static void main(String[] args) {
String nombre; 
double sueldo;
int horas;
Scanner entrada= new Scanner(System.in);

System.out.println("¿Cual es su nombre?: ");
nombre= entrada.next();

System.out.println("¿Cual es us salario por hora?: ");
sueldo= entrada.nextDouble();
  
System.out.println("¿Cauntas horas trabajada al mes?: ");  
horas= entrada.nextInt();

sueldo = sueldo * horas;

  if(sueldo >= 450000){
  System.out.println("Su nombre es: " + nombre +sueldo);
    }
  else{
    System.out.println("Su nombre es: " + nombre);
  }
}
  
}
      
  
    

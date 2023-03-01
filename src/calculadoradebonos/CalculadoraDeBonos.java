package CalculadoraDeBonos;

public class CalculadoraDeBonos {
    int salario; 
        String mensajeDeBono; 
        public void calcular (){
        salario = 50000;
        MensajeDeBono = "tu bono total es de: $" + (.02*salario);
        System.out.println(MensajeDeBono);
        
        }
   public static void main(String[] args) {
        CalculadoraDeBonos NuevoBono = new CalculadoraDeBonos ();
        NuevoBono.calcular();}

}

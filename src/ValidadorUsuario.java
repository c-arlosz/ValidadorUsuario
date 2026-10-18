import java.util.Locale;

public class ValidadorUsuario {
    public static void main (String[] args){
        String entradaNombre = "   jUaN cArLoS pErEz   ";
        String entradaEmail  = "   JUAN.PEREZ@Universidad.edu.mx   ";

        if (entradaNombre.isBlank() || entradaEmail.isBlank()){
            System.out.println("Error algunos de los espacios esta en blanco");
            return;
        }
        String emaillimpio = entradaEmail.strip();
        String nomlimpio = entradaNombre.strip();
        emaillimpio = emaillimpio.toLowerCase();
        boolean dominio = emaillimpio.endsWith(".edu.mx");
        int fin = nomlimpio.indexOf(" ");
        String nombre = nomlimpio.substring(0,fin);

        System.out.println("reporte");
        System.out.println(nomlimpio);
        System.out.println(emaillimpio);
        System.out.println("dominio = " + dominio);
        System.out.println(nombre);



    }
}

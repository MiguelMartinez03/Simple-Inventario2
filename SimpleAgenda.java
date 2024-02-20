import java.util.Scanner;

public class SimpleAgenda {
    // Método sin parámetros para agregar un contacto
    public void agregarContacto() {
        Scanner scanner = new Scanner(System.in);
        String contacto;

        System.out.println("Ingrese un contacto a agregar:");
        contacto = scanner.nextLine();

        if (contacto.length() > 4 && contacto.length() < 8) {
            System.out.println("Contacto agregado con éxito.");
        } else if (contacto.length() >= 8 && contacto.length() <= 30) {
            System.out.println("Agregado, contiene entre 8-30 caracteres.");
        } else {
            System.out.println("Nombre muy largo.");
        }
    }

    // Método sin parámetros para remover un contacto
    public void removerContacto(int id) {
        if (id >= 1000 && id <= 9999) {
            System.out.println("Verificando contacto a eliminar...");
        } else {
            System.out.println("ID inválido.");
        }
    }

    // Método sin parámetros para mostrar contactos
    public void mostrarContactos() {
        System.out.println("Mostrando contactos...");
    }

    public static void main(String[] args) {
        SimpleAgenda simpleAgenda = new SimpleAgenda();

        // Probando cada método
        simpleAgenda.agregarContacto();
        simpleAgenda.removerContacto(500); // Cambia este valor para probar diferentes casos
        simpleAgenda.mostrarContactos();
    }
}

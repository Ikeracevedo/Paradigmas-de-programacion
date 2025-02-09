import java.util.ArrayList;
import java.util.Scanner;

public class paradigEstructurado {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcServicios, opcCarrera,opcPeriodo,creditos,opcLiquidar;
        String correoUsuario,contraseñaUsuario, opcMateria;
        ArrayList<String> dataCorreos = new ArrayList<>(), dataContraseñas = new ArrayList<>(),dataMaterias = new ArrayList<>();

        dataCorreos.add("iker");    //Aqui pueden agregar mas correros y contraseñas
        dataContraseñas.add("123456");      //Utilizar este array de ejemplo de bases de datos

        System.out.println("    Bienvenidos a la univeridad Sergio Arboleda");
        System.out.println("Ingrese su correo electronico");
        correoUsuario = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseñaUsuario = sc.nextLine();

        for (String correo : dataCorreos) {

            if(correo.equals(correoUsuario)){
                System.out.println("Existe");
                for (String contraseña : dataContraseñas) {
                    if (contraseña.equals(contraseñaUsuario)) {
                        System.out.println("            Contraseña correcta");
                        System.out.println("    SERVICIOS DE ESTUDIANTES");
                        System.out.println("    Selecciona una opcion de acuerdo a su numero");
                        System.out.println("1.Pagos en linea");
                        System.out.println("2.Consulta tu horario de clases");
                        System.out.println("3.Consulta de normativas");
                        System.out.println("4.Consulta tus promedios academicos");
                        System.out.println("5.Consulta tus notas parciales (pregrado)");
                        System.out.println("6.Inscribe tus asignaturas");
                        System.out.println("7.Solicitud de certificaciones");
                        System.out.println("8.Solitudes academicas y administrativas");
                        System.out.println("9.Consulta tus notas definitivas");
                        System.out.println("10.Postula para grafo");
                        System.out.println("11.Consulta tu cita de matricula");
                        System.out.println("12.Actualiza tus datos personales");
                        System.out.println("13.Informe de egreso no graduado");
                        opcServicios = sc.nextInt();
                        if(opcServicios==6){
                            System.out.println("                Selecciona tu carrera");
                            System.out.println("1. Ciencias de Computacion");
                            System.out.println("2. Psicologia");
                            System.out.println("3. Administracion de Empresas ");
                            opcCarrera = sc.nextInt();

                            if ((opcCarrera == 1)||(opcCarrera == 3)) {
                                System.out.println("            Ingresa tu periodo academico");
                                opcPeriodo = sc.nextInt();
                                creditos=0;
                                sc.nextLine();
                                while (creditos<7) {
                                opcMateria = null;
                                System.out.println("            Ingrese el nombre0 de la materia");
                                System.out.println("Paradigmas de programacion ");
                                System.out.println("Estructuras de Datos ");
                                System.out.println("Arquitecturas de Computadores");
                                System.out.println("Analisis Matematico ");
                                opcMateria = sc.nextLine();
                                dataMaterias.add(opcMateria);
                                creditos++;
                                }
                                System.out.println("        MATERIAS PREINSCRITAS");
                                for (String materia : dataMaterias) {
                                    System.out.println(materia);   
                                }
                                Thread.sleep(2000);
                                System.out.println("Desea liquidar la matricula?");
                                System.out.println("Marque 1 para SI");
                                System.out.println("Marque 2 para NO");
                                opcLiquidar = sc.nextInt();
                                if (opcLiquidar == 1) {
                                    System.out.println("Generando recibo de matricula.....");
                                    Thread.sleep(3000);
                                    System.out.println("Recibo generado y enviado al correo");
                                }else{
                                    System.out.println("Saliendo del programa... ");
                                    System.exit(0);
                                }

                            }
                        }else{
                            System.out.println("Error");
                        }
                    }else{
                        System.out.println("Contraseña incorrecta");
                    }
                    
                }
            }else{
                System.out.println("No existe ese correo");
            }
        }
    }
}
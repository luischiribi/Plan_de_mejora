package juegoplata;
import java.util.*;

public class juego {

    private int respuesta;
    private int respuesta2;
    private int repuesta3;
    private int repuesta4;
    
    public juego(){

    }
    public juego(int respuesta,int respuesta2,int respuesta3,int respuesta4){
        
        this.respuesta=respuesta;
        this.respuesta2=respuesta2;
        this.repuesta3=respuesta3;
        this.repuesta4=respuesta4;
    }

    

    public int getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    public int getRespuesta2() {
        return respuesta2;
    }
    public void setRespuesta2(int respuesta2) {
        this.respuesta2 = respuesta2;
    }
    public int getRepuesta3() {
        return repuesta3;
    }
    public void setRepuesta3(int repuesta3) {
        this.repuesta3 = repuesta3;
    }
    public int getRepuesta4() {
        return repuesta4;
    }
    public void setRepuesta4(int repuesta4) {
        this.repuesta4 = repuesta4;
    }



    Scanner entrada = new Scanner(System.in);
    
    public void preguntas() {

        System.out.println("Bienvenido a este gran juego el dia de hoy pondras a prueba tus conocimientos sobre la amada colombia");

        System.out.println("Tendras preguntas con 3 opciones de respuesta (0, 1 y 2) si aciertas sigues si pierdes sales del juego");
        
        System.out.println("1.¿Cual de estas tres ciudades se localizan en las costas del mar caribe?");

        System.out.println(" \n0 :Tumacoi,Buenaventura y nuqui  \n1 :Santa marta,Barranquilla y Cartagena \n2 :Cali,Medellin,Pasto");
        respuesta=entrada.nextInt();

        if (respuesta!=1) {
            System.out.println("Ha perdido");
        }
        else{
            
            System.out.println("2.¿Con cuantos paises comparte Colombia fronteras terrestres?");

            System.out.println(" \n0 :5  \n1 :7 \n2 :4");
            respuesta2=entrada.nextInt();

            if (respuesta2!=0) {
                System.out.println("Ha perdido");
            }
            else{
                
                System.out.println("3.El nombre que tenia el actual territorio colombiano antes de la independencia era:");

                System.out.println(" \n0 :Virreinato de nueva españa  \n1 :Virreinato del rio de la plata \n2 :virreinato de la nueva granada");
                repuesta3=entrada.nextInt();

                if (repuesta3!=2) {
                    System.out.println("Ha perdido");
                }
                else{
                    
                    System.out.println("4.¿Donde nacio el procer de la independencia Francisco de Paula Santander");

                    System.out.println(" \n0 :Bucaramanga  \n1 :Villa del rosario \n2 :Ibague");
                    repuesta4=entrada.nextInt();

                    if (repuesta4!=1) {
                        System.out.println("Ha perdido");
                    }
                    else{
                        
                        System.out.println("Felicitaciones has terminado el juego tienes un gran conocimiento sobre colombia ");
                    }
                }


            }
        }
    
    }
    
    
}

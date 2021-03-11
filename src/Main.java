import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Bienvenido a la Rueda de La Fortuna");
        System.out.println("");
        System.out.println("Advertencia: La exactitud de esta rueda de la fortuna está garantizada.");
        System.out.println();
        System.out.println("Estás jugando bajo tu propio riesgo.");
        System.out.println("");
        Scanner Scan = new Scanner(System.in);
        boolean salir = false;
        do{
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.println("Elige una opción");
            int opcion =Scan.nextInt();
            switch(opcion){
                case 1:
                    String[] premios = new String[5];
                    premios[0] = "que en exactamente 10 años, tu pack se filtrará por accidente y se volverá viral," +
                            "lo que te traerá muchas oportunidades como poder tener tu propio reality show," +
                            "lo cual rechazarás porque siempre dign@, nunca indign@.";
                    premios[1] = "que el 30 de Junio tocarán a tu puerta para fumigar, así que te irás " +
                            "a la tienda de la esquina por una cocacola. " +
                            "De repente entrará tu crush a la tienda, ignorándote " +
                            "por completo y le preguntará al tendero si hay Nutella.";
                    premios[2]= "en el 2,040 tú y tu familia huirán de Guatemala debido a la debacle político y económico que ha provocado la dictadura" +
                            "de Neto Bran y para cubrir los gastos venderás tu cuerpo a una corporación para que realice experimentos." +
                            "Te transformarán en un cyborg, lo que extenderá tu tiempo de vida por 500 años más, de los cuales utilizarás los primeros" +
                            "20 prestando servicio militar para ayudar a establecer un nuevo orden mundial.";
                    premios[3]= "esta noche no dormirás porque necesitas estudiar para tu próximo parcial, pero pasarás la mitad del tiempo " +
                            "viendo videos de bromas a gatos y stalkeando el instagram de tu crush. ";
                    premios[4]= "ganaste un ¡CÓMODÍN! Felicidades, has ganado la oportunidad de elegir un fragmento de tu futuro. " +
                            "Todo lo que imagines en los próximos 10 segundos se hará realidad. A disfrutar de la" +
                            "vida se ha dicho.";
                    int random = (int) (Math.random()*5);

                    System.out.println("tu visión para un futuro próximo o lejano es que " + premios[random] + ", jajajajajaja");
                    break;
                case 2:
                    System.out.println("Hasta pronto...");
                    salir = true;
                    break;
                default:
                    System.out.println("elija una opción válida");
                    break;
            }
        }while(!salir);





    }
}

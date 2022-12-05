package lamda;

public class LamdaExpressionNoPara {

    public static void main(String args[]){


//        implementInterfaceWithLamda(
//                () -> {
//                    System.out.println("Implementing the method of the Interface with lamda expression ");
//                }
//        );

        Printable printable = () -> {
            System.out.println("Implementing the interface with lamda expression as varable ");
        };

        implementInterfaceWithLamda(printable);

    }

    // calling the print method of the printable interface
   private static void implementInterfaceWithLamda(Printable printable){
        printable.print();
   }
}

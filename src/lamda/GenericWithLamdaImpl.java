package lamda;

public class GenericWithLamdaImpl {


    public static void main(String arg[]){



    }

    // define the method with generic use of interface as parameter
    private static <T extends Number> T userGenericAdd(IGenericWithLamda genericWithLamda, T t1, T t2) {
        return genericWithLamda.addNumber(t1, t2);
    }
}

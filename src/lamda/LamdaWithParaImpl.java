package lamda;

public class LamdaWithParaImpl {

    public static void main(String args[]){

        useLamdaWithPara((x) ->{

            System.out.println("implementation of the function");
            // this x is taking from the s paramerte of the useLamdaWithPara
            System.out.println(x);
        }, "sanam");

    }

    private static void useLamdaWithPara(ILamdaWithPara lamdaWithPara, String s){
        lamdaWithPara.print(s);
    }
}

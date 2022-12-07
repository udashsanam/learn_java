package accessmodifier;

public class MainClass {

    public static void main(String args[]){

        DefaultModifier defaultModifier = new DefaultModifier();
        defaultModifier.print("accessible within the class package");

        PrivateModidier privateModidier = new PrivateModidier();
//        privateModidier.print("only accessible within the class ")

        ProtectedModifier protectedModifier = new ProtectedModifier();

        protectedModifier.print("accessible in package as well as accessible on the class that extends");
    }
}

package accessmodifiercheck;

import accessmodifier.DefaultModifier;
import accessmodifier.ProtectedModifier;

//public class CheckClass extends ProtectedModifier{
//
//    private void check(){
//            CheckClass checkClass = new CheckClass();
//            checkClass.print("accessible on the class that extends ");
//    }
//}

public class CheckClass extends DefaultModifier{

    private void check(){

        CheckClass checkClass = new CheckClass();
    }
}

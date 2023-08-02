package new_features;

public class SealedClassEx {
    public static void main(String[] args) {
        Education education = new Education();
        education.educate();
        education = new School();
        education.educate();
        education = new College();
        education.educate();
        education = new EveningCollege();
        education.educate();
    }
}
sealed class Education permits School,College{
    public void educate(){
        System.out.println("Education is a must!");
    }
}

final class School extends Education{
public void educate(){
    System.out.println("First level education");
}
}
non-sealed class College  extends Education{
    @Override
    public void educate(){
        System.out.println("Higher level education");
    }
}

class EveningCollege extends College{

    @Override
    public void educate(){
        System.out.println("Higher level education in the evening!");
    }
}

//class IrrelevantClassLikeProduct  extends Education{
//    @Override
//    public void educate(){
//        System.out.println("Smart education");
//    }
//}

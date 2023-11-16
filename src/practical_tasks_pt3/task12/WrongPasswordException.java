package practical_tasks_pt3.task12;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

    }
    public WrongPasswordException(String str){
        super(str);
    }
}

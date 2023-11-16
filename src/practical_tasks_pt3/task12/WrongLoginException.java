package practical_tasks_pt3.task12;

public class WrongLoginException extends Exception{
    public WrongLoginException(){

    }
    public WrongLoginException(String str){
        super(str);
    }
}

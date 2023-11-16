package labaratory_tasks_pt3.task5;

public class WrongLoginException extends Exception{
    public WrongLoginException(){

    }
    public WrongLoginException(String str){
        super(str);
    }
}

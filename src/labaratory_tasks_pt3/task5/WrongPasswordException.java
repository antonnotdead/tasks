package labaratory_tasks_pt3.task5;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

    }
    public WrongPasswordException(String str){
        super(str);
    }
}

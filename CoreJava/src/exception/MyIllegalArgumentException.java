package exception;

public class MyIllegalArgumentException extends Exception {
    private String message;
    public MyIllegalArgumentException(String message){
        //super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "ZeroArgumentException{" +
                "message='" + message + '\'' +
                '}';
    }
}

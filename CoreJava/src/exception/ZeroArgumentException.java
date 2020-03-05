package exception;

public class ZeroArgumentException extends Exception {
    private String message;
    public ZeroArgumentException(String message){
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

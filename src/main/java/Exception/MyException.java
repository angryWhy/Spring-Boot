package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class MyException extends RuntimeException{
    public MyException(String message){
        super(message);
    }
    public MyException(){
        super();
    }
}

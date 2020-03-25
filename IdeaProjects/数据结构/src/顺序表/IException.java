package 顺序表;

/**
 * Author:lxy1999
 * Created:2020/2/27
 */
public class IException extends Exception {
    public IException() {
    }

    public IException(String message) {
        super(message);
    }

    public IException(String message, Throwable cause) {
        super(message, cause);
    }

    public IException(Throwable cause) {
        super(cause);
    }

    public IException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package validators_convertors_ex;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name = "validatorEx")
@RequestScoped
public class ValidatorEx {
    private String message_0 = "default";
    private String message_1;
    private int count;
    private IntegerPair pair;

    public ValidatorEx() {
    }

    public String getMessage_0() {
        return message_0;
    }

    public void setMessage_0(String message_0) {
        this.message_0 = message_0;
    }

    public String getMessage_1() {
        return message_1;
    }

    public void setMessage_1(String message_1) {
        this.message_1 = message_1;
    }

    public IntegerPair getPair() {
        return pair;
    }

    public void setPair(IntegerPair pair) {
        this.pair = pair;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

package ajax_examples;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Nikita on 04.04.2015.
 */
@ManagedBean (name = "ajaxBeanA")
@RequestScoped
public class AjaxBeanA {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProcessMessage() {
        return "Hello " + message;
    }

}

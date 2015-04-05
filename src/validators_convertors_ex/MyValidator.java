package validators_convertors_ex;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;

/**
 * Created by Nikita on 02.04.2015.
 */
@FacesValidator ("HelloMessageValidator")

public class MyValidator implements javax.faces.validator.Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String message = o.toString();
        if (message.startsWith("abc")) {
            FacesMessage msg = new FacesMessage("Validation failed:", "This field can't start with 'abc'");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}

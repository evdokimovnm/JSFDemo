package validators_convertors_ex;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("IntegerPairConverter")
public class IntegerPairConverter implements javax.faces.convert.Converter{
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        try {
            int fst = Integer.parseInt(s.substring(0, s.indexOf(".")));
            int scd = Integer.parseInt(s.substring(s.indexOf(".") + 1, s.length()));
            return new IntegerPair(fst, scd);
        } catch (RuntimeException e) {
            FacesMessage msg = new FacesMessage("Bad Integer pare.", "IntegerPare must have format '124.568'");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
       IntegerPair pair = (IntegerPair) o;
       return pair.getFst() + "." + pair.getScd();
    }
}

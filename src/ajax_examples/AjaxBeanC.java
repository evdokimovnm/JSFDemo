package ajax_examples;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.AjaxBehaviorEvent;
import java.util.Date;


@ManagedBean (name = "temperatureConverter")
@RequestScoped
public class AjaxBeanC {
    private String fTemp;
    private String cTemp;
    private String kTemp;

    public void setfTemp(String fTemp) {
        this.fTemp = fTemp;
        setcTemp(fTemp);
        setkTemp(fTemp);
    }

    public String getfTemp() {
        return fTemp;
    }

    public void setcTemp(String fTemp) {
        Double tmp = 0.556 * (Double.parseDouble(fTemp) - 32);
        this.cTemp = tmp.toString();
    }

    public void setkTemp(String fTemp) {
        Double tmp = 55 * Double.parseDouble(fTemp);
        this.kTemp = tmp.toString();
    }

    public String getcTemp() {
        return cTemp;
    }

    public String getkTemp() {
        return kTemp;
    }
}

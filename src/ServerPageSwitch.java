import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.plaf.PanelUI;

/**
 * Created by Nikita on 02.04.2015.
 */

@ManagedBean (name = "actionSwitcher")
@RequestScoped

public class ServerPageSwitch {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String next() {
        int k = value.length() % 3;
        switch (k) {
            case 0:
                return "server_switch-page-0";
            case 1:
                return "server_switch-page-1";
            case 2:
                return "server_switch-page-2";
            default:
                throw new RuntimeException("Never!");
        }
    }

}

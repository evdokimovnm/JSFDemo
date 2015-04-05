import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.event.ActionEvent;
import java.util.Random;

/**
 * Created by Nikita on 02.04.2015.
 */

@ManagedBean
public class RandomColor {

    public void changeColor(ActionEvent event) {
        UIComponent uiComponent = event.getComponent();
        changeButtonColor(uiComponent);
        //addOutput(uiComponent);
    }

    private void changeButtonColor(UIComponent uiComponent) {
        HtmlCommandButton button = (HtmlCommandButton) uiComponent;

        int min = 0x100000;
        int max = 0xFFFFFF;
        int newColor = min + new Random().nextInt(max - min + 1);

        button.setStyle("color:#" + Integer.toHexString(newColor));
        button.setValue("" + Math.random());
    }

}

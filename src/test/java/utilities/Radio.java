package utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Radio {

    List<WebElement> list;

    public Radio(List<WebElement> radios) {
        this.list = radios;
    }

    public void selectByValue(String value) {
        boolean clicked = false;
        for (WebElement el : list) {
            if (value.equals(el.getAttribute("value"))) {
                clicked = true;
                el.click();
            }
        }
        if (!clicked) throw new NoSuchElementException("Cannot locate option with value: " + value);
    }
}

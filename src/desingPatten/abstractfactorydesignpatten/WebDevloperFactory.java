package desingPatten.abstractfactorydesignpatten;

import javax.swing.text.AbstractDocument;

public class WebDevloperFactory extends AbstractEmployeeFactory {
    @Override
    public Employee createObject() {
        return new WebDeveloper();
    }
}

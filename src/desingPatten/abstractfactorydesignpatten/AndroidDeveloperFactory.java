package desingPatten.abstractfactorydesignpatten;

import javax.versionx.java8v.A;

public class AndroidDeveloperFactory extends AbstractEmployeeFactory {
    @Override
    public Employee createObject() {
        return new AndroidDeveloper();
    }
}

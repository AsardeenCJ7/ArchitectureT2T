
// AbstractFactoryDemo.java
interface Button {
    void paint();
}

interface Checkbox {
    void check();
}

class LightButton implements Button {
    public void paint() {
        System.out.println("Light Button created");
    }
}

class DarkButton implements Button {
    public void paint() {
        System.out.println("Dark Button created");
    }
}

class LightCheckbox implements Checkbox {
    public void check() {
        System.out.println("Light Checkbox checked");
    }
}

class DarkCheckbox implements Checkbox {
    public void check() {
        System.out.println("Dark Checkbox checked");
    }
}

// Abstract factory interface
interface UIThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Two concrete factories
class LightThemeFactory implements UIThemeFactory {
    public Button createButton() { return new LightButton(); }
    public Checkbox createCheckbox() { return new LightCheckbox(); }
}

class DarkThemeFactory implements UIThemeFactory {
    public Button createButton() { return new DarkButton(); }
    public Checkbox createCheckbox() { return new DarkCheckbox(); }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String theme = "dark"; // user can choose "light" or "dark"

        UIThemeFactory factory;
        factory = new DarkThemeFactory();

        Button btn = factory.createButton();
        Checkbox chk = factory.createCheckbox();

        btn.paint();
        chk.check();
    }
}

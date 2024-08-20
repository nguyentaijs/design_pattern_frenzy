package io.github.nguyentaijs.abstract_factory;

public class Main {

    public static void main(String[] args) {
        Application application;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            application = new Application(new WindowsGuiFactory());
        } else if (os.contains("mac")) {
            application = new Application(new IosGuiFactory());
        } else {
            System.err.println("Can not recognize os.");
            return;
        }

        application.render();
        application.interact();
    }
}

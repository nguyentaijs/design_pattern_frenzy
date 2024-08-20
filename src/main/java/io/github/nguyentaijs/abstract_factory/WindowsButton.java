package io.github.nguyentaijs.abstract_factory;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows button rendered");
    }

    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

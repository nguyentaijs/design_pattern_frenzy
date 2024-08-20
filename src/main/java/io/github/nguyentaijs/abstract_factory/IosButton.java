package io.github.nguyentaijs.abstract_factory;

public class IosButton implements Button {
    @Override
    public void render() {
        System.out.println("iOS button rendered");
    }

    @Override
    public void click() {
        System.out.println("iOS button clicked");

    }
}

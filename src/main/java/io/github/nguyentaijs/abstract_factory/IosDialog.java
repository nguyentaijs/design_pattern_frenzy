package io.github.nguyentaijs.abstract_factory;

public class IosDialog implements Dialog {
    @Override
    public void show() {
        System.out.println("iOS dialog shown");
    }
    @Override
    public void render() {
        System.out.println("iOS dialog rendered");
    }
}

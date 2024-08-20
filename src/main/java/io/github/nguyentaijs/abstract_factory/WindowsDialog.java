package io.github.nguyentaijs.abstract_factory;

public class WindowsDialog implements Dialog {
    @Override
    public void show() {
        System.out.println("Windows dialog shown");
    }
    @Override
    public void render() {
        System.out.println("Windows dialog rendered");
    }
}

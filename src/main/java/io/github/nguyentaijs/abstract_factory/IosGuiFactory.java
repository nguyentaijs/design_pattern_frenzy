package io.github.nguyentaijs.abstract_factory;

public class IosGuiFactory implements GuiAbstractFactory {
    @Override
    public Dialog createDialog() {
        return new IosDialog();
    }

    @Override
    public Button createButton() {

        return new IosButton();
    }
}

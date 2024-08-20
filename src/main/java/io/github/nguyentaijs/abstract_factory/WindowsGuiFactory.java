package io.github.nguyentaijs.abstract_factory;

public class WindowsGuiFactory implements GuiAbstractFactory {
    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }

    @Override
    public Button createButton() {

        return new WindowsButton();
    }
}

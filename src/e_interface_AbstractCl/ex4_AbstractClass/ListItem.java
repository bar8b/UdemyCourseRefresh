package e_interface_AbstractCl.ex4_AbstractClass;

public abstract class ListItem {
    boolean nextItem;
    boolean previousItem;
    String value;

    public void compareTo(){

    }

    public void setNextItem(boolean nextItem) {
        this.nextItem = nextItem;
    }

    public void setPreviousItem(boolean previousItem) {
        this.previousItem = previousItem;
    }
}
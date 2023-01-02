package e_interface_AbstractCl.ex4_AbstractClass;

public interface NodeList {
    ListItem getRoot ();
    boolean addItem (ListItem item);
    boolean removeItem(ListItem item);
    void traverse (ListItem root);
}

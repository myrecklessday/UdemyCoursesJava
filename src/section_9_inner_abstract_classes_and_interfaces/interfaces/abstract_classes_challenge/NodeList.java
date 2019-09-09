package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes_challenge;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}

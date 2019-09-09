package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes_challenge;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem setNext(ListItem item);
    abstract ListItem setPrevious(ListItem item);

    abstract ListItem moveToNextItem();

    abstract ListItem moveToPreviousItem();

    abstract int compareTo(ListItem item);

}

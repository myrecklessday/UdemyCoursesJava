package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes_challenge;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    public void addItem(){



    }

    @Override
    ListItem setNext(ListItem item) {
       this.rightLink = item;
       return this.rightLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    ListItem moveToNextItem() {
        return this.rightLink;
    }

    @Override
    ListItem moveToPreviousItem() {
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {

            return ((String) super.getValue()).compareTo((String) item.getValue());

        } else {
            return -1;
        }
    }
}

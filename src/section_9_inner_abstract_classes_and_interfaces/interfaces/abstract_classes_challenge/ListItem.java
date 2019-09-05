package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes_challenge;

public abstract class ListItem {

    private ListItem rightLink = null;
    private ListItem leftLink = null;
    private Object value;

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
//        if (this.value != null){
//            this.value = this.rightLink;
//            return true;
//        }
//        return false;

    abstract ListItem moveToPreviousItem();

//        if (this.value != null){
//            this.value = this.leftLink;
//            return true;
//        }
//        return false;

    abstract int compareTo(ListItem item);

//        if (this.value.equals(parameter)){
//            return 0;
//        } else if (this.value > parameter) {
//            return 1;
//        }


}

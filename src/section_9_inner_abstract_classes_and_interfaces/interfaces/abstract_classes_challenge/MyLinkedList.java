package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes_challenge;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.moveToNextItem() != null) {
                    currentItem = currentItem.moveToNextItem();
                } else {
                    // there is no next, so insert at the end of the list
//                    currentItem.setNext(newItem);
//                    newItem.setPrevious(currentItem);
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0){
                // newItem is less, insert before
                if (currentItem.moveToPreviousItem() != null) {
//                    currentItem.moveToPreviousItem().setNext(newItem);
//                    newItem.setPrevious(currentItem.moveToPreviousItem());
                    currentItem.moveToPreviousItem().setNext(newItem).setPrevious(currentItem.moveToPreviousItem());
//                    newItem.setNext(currentItem);
//                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
//                    newItem.setNext(this.root);
//                    this.root.setPrevious(newItem);
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }

        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    // found the item to delete
                    if (currentItem == this.root) {
                        this.root = currentItem.moveToNextItem();
                    } else {
                        currentItem.moveToPreviousItem().setNext(currentItem.moveToNextItem());
                        if (currentItem.moveToNextItem() != null) {
                            currentItem.moveToNextItem().setPrevious(currentItem.moveToPreviousItem());
                        }
                    }
                    return true;

                } else if (comparison < 0){
                    currentItem = currentItem.moveToNextItem();
                } else { // comparison > 0
                    // We are at an item greater than the one to be deleted
                    // so the item is not in the list
                    return false;
                }
            }

        // We have reached the end of the list
        // Without finding the item to delete
        return false;

    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.moveToNextItem();
            }
        }

    }
}

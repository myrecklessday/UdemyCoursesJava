package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes_challenge;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The tree was empty, so this item becomes the head of the tree
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
                    // there is no node to the right, so add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0){
                // newItem is less, move left if possible
                if (currentItem.moveToPreviousItem() != null) {
                    currentItem = currentItem.moveToPreviousItem();
                } else {
                    // there is no node to the left, so add at this point
                   currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // equal, so don't add
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        // we can't actually get here, but Java complains if there's no return
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.moveToNextItem();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.moveToPreviousItem();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.moveToNextItem() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.moveToNextItem() == item) {
                // item is right child of its parent
                parent.setNext(item.moveToPreviousItem());
            } else if (parent.moveToPreviousItem() == item) {
                // item is left child of its parent
                parent.setPrevious(item.moveToPreviousItem());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.moveToPreviousItem();
            }
        } else if (item.moveToPreviousItem() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.moveToNextItem() == item) {
                // item is right child of its parent
                parent.setNext(item.moveToNextItem());
            } else if (parent.moveToPreviousItem() == item) {
                // item is left child of its parent
                parent.setPrevious(item.moveToNextItem());
            } else {
                // again, we are deleting the root
                this.root = item.moveToNextItem();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.moveToNextItem();
            ListItem leftmostParent = item;
            while (current.moveToPreviousItem() != null) {
                leftmostParent = current;
                current = current.moveToPreviousItem();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.moveToNextItem());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.moveToNextItem());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {

        //recursive method
        if (root != null) {
            traverse(root.moveToPreviousItem());
            System.out.println(root.getValue());
            traverse(root.moveToNextItem());
        }

    }
}

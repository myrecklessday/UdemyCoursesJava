package section_9_inner_abstract_classes_and_interfaces.interfaces.interfaces_Challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}

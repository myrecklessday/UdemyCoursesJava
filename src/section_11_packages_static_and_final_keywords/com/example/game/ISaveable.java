package section_11_packages_static_and_final_keywords.com.example.game;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}

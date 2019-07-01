package section_8_arrays_and_lists.arrays.arrayList_Challenge;

public class Contacts {

    private String name;
    private String phone;

    public Contacts(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

}

package section_11_packages_static_and_final_keywords.final_keyword;

public class ExtendedPassword extends Password {

    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    //final methods can't be overriden
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password " + this.decryptedPassword);
//    }



}

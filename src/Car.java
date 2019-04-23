public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model; //update variable (field) with content of method parameter
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}

public class Form {
    private String color;
    private static int counter=0;
    public Form() {
        counter++;
        this.color = "alba";

    }

        public Form(String color){
        this.color=color;
    }
    public float getArea(){
        return 0;
    }
    public static int getCounter(){
        return counter;
    }
    public String toString(){
        return "Aceasta forma are culoarea " + color;
    }
}

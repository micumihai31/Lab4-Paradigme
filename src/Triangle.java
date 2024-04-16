public class Triangle extends Form{
    private float height;
    private float base;
    public Triangle(){

        super();
        this.height=this.base=0;
    }
    public Triangle(String color, float base, float height){
        super(color);
        this.base=base;
        this.height=height;
    }
    public float getArea(){
        return (base*height)/2;
    }
    public String toString(){
        return super.toString()+ " " + base + " " + height;

    }
}

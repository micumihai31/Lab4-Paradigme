//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle("red", 2.0F, 1.1F);
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square("blue ", 1.2F);

        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle("red", 2.0F,1.1F );
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle("brown", 2.0F,1.1F );
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));
        Form f1=new Form();
        Form f2=new Form();
        Form f3=new Form();
        System.out.println("Numarul de instante create: "+Form.getCounter());
    }
}
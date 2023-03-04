import java.util.Scanner;
public class BaiLab4{
public class Circle {
    private Double radius;
    private String color;
    private Double area;

    public Circle( Double radius, String color,double area ) {
        this.radius = radius;
        this.color = color;
        this.area = area;
    }

    public Double getRadius() {
        return radius;
    }

    public Double setRadius( Double radius ){
        return this.radius= radius;
    }

    public String getColor(){
        return color;
    }

    public String setColor(String color){
        return this.color= color;
    }

    public Double getArea() {
        return area;
    }

    public String toString(){
        return radius+","+ color+", "+ area; 
    }
}
public class Cylinder extends Circle{
  
    private Double height;
    public Double volume;
public Cylinder(Double radius, String color, Double area, Double height){
        super(radius, color, area);
        this.height = height;   
    }
    
    public Double getHeight(double h) {
        return height;
    }
    public Double setHeight() {
        return this.height;
    }
    public Double getVolume(){
        return getArea()*height;
    }  
    public class Ci_Cy {
    public static void main(String[] args)
	{
		Cylinder data1 = new Cylinder(2.3 , " Red ", 4.2 ,  7.6);  
		System.out.println(data1.toString()+", "+data1.setHeight());
        System.out.println(data1.getVolume());
	}
}
  }
}
package bai1;

interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle: draw");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Circle: draw");
    }
}

class Main{
    public static void main(String[] args) {
    
        Rectangle rl = new Rectangle();
        Circle cr = new Circle();
        
        rl.draw();
        cr.draw();
}
}
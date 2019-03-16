package violetedPr;

public abstract class Shaper implements Shapes
//Dependency Inversion Principle Fixed because this implements Interface Class
{
    //Interface Segregation Principle violation
    public abstract double Area();
    public abstract double par();
}


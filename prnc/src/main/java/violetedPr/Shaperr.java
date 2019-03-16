package violetedPr;

public abstract class Shaperr
//Dependency Inversion Principle volated because this abstract class doesnt implements an Interface Class
{

    //Interface Segregation Principle violation
    public abstract double Area();
    public abstract double par();
}//Dependency Inversion Principle violated
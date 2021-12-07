package lecture.paper;

class shape
{
    void draw()
    {
        System.out.println("This shape is ");
    }
}
class circle extends shape
{
    void draw ()
    {
        System.out.println("The shape is circle");
    }
    void erase ()
    {
        System.out.println("ERASE CIRCLE");
    }
    
}
class square extends shape{
    void draw ()
    {
        System.out.println("The shape is square");
    }
    void erase ()
    {
        System.out.println("ERASE SQUARE");
    }

}
public class imheriti{
    public static void main(String[] args)
    {
        shape s=new circle();
        s.draw();
    }

}

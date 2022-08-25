class rec
{
    float length;
    float width;
    rec()
    {
        length=1.0f;
        width=1.0f;
    }
    rec(float l,float w)
    {
        length=l;
        width=w;
    }
    float getlength()
    {
        return length;
    }
    double area()
    {
        return width*length;
    }
    double perimeter()
    {
        return (width+length)*2;
    }
 
}
public class Main
{
public static void main(String[] args) {
rec obj=new rec();
rec obj1=new rec(10,20);

System.out.println(obj);

double ar;
ar=obj.area();
System.out.println("area "+ar);
ar=obj1.area();
System.out.println("area 1 "+ar);
double peri;
peri=obj.perimeter();
System.out.println("perimeter"+peri);
peri=obj1.perimeter();
System.out.println("perimeter 1"+peri);



}
 public String toString()
 {
  return "length"+length:"width"+width;
  
 }

}
public class Loader {
    public static void main (String[]arg)
    {
        Ball a=new Ball();
        a.setColor("Blue");
        a.setRadius(5.47f);
        a.setType("Football");

        Ball b=new Ball();
        b.setColor("Red");
        b.setRadius(6.1f);
        b.setType("Basketball");

        System.out.println(b);
        System.out.println();
        System.out.println(a);


    }
}
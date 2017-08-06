package visitor;

public class Demo {
    public static void main ( String [] args ) {
        Point p = new Point2D( 3, 2 );
        Visitor v = new Chef();
        p.accept( v );
        System.out.println( p.getMetric() );
        Visitor e = new Euclid();
        p.accept( e );
        System.out.println( p.getMetric() );
    }
}

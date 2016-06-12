package point;

/**
 * @author madD7
 * Object Creation Demonstration
 * Modeling Cartesian Geometry points
 * 
 */


/**
 * Representing each point as an object, having two variables.
 * But to get objects, we create a class "Point"
 * */
class Point
{
	int x;		// Instance variables
	int y;
}

public class ObjectCreation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 2;
		p1.y = 4;
		
		p2.x = 3;
		p2.y = 5;
		
		System.out.println("Co-ordinates of p1: x:"+p1.x+", y:"+p1.y);
		System.out.println("Co-ordinates of p2: x:"+p2.x+", y:"+p2.y);
	}

}

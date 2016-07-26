package ass1;
import javax.media.opengl.GL2;

/**
 * Created by Joshua on 27/08/15.
 */
public class MyCoolGameObject extends GameObject {
    //
    public MyCoolGameObject() {
        super(GameObject.ROOT);
    }
    //
    @Override
    public void drawSelf(GL2 gl) {
        // Create a polygon
        double white[] = {1,1,1,1};
        double black[] = {0,0,0,1};
        double mid[] = {0.8,0.8,0.8,1};
        double points[] = {1.5,1,-1.5,1,-1.5,-1,1.5,-1};
        PolygonalGameObject bg = new PolygonalGameObject(this,points,mid,null);

        // Create the body
        double b1[] = { toGameWorld(11),toGameWorld(1),
                        toGameWorld(9),toGameWorld(38),
                        toGameWorld(-9),toGameWorld(42),
                        toGameWorld(-11), toGameWorld(0)};
        PolygonalGameObject bb1 = new PolygonalGameObject(this,b1,black,null);

        double b2[] = { toGameWorld(0),toGameWorld(11),
                        toGameWorld(0),toGameWorld(-30),
                        toGameWorld(30),toGameWorld(11)};
        PolygonalGameObject bb2 = new PolygonalGameObject(this,b2,black,null);

        double b3[] = { toGameWorld(0),toGameWorld(8),
                        toGameWorld(0),toGameWorld(-20),
                        toGameWorld(-34),toGameWorld(12)};
        PolygonalGameObject bb3 = new PolygonalGameObject(this,b3,black,null);

        double b4[] = { toGameWorld(0),toGameWorld(12),
                        toGameWorld(-30),toGameWorld(-10),
                        toGameWorld(0),toGameWorld(-60)};
        PolygonalGameObject bb4 = new PolygonalGameObject(this,b4,black,null);

        double b5[] = { toGameWorld(0),toGameWorld(0),
                        toGameWorld(30),toGameWorld(-15),
                        toGameWorld(20),toGameWorld(-60)};
        PolygonalGameObject bb5 = new PolygonalGameObject(this,b5,black,null);

        double b6[] = { toGameWorld(0),toGameWorld(0),
                        toGameWorld(-28),toGameWorld(-60),
                        toGameWorld(30),toGameWorld(-60),
                        toGameWorld(0),toGameWorld(0)};
        PolygonalGameObject bb6 = new PolygonalGameObject(this,b6,black,null);

        double b7[] = { toGameWorld(0),toGameWorld(-30),
                        toGameWorld(30),toGameWorld(-5),
                        toGameWorld(0),toGameWorld(0)};
        PolygonalGameObject bb7 = new PolygonalGameObject(this,b7,black,null);

        // top
        double h1[] = { toGameWorld(-13),toGameWorld(42),
                        toGameWorld(9),toGameWorld(38),
                        toGameWorld(16),toGameWorld(50)};
        PolygonalGameObject hh1 = new PolygonalGameObject(this,h1,black,null);

        double h2[] = { toGameWorld(16),toGameWorld(50),
                        toGameWorld(-13),toGameWorld(55),
                        toGameWorld(10),toGameWorld(46)};
        PolygonalGameObject hh2 = new PolygonalGameObject(this,h2,black,null);

        double h3[] = { toGameWorld(15),toGameWorld(60),
                        toGameWorld(-13),toGameWorld(55),
                        toGameWorld(-5),toGameWorld(52)};
        PolygonalGameObject hh3 = new PolygonalGameObject(this,h3,black,null);

        double h4[] = { toGameWorld(15),toGameWorld(60),
                        toGameWorld(-8),toGameWorld(60),
                        toGameWorld(5),toGameWorld(58)};
        PolygonalGameObject hh4 = new PolygonalGameObject(this,h4,black,null);

        // Create a head
        CircularGameObject headb = new CircularGameObject(this,toGameWorld(11.5),black,black);
        headb.setPosition(toGameWorld(0), toGameWorld(22));
        CircularGameObject head = new CircularGameObject(this,toGameWorld(11),white,black);
        head.setPosition(toGameWorld(0), toGameWorld(22));

        CircularGameObject eyel = new CircularGameObject(this,toGameWorld(3),black,null);
        eyel.setPosition(toGameWorld(-5), toGameWorld(25));
        CircularGameObject eyer = new CircularGameObject(this,toGameWorld(3),black,null);
        eyer.setPosition(toGameWorld(5), toGameWorld(25));

        CircularGameObject ns = new CircularGameObject(this,toGameWorld(3),black,null);
        ns.setPosition(toGameWorld(0), toGameWorld(18));

        double t1[] = { toGameWorld(1),toGameWorld(-2),
                        toGameWorld(2),toGameWorld(12),
                        toGameWorld(-2),toGameWorld(12)};
        PolygonalGameObject tooth1 = new PolygonalGameObject(this,t1,white,null);
        double t2[] = { toGameWorld(-3),toGameWorld(0),
                        toGameWorld(-2),toGameWorld(13),
                        toGameWorld(-6),toGameWorld(15)};
        PolygonalGameObject tooth2 = new PolygonalGameObject(this,t2,white,null);
        double t3[] = { toGameWorld(5),toGameWorld(0),
                        toGameWorld(2),toGameWorld(13),
                        toGameWorld(6),toGameWorld(15)};
        PolygonalGameObject tooth3 = new PolygonalGameObject(this,t3,white,null);

        // Finished head

        // hand
        double a1[] = { toGameWorld(0),toGameWorld(0),
                toGameWorld(-5),toGameWorld(1),
                toGameWorld(-8),toGameWorld(-1),
                toGameWorld(-12),toGameWorld(-25),
                toGameWorld(-5),toGameWorld(-28),
                toGameWorld(0),toGameWorld(-20)};
        PolygonalGameObject aa1b = new PolygonalGameObject(bb4,a1,black,null);
        aa1b.setPosition(toGameWorld(-19.5), toGameWorld(-15.5));
        aa1b.setScale(1+toGameWorld(9));

        double a2[] = { toGameWorld(0),toGameWorld(0),
                toGameWorld(0),toGameWorld(-10),
                toGameWorld(4),toGameWorld(-12),
                toGameWorld(6),toGameWorld(-8)};
        PolygonalGameObject aa2b = new PolygonalGameObject(bb4,a2,black,null);
        aa2b.setPosition(toGameWorld(-19.5), toGameWorld(-15.5));
        aa2b.setScale(1 + toGameWorld(9));

        PolygonalGameObject aa1 = new PolygonalGameObject(bb4,a1,white,null);
        aa1.setPosition(toGameWorld(-20), toGameWorld(-17));

        PolygonalGameObject aa2 = new PolygonalGameObject(bb4,a2,white,null);
        aa2.setPosition(toGameWorld(-20), toGameWorld(-17));

        double l1[] = {
                toGameWorld(-2),toGameWorld(-4),
                toGameWorld(0),toGameWorld(-10),
                toGameWorld(-1),toGameWorld(-3)};
        PolygonalGameObject aa1h = new PolygonalGameObject(bb4,l1,black,null);
        aa1h.setPosition(toGameWorld(-19.5), toGameWorld(-20));

    }
    public double[] toGameWorld(double[] input) {
        double[] output = {input[0]/60, input[1]/60};
        return output;
    }
    public double toGameWorld(double input) {
        return input/60;
    }
}

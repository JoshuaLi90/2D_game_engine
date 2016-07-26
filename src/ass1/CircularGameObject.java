package ass1;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

/**
 * Created by Joshua on 27/08/15.
 */

public class CircularGameObject extends GameObject {
    int POLYGON_SIDES = 32;
    double myRadius;
    double[] myPoints;
    private double[] myFillColour;
    private double[] myLineColour;

    // Create a ass1.CircularGameObject with centre 0,0 and radius 1
    public CircularGameObject(GameObject parent, double[] fillColour, double[] lineColour) {
        super(parent);

        setRadius(1);
        setFillColour(fillColour);
        setLineColour(lineColour);

    }

    // Create a ass1.CircularGameObject with centre 0,0 and a given radius
    public CircularGameObject(GameObject parent, double radius, double[] fillColour, double[] lineColour) {
        super(parent);

        setRadius(radius);
        setFillColour(fillColour);
        setLineColour(lineColour);
    }
    //
    public void setPoints() {
        double angle;
        double angleIncrement = 2 * Math.PI / POLYGON_SIDES;
        for (int i = 0; i <= POLYGON_SIDES; i++) {
            angle = i * angleIncrement;
            double x = getRadius() * Math.cos(angle);
            double y = getRadius() * Math.sin(angle);
            myPoints[i * 2] = x;
            myPoints[i * 2 + 1] = y;
        }
    }
    //
    public double[] getPoints() {return myPoints;};
    //
    public void setRadius(double rad) {myRadius = rad;}
    //
    public double getRadius() {return myRadius;}
    //
    public void setFillColour(double[] fillColour) {myFillColour = fillColour;}
    //
    public double[] getFillColour() {return myFillColour;}
    //
    public void setLineColour(double[] lineColour) {myLineColour = lineColour;}
    //
    public double[] getLineColour() {return myLineColour;}

    public void drawSelf(GL2 gl) {
        gl.glPushMatrix();
        gl.glTranslated(getGlobalPosition()[0], getGlobalPosition()[1], 0);
        gl.glRotated(getGlobalRotation(), 0, 0, 1);
        gl.glScaled(getGlobalScale(), getGlobalScale(), 1);

        if (getFillColour() != null) {
            gl.glColor3dv(getFillColour(), 0);
            gl.glBegin(GL2.GL_TRIANGLE_FAN);
            {
                gl.glVertex2d(0, 0); //The centre of the circle
                double angle;
                double angleIncrement = 2 * Math.PI / POLYGON_SIDES;
                for (int i = 0; i <= POLYGON_SIDES; i++) {
                    angle = i * angleIncrement;
                    double x = getRadius() * Math.cos(angle);
                    double y = getRadius() * Math.sin(angle);

                    gl.glVertex2d(x, y);
                }
            }
            gl.glEnd();
        }
        //
        if (getLineColour() != null) {
            gl.glColor3dv(this.getLineColour(), 0);
            gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_LINE);
            gl.glBegin(GL2.GL_LINE_STRIP);
            {
                double angle;
                double angleIncrement = 2 * Math.PI / POLYGON_SIDES;
                for (int i = 0; i <= POLYGON_SIDES; i++) {
                    angle = i * angleIncrement;
                    double x = getRadius() * Math.cos(angle);
                    double y = getRadius() * Math.sin(angle);

                    gl.glVertex2d(x, y);
                }
            }
            gl.glEnd();
            gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        }

        gl.glPopMatrix();
    }
}

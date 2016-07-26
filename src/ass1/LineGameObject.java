package ass1;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
/**
 * Created by Joshua on 27/08/15.
 */
public class LineGameObject extends GameObject {
    private double[] myPoints;
    private double[] myLineColour;

    // Create a ass1.LineGameObject from 0,0 to 1,0
    public LineGameObject(GameObject parent, double[] lineColour) {
        super(parent);
        setPoints(0, 0, 1, 0);
        setLineColour(lineColour);
    }

    // Create a ass1.LineGameObject from x1,y1 to x2,y2
    public LineGameObject(GameObject parent, double x1, double y1,
                                             double x2, double y2,
                                             double[] lineColour) {
        super(parent);
        setPoints(x1, y1, x2, y2);
        setLineColour(lineColour);
    }
    //
    public void setPoints(double v0, double v1, double v2, double v3) {
        myPoints = new double[4];
        myPoints[0] = v0;
        myPoints[1] = v1;
        myPoints[2] = v2;
        myPoints[3] = v3;
    }
    //
    public double[] getPoints() {return myPoints;}
    //
    public void setLineColour(double[] lineColour) {myLineColour = lineColour;}
    //
    public double[] getLineColour() {return myLineColour;}

    //
    public void drawSelf(GL2 gl) {
        gl.glPushMatrix();
        gl.glTranslated(getGlobalPosition()[0], getGlobalPosition()[1], 0);
        gl.glRotated(getGlobalRotation(), 0, 0, 1);
        gl.glScaled(getGlobalScale(), getGlobalScale(), 1);

        if (getLineColour() != null) {
            gl.glColor3dv(this.getLineColour(), 0);
            gl.glBegin(GL2.GL_LINES);
            {
                gl.glVertex2d(this.getPoints()[0], this.getPoints()[1]);
                gl.glVertex2d(this.getPoints()[2], this.getPoints()[3]);
            }
            gl.glEnd();
        }

        gl.glPopMatrix();
    }
}

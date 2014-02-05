package simple.test3;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 16:23
 */
import java.awt.*;

class Test3
{

    public static void main (String args[])
    {
        MyFrame f1 = new MyFrame(0, 0,     "Frame 1", Color.red);
        MyFrame f2 = new MyFrame(300, 0,   "Frame 2", Color.green);
        MyFrame f3 = new MyFrame(0, 150,   "Frame 3", Color.yellow);
        MyFrame f4 = new MyFrame(300, 150, "Frame 4", Color.blue);
        MyFrame f5 = new MyFrame(0, 300,	"Frame 5", Color.cyan);
    } // main

} // Test3

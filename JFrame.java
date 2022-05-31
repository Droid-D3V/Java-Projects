package wtf.droid;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame a = new JFrame();
        Container b = new Container();

        a.setTitle("Hello!");
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        a.setSize(400,300);
        a.setVisible(true);
        a.setResizable(false);
        b.setBackground(Color.DARK_GRAY);
    }
}

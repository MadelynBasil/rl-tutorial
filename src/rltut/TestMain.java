package rltut;

import javax.swing.JFrame;
// asciiPanel is a custom class 
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import rltut.screens.Screen;
import rltut.screens.TestScreen;

public class TestMain extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;
    private Screen screen;

    public TestMain() {
        super();
        terminal = new AsciiPanel();
        add(terminal);
        pack();
        screen = new TestScreen();
        addKeyListener(this);
        repaint();
    }
    
    public void repaint() {
    	terminal.clear();
    	screen.displayOutput(terminal);
    	super.repaint();
    }
    
    public void keyPressed(KeyEvent e) {
        screen = screen.respondToUserInput(e);
        repaint();
    }

    public void keyReleased(KeyEvent e) { }

    public void keyTyped(KeyEvent e) { }

    public static void main(String[] args) {
        TestMain app = new TestMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
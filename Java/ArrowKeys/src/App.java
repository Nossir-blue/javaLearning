import javax.swing.JFrame;

public class App {
    public App()
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}

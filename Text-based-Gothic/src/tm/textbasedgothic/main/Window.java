import javax.swing.JFrame;

public class Window extends JFrame {
	
	public Window (int height, int width, String title, Game game) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, heigth));
		frame.setMinimumSize(new Dimension(width, heigth));
		frame.setMaximumSize(new Dimension(width, heigth));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.add(game);
		
		frame.setVisible(true);
		
		new MenuView (game, this);
	}
}

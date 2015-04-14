import model.Model;
import view.Application;
import view.SplashScreen;

public class Main {

	public static void main(String[] args) {

		Model m = new Model();
		Application levelBuilder = new Application(m);
		SplashScreen splash = new SplashScreen(2000, levelBuilder);
		levelBuilder.setDefaultCloseOperation(levelBuilder.EXIT_ON_CLOSE);
		splash.launchSplashSreen();
		//levelBuilder.setVisible(true);
	}

}

package TestScript;

public class BrowserCommands extends Base{

	public void browserCommands() {
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.driverQuitAndClose();
	}

}

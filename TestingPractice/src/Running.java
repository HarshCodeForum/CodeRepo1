import org.openqa.selenium.chrome.ChromeDriver;

public class Running {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsh Tyagi\\Downloads\\Software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.usefedora.com/courses/75164/lectures/12091180");
		System.out.println(driver.getTitle());
		driver.close();
		//Hello User
	}

}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimeiraAutomação {

	private WebDriver driver;

	@Before
	public void Inicializa() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@After
	public void Finaliza() {
		// driver.quit();
	}

	@Test
	public void TesteCadastro() {
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Fábio");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Souza");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"))
				.sendKeys("Abertura de Automatização");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("fabio@fabio");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("(85)988722349");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();

		driver.findElement(By.id("checkbox2")).click();

		driver.findElement(By.id("msdd")).click();

//		Escolhendo o nome dentro do combo !!
		WebElement element = driver.findElement(By.id("Skills"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Java");

//		WebElement elementSelecionaPais = driver.findElement(By.id("select2-country-container"));
//		Select comboSelecionaPais = new Select(element);
//		combo.selectByVisibleText("Japan");
		
		
		

	}

}

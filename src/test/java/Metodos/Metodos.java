package Metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	// driver.findElement(By.id("passava elemento")).click();
	WebDriver driver;

	public void clicar(By string) {

		driver.findElement(string).click();

	}

	public void preencher(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void pausa(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void validarTexto(String texto, By elemento) {

		String mensagem = driver.findElement(elemento).getText();
		System.out.println(mensagem);
		assertEquals(texto, mensagem);

	}

	public void pegarTexto(By elemento) {

		String texto = driver.findElement(elemento).getText();
		System.out.println(texto);
	}

	public void executarNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		

	}

}

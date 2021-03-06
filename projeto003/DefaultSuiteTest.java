// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cT001ValidarLoginNoSiteComDadosCorretos() {
    driver.get("https://seubarriga.wcaquino.me/login");
    driver.manage().window().setSize(new Dimension(910, 673));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("fullstack.3110@gmail.com");
    driver.findElement(By.id("senha")).click();
    driver.findElement(By.id("senha")).sendKeys("123456");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Bem vindo, Edson!"));
    driver.close();
  }
  @Test
  public void cT002ValidarLoginNoSiteComDadosIncorretos() {
    driver.get("https://seubarriga.wcaquino.me/login");
    driver.manage().window().setSize(new Dimension(774, 673));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("fullstack.3110@gmail.com");
    driver.findElement(By.id("senha")).click();
    driver.findElement(By.id("senha")).sendKeys("123456789");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Problemas com o login do usu??rio"));
    driver.close();
  }
  @Test
  public void cT003ValidarCadastroDeNovaConta() {
    driver.get("https://seubarriga.wcaquino.me/login");
    driver.manage().window().setSize(new Dimension(774, 673));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("fullstack.3110@gmail.com");
    driver.findElement(By.id("senha")).click();
    driver.findElement(By.id("senha")).sendKeys("123456");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".caret")).click();
    driver.findElement(By.linkText("Adicionar")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Conta008");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Conta adicionada com sucesso!"));
  }
  @Test
  public void cT004ValidarAlteracaoNoNomeDeUmaConta() {
    driver.get("https://seubarriga.wcaquino.me/login");
    driver.manage().window().setSize(new Dimension(774, 673));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("fullstack.3110@gmail.com");
    driver.findElement(By.id("senha")).click();
    driver.findElement(By.id("senha")).sendKeys("123456");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Listar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(5) .glyphicon-edit")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Conta0081");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Conta alterada com sucesso!"));
  }
  @Test
  public void cT005ValidarInclusaoDeUmaContaComUmNomeExistente() {
    driver.get("https://seubarriga.wcaquino.me/login");
    driver.manage().window().setSize(new Dimension(774, 673));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("fullstack.3110@gmail.com");
    driver.findElement(By.id("senha")).click();
    driver.findElement(By.id("senha")).sendKeys("123456");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Adicionar")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Conta0081");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("J?? existe uma conta com esse nome!"));
  }
  @Test
  public void cT006ValidarExclusaoDeUmaContaExistente() {
    driver.get("https://seubarriga.wcaquino.me/login");
    driver.manage().window().setSize(new Dimension(774, 673));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("fullstack.3110@gmail.com");
    driver.findElement(By.id("senha")).click();
    driver.findElement(By.id("senha")).sendKeys("123456");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Contas")).click();
    driver.findElement(By.linkText("Listar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .glyphicon-remove-circle")).click();
    driver.findElement(By.cssSelector(".alert")).click();
    assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("Conta removida com sucesso!"));
  }
}

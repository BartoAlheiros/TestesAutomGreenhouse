package greenhouse.testes_automatizados;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestesGreenHouse_Bartolomeu {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGRH7Login() throws Exception {
    driver.get("https://lucasfranciscocorreia.github.io/DesenvolvimentoWEB/");
    driver.findElement(By.id("navbarDropdownMenuLink-4")).click();
    driver.findElement(By.id("defaultLoginFormEmail")).click();
    driver.findElement(By.id("defaultLoginFormEmail")).clear();
    driver.findElement(By.id("defaultLoginFormEmail")).sendKeys("jose.silva@gmail.com");
    driver.findElement(By.id("defaultLoginFormPassword")).clear();
    driver.findElement(By.id("defaultLoginFormPassword")).sendKeys("12345678");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot password?'])[1]/following::a[1]")).click();
  }
  
  @Test
  public void testGRH50CadastroPFSicaCEPComLetras() throws Exception {
    driver.get("https://lucasfranciscocorreia.github.io/DesenvolvimentoWEB/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Se inscreva e faça parte da comunidade'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CRIAR CONTA'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).sendKeys("João Silva");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).sendKeys("12345678");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).sendKeys("99999999999");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).sendKeys("04/06/1984");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).sendKeys("52020");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).sendKeys("5202015B");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::button[1]")).click();
    assertEquals("Preencha todos os campos corretamente", closeAlertAndGetItsText());
  }
  
  @Test
  public void testGRH20EMailGrandePessoaJurDica() throws Exception {
    driver.get("https://lucasfranciscocorreia.github.io/DesenvolvimentoWEB/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Se inscreva e faça parte da comunidade'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Física'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).sendKeys("testeEmpresa1");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).sendKeys("empresa1234567890abcdefghij1234567890wertyu@gmail.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).sendKeys("Teste1");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).sendKeys("11111111000111");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[5]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[5]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[5]")).sendKeys("52171900");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[7]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[7]")).sendKeys("UFRPE");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[8]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[8]")).sendKeys("900");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::button[1]")).click();
    assertEquals("Email muito longo", closeAlertAndGetItsText());
  }
  
  @Test
  public void testGRH15EMailGrandePessoaFSica() throws Exception {
    driver.get("https://lucasfranciscocorreia.github.io/DesenvolvimentoWEB/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Se inscreva e faça parte da comunidade'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[3]")).sendKeys("João Silva");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[1]")).sendKeys("jose.silva1234567890abcde1234567890wertyu@gmail.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[2]")).sendKeys("12345678");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jurídica'])[1]/following::input[4]")).sendKeys("99999999999");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).sendKeys("04/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[1]")).sendKeys("04/06/1984");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[2]")).sendKeys("52171900");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[4]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[4]")).sendKeys("Apt 301");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[5]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[5]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::input[5]")).sendKeys("100");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='F'])[1]/following::button[1]")).click();
    assertEquals("Email muito longo", closeAlertAndGetItsText());
  }
  
  @Test
  public void testGRH46LoginComEMailSem() throws Exception {
    driver.get("https://lucasfranciscocorreia.github.io/DesenvolvimentoWEB/");
    driver.findElement(By.id("navbarDropdownMenuLink-4")).click();
    driver.findElement(By.id("defaultLoginFormEmail")).click();
    driver.findElement(By.id("defaultLoginFormEmail")).clear();
    driver.findElement(By.id("defaultLoginFormEmail")).sendKeys("juca.pereira123gmail.com");
    driver.findElement(By.id("defaultLoginFormPassword")).click();
    driver.findElement(By.id("defaultLoginFormPassword")).clear();
    driver.findElement(By.id("defaultLoginFormPassword")).sendKeys("12345678");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot password?'])[1]/following::a[1]")).click();
    
    String codigoPagina = driver.getPageSource();
    assertThat(codigoPagina, Matchers.containsString("Inclua um '@' no endereço de e-mail."));
    
    //driver.switchTo().activeElement();
  }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

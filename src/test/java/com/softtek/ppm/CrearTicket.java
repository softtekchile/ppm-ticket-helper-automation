package com.softtek.ppm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

/** @author daniela.souza */

public class CrearTicket {

	@Test
	public void logIn() {
		System.out.println("Comenzando Crear Ticket");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		sleep(3000);

		// Open browser and maximize window
		driver.manage().window().maximize();

		// Open the page
		String url = "https://ppm.softtek.com/";
		driver.get(url);
		System.out.println("Página abierta.");

		// Log in to page
		// enter username
		WebElement username = driver.findElement(By.id("field-username"));
		username.sendKeys("daniela.souza");
		// enter password
		WebElement password = driver.findElement(By.id("field-password"));
		password.sendKeys("S0ftt3k.2019");
		// push log in button
		WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"label-LOGON_SUBMIT_BUTTON_CAPTION\"]"));
		logInButton.click();
		System.out.println("Credenciales ingresadas correctamente.");
		sleep(3000);
		

		// Select type of ticket to create
		// Create Ticket
		WebElement createMenu = driver.findElement(By.xpath("//*[@id=\"yui-gen3\"]/a"));
		createMenu.click();
		// Select sub menu
		WebElement subMenuSol = driver.findElement(By.xpath("//*[@id=\"CREATE_REQUEST\"]/a"));
		subMenuSol.click();
		sleep(3000);
		// Select Option
		WebElement selectOption = driver.findElement(By.linkText("Otros tipos..."));
		selectOption.click();
		// Select Type of ticket
		WebElement selectTicket = driver.findElement(By.xpath(
				"//*[@id=\'page-min-width-div\']/div[5]/div/div/div[1]/div/form/div/table[3]/tbody/tr[16]/td[1]/div/a"));
		selectTicket.click();

		// Create Ticket Type: SERVICE
		// Insert static data: Ingresar WBS
		WebElement WBStext = driver.findElement(By.id("REQ.P.PROJECTAC_TF"));
		WBStext.sendKeys("1-0000013297-1");
		sleep(3000);
		WebElement OrgUnitText = driver.findElement(By.id("REQ.P.ORG_UNITAC_TF"));
		OrgUnitText.click();
		OrgUnitText.sendKeys("1-0000013297-1");
		sleep(5000);
		WebElement AssignedToText = driver.findElement(By.id("REQ.ASSIGNED_TO_USER_IDAC_TF"));
		AssignedToText.sendKeys("daniela.souza");
		sleep(3000);
		//Static Data
		WebElement ReqTypeText = driver.findElement(By.id("REQ.P.REQ_TYPEAC_TF")); //id("REQ.P.REQ_TYPEAC_TF"));
		ReqTypeText.click();
		ReqTypeText.sendKeys("Service");
		ReqTypeText.click();
		sleep(3000);
		WebElement ReqTypeBtn = driver.findElement(By.id("CH_3AUTOCOMP_IMG"));
		ReqTypeBtn.click();
		//sleep(3000);
		//WebDriver.switchTo().window(String windowHandler)
		//WebElement iFrame = driver.findElement(By.tagName("_yuiResizeMonitor"));
		//driver.switchTo().frame(iFrame);
		//WebElement selectOption = driver.findElement(By.linkText("Service"));
		//ValueReqType.click();
		//driver.switchTo().defaultContent();
		//sleep(3000);
		
		
		sleep(3000);
		//Dynamic Data
		//WebElement ReasonBtn = driver.findElement(By.id("CH_4AUTOCOMP_IMG"));
		//ReasonBtn.click();
		WebElement ValueReason = driver.findElement(By.id("REQ.P.REASONAC_TF"));//linkText("Analysis/Collaboration")); //xpath("//*[@id=\'2.22.18.Analysis/Collaboration\']/th")) ;  //
		ValueReason.sendKeys("Analysis/Collaboration");
		ValueReason.click();
		sleep(3000);
		
		//Static Data
		//WebElement ImpactBtn = driver.findElement(By.id("CH_14AUTOCOMP_IMG"));
		//ImpactBtn.click();
		//sleep(3000);
		WebElement ValueImpact = driver.findElement(By.id("REQ.P.IMPACTAC_TF"));//linkText("Low"));
		ValueImpact.sendKeys("Low");
		ValueImpact.click();
		sleep(3000);
		
		//Static Data
		//WebElement UrgencyBtn = driver.findElement(By.id("CH_15AUTOCOMP_IMG"));
		//UrgencyBtn.click();
		WebElement ValueUrgency = driver.findElement(By.id("REQ.P.URGENCYAC_TF"));//linkText("Low"));
		ValueUrgency.sendKeys("Low");
		ValueUrgency.click();
		ValueUrgency.sendKeys("Low");
		sleep(3000);
		//Seleccionar Prioridad
		//WebElement ValuePriority = driver.findElement(By.id("REQ.P.PRIORITY"));//linkText("Medium"));
		//ValuePriority.click();
		Select ValuePriority = new Select (driver.findElement(By.id("REQ.P.PRIORITY")));
		ValuePriority.selectByVisibleText("Medium");
		
		//Dynamic Data
		WebElement DescriptionText = driver.findElement(By.id("REQ.DESCRIPTION"));
		DescriptionText.sendKeys("QS-GTD-XXX-DESCRIPCION");
		sleep(3000);
		
		//Dynamic Data
		//WebElement CategoryAppBtn = driver.findElement(By.id("CH_4AUTOCOMP_IMG"));
		//CategoryAppBtn.click();
		WebElement ValueCategoryApp = driver.findElement(By.id("REQD.P.CAT_APPAC_TF"));//linkText("Gestión Comercial"));
		ValueCategoryApp.sendKeys("Gestión Comercial");
		ValueCategoryApp.click();
		sleep(3000);
		
		//Dynamic Data
		WebElement ClientIdText = driver.findElement(By.id("REQD.P.CLIENT_ID"));
		ClientIdText.sendKeys("GTD-XXX");
		sleep(3000);
		
		//Static Data
		WebElement LocationText = driver.findElement(By.id("REQD.P.LOCATIONAC_TF"));
		LocationText.sendKeys("Chile");
		sleep(3000);
		
		//Dynamic Data
		WebElement DetailDescriptiontext = driver.findElement(By.id("REQD.P.DETAILED_DESCRIPTION"));
		DetailDescriptiontext.sendKeys("DESCRIPCIÓN DEL PROBLEMA Y LA SOLUCIÓN REQUERIDA");
		sleep(3000);
		
		//WebElement OrgUnitBuscarBtn = driver.findElement(By.xpath("//*[@id=\"filterPanelFindButton\"]"));
		//OrgUnitBuscarBtn.click();
		//sleep(3000);
		
				
		WebElement CreateTkBtn = driver.findElement(By.id("submit"));
		CreateTkBtn.click();
		
		//Guardar número de Ticket creado
		WebElement NroTk = driver.findElement(By.className("field-prompt"));
		
		System.out.println("Ticket Creado:" + NroTk);
	}
	
	//Ubicación de número de Tk y nombre de variables
	/**Bastián, 11:56 <td valign="top" nowrap=""><span class="field-prompt">Solicitud nº:</span> <span class="field-value"><a href="../crt/RequestDetail.jsp?REQUEST_ID=3605090">3605090</a></span></td> */
	/** Static sleep */
	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
package botpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Compte {
	
public Properties	fichierProperties = loadConfigComptes();

private String server;
private String userName;
private String passWord;
private String tribut = "romains";



		

	//private WebDriver driver = new FirefoxDriver();
	//////////////////////////////////////////////



//charger les configs pr�c�dentes
public Properties loadConfigComptes(){
	
String path = System.getProperty("user.home")+"\\travianfx.properties";		
Properties properties = new Properties();
FileInputStream input = null;

try {
	input = new FileInputStream(path);
} catch (FileNotFoundException e) {e.printStackTrace();} 

try{
properties.load(input);

} catch (IOException e) {e.printStackTrace();}
finally{
	try {
		input.close();
	} catch (IOException e) {e.printStackTrace();}
}
return properties;	
	
}

public Properties getFichierProperties() {
return fichierProperties;
}

public void setFichierProperties(Properties fichierProperties) {
this.fichierProperties = fichierProperties;
}      

	
	public String getTribut() {
		return tribut;
	}
	public void setTribut(String tribut) {
		
		this.tribut = tribut;
	}
	
	
	
	private WebDriver driver;
	
	public String getServer() {
		return server;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public Compte(WebDriver driver) {
		super();
		// new Compte();
		// System.setProperty("webdriver.chrome.driver", "C:\\Selenium2.45\\chrome\\chromedriver.exe");
		// driver = new ChromeDriver();
		this.driver = driver;
	
		
	}
	public Compte() {
		//server = fichierProperties.getProperty("server");
	//	userName = fichierProperties.getProperty("login"); 
	//	passWord = fichierProperties.getProperty("password");

				/*if(true){
				server = fichierProperties.getProperty("server");
				userName = fichierProperties.getProperty("login"); 
				passWord = fichierProperties.getProperty("password");
				}*/
	}
	
}
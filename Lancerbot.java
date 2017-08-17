package botpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;


import org.openqa.selenium.WebDriver;





	public class Lancerbot  {

		private static Randomsleep randomsleep = new Randomsleep();
		public static boolean actif = true;
		static WebDriver driver;
		static Attaque attaque = new Attaque();
		static ArrayList<Attaque> listeAttaques = new ArrayList<Attaque>();
	Travian travian;
	FxFenetreController fxFenetreController;
	
	/// reglages recupérés par le bot et l'interface
	boolean faireDefiler = true;

	public int delaisAventures = 150;
	public int rythmePillage = 1;
	public int evacuerAPartirDe = 80;
	public int pourcentageNePasLaisserLeVillageSourceEnDessousDe = 20;
	public int champMinFx = 9;
	public int pourcentageApproPetitVillageFx = 30;
	public int ressourcesMiniSurVillageSourceFx = 5000;
	public int distanceMaxPourMarchands = 24; 
	public int vitesseMarchands = 24; //gaulois = 24 romains = 16 germains = 12
	public int DepotMiniPourAiderFx = 9600;
	
	boolean pillage = true;
	boolean faireFete = true;
	boolean evacuerSurplusRessources = true;
	boolean approPetitsVillages = true;
	boolean construireBatiments = true;
	public boolean optimiserProdHero = true;
	public boolean faireAventures = true;
	public boolean monterChampsCapitale = true;
	public boolean npc = true;
	public boolean rotationVillage = true;
	public boolean afficherAttente = false;

	
	public String idDeLaListeDePillage = "1592";
	public String motCleListeDePillage1 = "inactif";
	public String motCleListeDesPertes = "perte";
	
	











		public  Lancerbot() {
			//this.bot = bot;
			//console = new fxConsoleExperimentale(bot); console.start();
		//	this.bot = bot;
			//try {
			//	tfenetre = new Fenetre(bot);
			//	fxFenetre = new FxFenetre();

			//	fxFenetre.main();
			//	fxFenetre.setBot(bot);

		  //      new JFXPanel();
		   //     Platform.runLater(() -> {
		    //        try {
		   //             fxFenetre = new FxFenetre(bot);
		                
		    //        } catch (Exception ex) {Logger.getLogger(Lancerbot.class.getName()).log(Level.SEVERE, null, ex);    }	        });


			//} catch (IOException e) {travian.ecrireDansConsole("IO exeption tocard");}

		}








	public static void main(String[] args)  {
		//Lancerbot botStart = new Lancerbot();
	//	botStart.lancerbot(botStart);

				}










public static void arreter(){
	actif = false;

}

public WebDriver setDriver(WebDriver driver) {
	driver = this.driver;
	return driver;


}


public void setfxFenetreController(FxFenetreController fxFenetreController){
	this.fxFenetreController = fxFenetreController;
	
}


public void lancerTravian(String serveur, String nomDeCompte, String motDePasse){
	
/*	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {e.printStackTrace();
	}
*/	
	if (travian == null){
	//if (!travian.isAlive()){
		travian = new Travian(this, serveur, nomDeCompte, motDePasse);
		travian.setFxFenetreController(fxFenetreController);
		travian.start();
		travian.allume = true;
		travian.ecrireDansConsole(travian.getName());
	    travian.ecrireDansConsole(travian.getState().toString());
//	}
	    

	}
	else {
		if (!travian.isAlive() ){
		travian = new Travian(this, serveur, nomDeCompte, motDePasse);
		travian.start();
		travian.allume = true;
		travian.ecrireDansConsole(travian.getName());
	    travian.ecrireDansConsole(travian.getState().toString());} //if (!travian.isAlive()){
	}
	
	//else {	travian.allume = true; travian.notify();}
	/*else {travian= new Travian();
	travian.start();
	travian.ecrireDansConsole(travian.getName());
    travian.ecrireDansConsole(travian.getState());
}*/


}

public void reprendreTravian(){
		travian.ecrireDansConsole(travian.getName());
    travian.ecrireDansConsole(travian.getState().toString());

		travian.resume();
		travian.ecrireDansConsole(travian.getName());
	    travian.ecrireDansConsole(travian.getState().toString());

	}
public synchronized void pause(){
	
	travian.pause();
	/*if (travian.enPause == true){
		travian.enPause = false;*/
		
	/*	synchronized(travian) {
		 travian.notify();
		}*/
	
	//}
}
public void annulerPause(){
	if (travian != null){
	if (travian.isAlive()){
		if (travian.randomsleep.enAttente == true){
			travian.interrupt();
		}
		}}
}

public void eteindreTravian(){
	if (travian != null){
	if (travian.isAlive()){
	//	travian.stop();
		travian.allume = false;
		//bot.tfenetre.console.destroy();
	//	if(travian.randomsleep.enPause == false){
	//	bot.travian.interrupt();
	//	}
		//bot.travian.arreter();
		travian.ecrireDansConsole("********* Arret Demande ************ Arret Demande ************** Arret Demande *************");

		//bot.travian.getCompte().getDriver().close();
		//bot.travian.interrupt();

		//travian.notify();

		//travian.stop();
		//try {travian.getCompte().getDriver().close();}catch (Exception e) {}
	//	try {travian.getCompte().getDriver().quit();}catch (Exception e) {}

	//travian.ecrireDansConsole(travian.getName());
    //travian.ecrireDansConsole(travian.getState());




/*	// Attente de la fin du thread
	try {
		travian.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	//travian.getThreadGroup().destroy();*/
	}}





}

/*
public void attaque(){
	try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}
	 travian.suspend();

	Verifierdate verifDate = new Verifierdate(travian, attaque, listeAttaques);
verifDate.start();

travian.ecrireDansConsole(verifDate.getName());
travian.ecrireDansConsole(verifDate.getState());


//	randomsleep.court();
try {
Attaque attaque1 = new Attaque(travian,verifDate);
attaque1.start();
listeAttaques.add(attaque1);
 //try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}

		 	randomsleep.court();
Attaque attaque2 = new Attaque(travian,verifDate);
attaque2.start();
listeAttaques.add(attaque2);
// try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}

randomsleep.court();
Attaque attaque3 = new Attaque(travian,verifDate);
attaque3.start();
listeAttaques.add(attaque3);
// try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}


randomsleep.court();
Attaque attaque4 = new Attaque(travian,verifDate);
attaque4.start();
listeAttaques.add(attaque4);
// try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}

Attaque attaque5 = new Attaque(travian,verifDate);
attaque5.start();
listeAttaques.add(attaque5);
 //try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}

randomsleep.court();
Attaque attaque6 = new Attaque(travian,verifDate);
attaque6.start();
listeAttaques.add(attaque6);
// try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}

randomsleep.court();
Attaque attaque7 = new Attaque(travian,verifDate);
attaque7.start();
listeAttaques.add(attaque7);
// try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}


randomsleep.court();
Attaque attaque8 = new Attaque(travian,verifDate);
attaque8.start();
listeAttaques.add(attaque8);
// try {Thread.sleep(20000);} catch (InterruptedException e) {e.printStackTrace();}
}catch (Exception e){}

//	randomsleep.court();

//	for(Attaque attaque : listeAttaques){
	//	attaque.bouttons.get(0).submit();

//	}


}

*/















public static void copyFullRecursive(File source, File dest) throws IOException
{
    if (source.isDirectory())
    {
        File dir = new File(dest, source.getName());
        dir.mkdir();

        File[] list = source.listFiles();
        if (list != null)
            for (File fic : list)
                copyFullRecursive(fic, dir);
    }
    else
    {
        Files.copy(source.toPath(), new File(dest, source.getName()).toPath());
    }
}

	/** copie le fichier source dans le fichier resultat
	 * retourne vrai si cela réussit
	 */
	public static boolean copyFile(File source, File dest){
		try{
			// Declaration et ouverture des flux
			java.io.FileInputStream sourceFile = new java.io.FileInputStream(source);

			try{
				java.io.FileOutputStream destinationFile = null;

				try{
					destinationFile = new FileOutputStream(dest);

					// Lecture par segment de 0.5Mo
					byte buffer[] = new byte[512 * 1024];
					int nbLecture;

					while ((nbLecture = sourceFile.read(buffer)) != -1){
						destinationFile.write(buffer, 0, nbLecture);
					}
				} finally {
					destinationFile.close();
				}
			} finally {
				sourceFile.close();
			}
		} catch (IOException e){
			e.printStackTrace();
			return false; // Erreur
		}

		return true; // Résultat OK

}


	}

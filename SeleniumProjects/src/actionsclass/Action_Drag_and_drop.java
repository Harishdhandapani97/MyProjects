package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);


		//images in the iframe and drag and dropdwn in trash
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		//identify trash
		WebElement trash = driver.findElement(By.id("trash"));

		//To drag and Drop to images to trash
		Actions ac = new Actions(driver);
		ac.dragAndDrop(image1, trash).perform();
		Thread.sleep(4000);
//		ac.dragAndDrop(image2, trash).perform();
		ac.clickAndHold().moveToElement(trash).release().perform();
		Thread.sleep(4000);
		ac.dragAndDrop(image3, trash).perform();
		Thread.sleep(4000);
		//ac.dragAndDrop(image4, trash).perform();
		ac.dragAndDropBy(image4, 500, 0).perform();
		Thread.sleep(6000);


		//to drag and drop images to gallery
		WebElement gallery = driver.findElement(By.id("gallery"));
		Actions gall = new Actions(driver);
		gall.dragAndDrop(image1, gallery).perform();
		Thread.sleep(4000);
		gall.dragAndDrop(image2, gallery).perform();
		Thread.sleep(4000);
		gall.dragAndDrop(image3, gallery).perform();
		Thread.sleep(4000);
		gall.dragAndDrop(image4, gallery).perform();
//		gall.dragAndDropBy(gallery, 0, 500);





	}

}

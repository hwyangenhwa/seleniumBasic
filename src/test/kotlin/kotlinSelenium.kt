import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import util.utilResources

fun main() {

    lateinit var webDriver: WebDriver

    try {
        System.setProperty(utilResources.getProperties("webDriverID"), utilResources.getProperties("webDriverPath"))

        val options: ChromeOptions = ChromeOptions()
        options.addArguments("--start-maximized")

        webDriver = ChromeDriver(options)

        webDriver.get(utilResources.getProperties("baseURL"))
        Thread.sleep(100)

    }finally {
        webDriver.close()
    }
}
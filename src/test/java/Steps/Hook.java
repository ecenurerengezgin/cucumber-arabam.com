package Steps;


import Page.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.File;

public class Hook extends Base {

    @Before
    public void beforevalidation(Scenario scenario)
    {
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
    }

    @After
    public void afterTest(Scenario scenario){
        try{
            String screenshotName = scenario.getName().replaceAll(" ","_");
            if (scenario.isFailed()) {

                Allure.addAttachment("Fail Scenario", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));


                /*
                --- Raporlamada gösterilmiyor proje içindeki dosyada kayıt atıyor ---
                File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src,new File("C:/Otomasyon/Screenshot/screenshot.png"));
                */



            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.close();
    }
}

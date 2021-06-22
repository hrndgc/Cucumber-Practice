package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html"},
        //Bu notasyon ile feature dosyaları ile stepdefinition dasyalarını birlestirdik
        features="src/test/resources/features",
        glue="stepdefinitions",

        tags="@wip", //work in progress
        //Birden fazla scenario yu da tags="@smoke and @miniregression" yazarak calıstırabiliriz
        //Eger tum TC leri calıstırmak ıstersek tags'ı yorum satırına almamız yeterlidir

        dryRun=false
        //true: TC'i çalıştırmayı denemeden eksikleri kontrol eder
        //false: TC'i çalıştırmayı denedikten sonra eksikleri kontrol eder
)

public class runner {
}

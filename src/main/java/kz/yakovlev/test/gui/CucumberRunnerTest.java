package kz.yakovlev.test.gui;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features", //путь к папке с .feature файлами. Фреймворк будет искать файлы в этой и во всех дочерних папках.
        glue = "kz.yakovlev.test.gui.test", // пакет, в котором находятся классы с реализацией шагов и «хуков».
        tags = "@testTastLifecycle", //фильтр запускаемых тестов по тэгам. Список тэгов можно перечислить через запятую. Символ ~ исключает тест из списка запускаемых тестов, например ~@fail;
        dryRun = false, //если true, то сразу после запуска теста фреймворк проверяет, все ли шаги теста разработаны, если нет, то выдает предупреждение. При false предупреждение будет выдаваться по достижении неразработанного шага. По умолчанию false.
        strict = false, //если true, то при встрече неразработанного шага тест остановится с ошибкой. False — неразработанные шаги пропускаются. По умолчанию false.
        snippets = SnippetType.CAMELCASE //указывает в каком формате фреймворк будет предлагать шаблон для нереализованных шагов. Доступны значения: SnippetType.CAMELCASE, SnippetType.UNDERSCORE.
)
public class CucumberRunnerTest {

}

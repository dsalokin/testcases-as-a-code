package io.github.eroshenkoam.taac;

import io.github.eroshenkoam.taac.feature.ProjectStories;
import io.github.eroshenkoam.taac.step.WebSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CodeSearchTest {

    private WebSteps steps = new WebSteps();

    @Test
    @Manual
    @ProjectStories.CodeSearch
    @DisplayName("Поиск вхождения кода")
    public void testCodeSearch() {
        step("Открываем главную страницу");
        steps.searchText("Allure");
        step("В поисковой выдаче я выбираю таб Code");
        step("Проверяем наличие пунктов меню", () -> {
            assert true;
        });
        step("Проверяем наличие пунктов меню", () -> {
            step("проверка первого пункта", () -> {
                step("здесь несколько проверок", () -> {
                    step("проверка 1");
                    step("ппроверка 2");
                    step("проверка 3");
                });
                step("проверка 1");
                step("проверка 2");
            });

            step("проверка второго пункта", () -> {
                step("подшаг1");
                step("подшаг2");
                step("подшаг3");
            });

            step("проверка третьего пункта", () -> {
                step("подшаг1");
                step("подшаг2");
                step("подшаг3");
            });

        });
        step("Выбираю первый файл с кодм вхождения слова");
        step("Проверяю что в файл есть слово `Allure`");
    }

}

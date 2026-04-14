package steps;

import io.cucumber.java.pt.*;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;
import pages.SearchPage;

public class SearchSteps {

    private HomePage home;
    private SearchPage searchPage;

    @Dado("que o usuário está na página inicial")
    public void usuarioNaPaginaInicial() {
        home = new HomePage(Hooks.driver);
    }

    @Quando("ele realiza uma busca por {string}")
    public void realizaBusca(String termo) {
        home.openSearch();
        home.search(termo);
        searchPage = new SearchPage(Hooks.driver);
    }

    @Entao("devem ser exibidos resultados")
    public void validaResultados() {
        Assertions.assertTrue(searchPage.hasResults());
    }

    @Entao("deve ser exibida mensagem de nenhum resultado")
    public void validaSemResultados() {
        Assertions.assertTrue(searchPage.hasNoResultsMessage());
    }
}
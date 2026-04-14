Feature: Busca de artigos no blog do Agi

  Scenario: Buscar por termo válido
    Given que o usuário está na página inicial
    When ele realiza uma busca por "investimento"
    Then devem ser exibidos resultados

  Scenario: Buscar por termo inexistente
    Given que o usuário está na página inicial
    When ele realiza uma busca por "asdkasdk123123"
    Then deve ser exibida mensagem de nenhum resultado
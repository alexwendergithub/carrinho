Feature: Adcionar item na lista

  Scenario: AdcionarPrimeiroItem
		Given Estou na página de compras "file:///home/aula_tav2/dc.html"
		When Preencher no campo itens o valor "batata"
		And Pressionado o botão Ok
		Then Deveremos ter no campo de texto "batata"


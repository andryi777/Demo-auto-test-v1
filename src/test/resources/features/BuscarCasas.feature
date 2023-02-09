@tag
Feature: Buscar precios Urbania

  @GetPreciosUrbania
  Scenario Outline: Obtener precios de casas Urbania
		#Given accedo a la web de Pakta
    Given accedo a la web de Urbania
		When filtro por casas
    Then registro los datos de precios de casas


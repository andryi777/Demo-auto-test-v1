@tag
Feature: Realizar cotizaciones de pólizas con PAKTA

  @GetPreciosUrbania
  Scenario Outline: Validar generación de cotización
		Given accedo a la web de Pakta
    #Given accedo a la web de Urbania
		#When filtro por casas
    Then registro los datos de precios de casas


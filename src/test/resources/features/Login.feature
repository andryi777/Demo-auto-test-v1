@tag
Feature: Realizar cotizaciones de pólizas con PAKTA

  @CotizaPolizas
  Scenario Outline: Validar generación de cotización
    Given accedo a la web de Pakta
    When ingreso los valores iniciales solicitados placa "<placa>", dni "<dni>", celular "<celular>", correo "<correo>"
    #Then debe mostrarse los montos para 12 cuotas "<monto12Cuotas>" y cuota unica "<montoCuotaUnica>"

    ###DATOS###@DataPrueba|1@01-Escenario1
    Examples: 
      | 0 | placa  | dni      | celular   | correo        | monto12Cuotas | montoCuotaUnica |
      | 1 | JJJ312 | 88888888 | 987987987 | test@test.com | US$22.26      | US$267.09       |
#      | 2 | QAZ111 | 32165488 | 987654321 | test@test.com |         31.80 |          381.58 |
#      | 3 | RED477 | 44488822 | 987654987 | test@test.com |

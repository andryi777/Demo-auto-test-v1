@tag
Feature: Realizar cotizaciones de pólizas con PAKTA

  @CotizaPolizas
  Scenario Outline: Validar generación de cotización
    Given accedo a la web de Pakta
    When ingreso los valores iniciales solicitados placa "<placa>", dni "<dni>", celular "<celular>", correo "<correo>"
    #Then debe mostrarse los montos para 12 cuotas "<monto12Cuotas>" y cuota unica "<montoCuotaUnica>"


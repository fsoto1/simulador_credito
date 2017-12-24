#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature: Simulador

    Scenario Outline:
        Given Yo ingreso al simulador
        When Yo ingreso un rut <RUT>
        And Yo ingreso un monto <MONTO>
        And Yo ingreso un plazo <PLAZO>
        And Yo ingreso una fecha valida <FECHA>
        And Yo selecciono un seguro <SEGURO>
        And Yo oprimo el botón simular
        Then Simulo correctamente <CUOTA>
        
   
    Examples:
        | RUT         | MONTO       | PLAZO      | FECHA           | SEGURO        | CUOTA  |
        | "1-9"       | "2222222"   | "12"       | "30-12-2017"    | "protegido"   | 197691 |
        | "2-7"       | "1111111"   | "24"       | "24-12-2017"    | "ninguno"     | 52428  |
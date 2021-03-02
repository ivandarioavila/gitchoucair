Feature:Login

  @LoginSuccessful
  Scenario Outline: Login
    Given El cliente abre la  pagina web
    When El cliente <Firstname> y <Lastname>
    Then debo validar datos <validatexto>
    Examples:
      |Firstname|Lastname|validtex|
      |Ivan|Avila|First name:|
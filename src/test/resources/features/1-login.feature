@Suite @Login
Feature: CP01 - Validar inicio de sesion

  Background: Validar el inicio de sesion con credenciales validas e invalidas
    Given el usuario navega al sitio web

  @Login @ValidCredentials
  Scenario: 1 - Validar con credenciales correctas
    When ingresa credenciales validas
    Then la aplicacion deberia mostrar el modulo principal de productos

  @Login @InvalidCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When ingresa credenciales invalidas
    Then la aplicacion deberia mostrar un mensaje de error
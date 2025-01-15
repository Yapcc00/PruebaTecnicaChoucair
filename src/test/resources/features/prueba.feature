#Autor: Yeison
#language:es

@HistoriaDeUsuario
Característica: Automatizar el inicio de sesión y el proceso de contratación en la plataforma OrangeHRM

Escenario: Validar inicio de sesión y verificación de candidato en la lista
  Dado que estoy en la pagina de inicio de sesion de OrangeHRM
  Cuando ingreso las credenciales proporcionadas
  Entonces debo poder ver al candidato en la lista con el estado Hired

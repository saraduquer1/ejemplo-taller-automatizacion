# Proyecto de Automatización con Serenity BDD y Gradle

Este proyecto contiene pruebas automatizadas para la aplicación Swag Labs utilizando Serenity BDD, Cucumber y Gradle.

## Estructura del Proyecto

```
src/
├── test/
│   ├── java/
│   │   └── com/swag/pe/
│   │       ├── definitions/          # Step definitions de Cucumber
│   │       ├── pages/               # Page Objects
│   │       ├── steps/               # Steps de Serenity
│   │       ├── utilities/           # Utilidades del proyecto
│   │       └── Runner.java          # Runner principal
│   └── resources/
│       └── features/                # Archivos .feature de Cucumber
```

## Requisitos

- Java 21
- Gradle 8.5+
- Chrome Browser (para las pruebas)

## Configuración

El proyecto está configurado con:
- **Serenity BDD**: Framework de automatización
- **Cucumber**: Para BDD (Behavior Driven Development)
- **JUnit 5**: Framework de testing
- **WebDriver**: Para automatización web

## Comandos Principales

### Ejecutar todas las pruebas
```bash
./gradlew test
```

### Ejecutar pruebas específicas
```bash
# Solo pruebas de login
./gradlew runLoginTests

# Solo pruebas de carrito de compras
./gradlew runShoppingTests
```

### Generar reportes de Serenity
```bash
./gradlew aggregate
```

### Limpiar el proyecto
```bash
./gradlew clean
```

### Compilar el proyecto
```bash
./gradlew build
```

## Características del Proyecto

### Casos de Prueba Incluidos

1. **Login (CP01)**
   - Validación con credenciales válidas
   - Validación con credenciales inválidas

2. **Carrito de Compras (CP02)**
   - Listar productos en el carrito
   - Validar carrito vacío
   - Procesar compra completa

### Configuración de Serenity

La configuración se encuentra en `serenity.properties`:
- Navegador: Chrome
- Descarga automática de drivers
- Navegador maximizado
- Reinicio del navegador en cada escenario

### Tags de Cucumber

- `@Suite`: Ejecuta toda la suite de pruebas
- `@Login`: Ejecuta solo pruebas de login
- `@ShoppingCart`: Ejecuta solo pruebas de carrito
- `@ValidCredentials`, `@InvalidCredentials`: Casos específicos

## Reportes

Después de ejecutar las pruebas, los reportes se generan en:
- `target/site/serenity/`: Reportes HTML de Serenity

## Estructura de Page Objects

El proyecto utiliza el patrón Page Object Model con:
- **Pages**: Definición de elementos web
- **Steps**: Acciones de negocio
- **Definitions**: Implementación de steps de Cucumber

## Ejecución en CI/CD

El proyecto está preparado para ejecutarse en pipelines de CI/CD con:
- Configuración de encoding UTF-8
- Manejo de memoria optimizado
- Reportes automáticos
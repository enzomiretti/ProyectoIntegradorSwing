# ✈️ Proyecto Integrador - Sistema de Gestión de Vuelos y Reservas

Este proyecto es una aplicación Java que permite gestionar vuelos, aerolíneas, reservas y usuarios de un aeropuerto.

---

## 🧩 Descripción General

El sistema está desarrollado siguiendo el patrón **MVC con cuarta capa JPA**, integrando:

✅ **Modelo-Vista-Controlador (MVC)**  
✅ **Persistencia con JPA (EclipseLink)**  
✅ **Interfaz gráfica Swing** (estructura preparada para futuras vistas)  
✅ **Base de datos relacional MySQL/MariaDB**

Es una aplicación de backend con posibilidad de incorporar interfaz gráfica y más lógica de negocio.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Maven**
- **MySQL/MariaDB**
- **JPA con EclipseLink**
- **JDBC Driver**: MySQL Connector/J
- **Swing** (Interfaz gráfica)
- **NetBeans 17**

---

## 📂 Estructura del Proyecto

```
Proyecto Integrador/
├── aeropuerto.sql               # Script de creación de la base de datos
└── Proyecto/
    ├── pom.xml                  # Dependencias y configuración Maven
    └── src/
        └── main/
            └── java/
                └── com/mycompany/proyecto/
                    ├── Proyecto.java          # Clase principal
                    ├── modelo/                # Entidades JPA
                    ├── controlador/           # Lógica de negocio
                    └── persistencia/          # Controladores JPA
```

---

### 🔹 Paquetes principales

✅ **modelo/**  
Contiene las clases que representan las tablas del sistema (Aerolinea, Avion, Vuelo, etc.).

✅ **controlador/**  
Contiene la lógica de negocio: consultas de vuelos y gestión de reservas.

✅ **persistencia/**  
Controladores JPA para operaciones CRUD de cada entidad.

✅ **vista/**  
Espacio preparado para agregar formularios Swing (interfaz gráfica).

---

## ⚙️ Configuración y Ejecución

### 1️⃣ Requisitos previos

- **MySQL/MariaDB instalado**
- **Java 17**
- **Maven**
- **NetBeans 17** (opcional, pero recomendado)

---

### 2️⃣ Preparar la base de datos

Ejecuta el script **aeropuerto.sql** en tu servidor MySQL:

```sql
SOURCE aeropuerto.sql;
```

---

### 3️⃣ Configurar conexión en `persistence.xml`

Ubicado en:

```
src/main/resources/META-INF/persistence.xml
```

Asegúrate de configurar tu usuario, contraseña y zona horaria:

```xml
<property name="javax.persistence.jdbc.url" 
          value="jdbc:mysql://localhost:3306/aeropuerto?serverTimezone=America/Argentina/Buenos_Aires"/>
<property name="javax.persistence.jdbc.user" value="root"/>
<property name="javax.persistence.jdbc.password" value="TU_PASSWORD"/>
```

⚠️ **Importante:**  
Si no configuras `serverTimezone`, obtendrás un error de zona horaria.

---

### 4️⃣ Compilar y ejecutar

Puedes compilar y ejecutar desde NetBeans o terminal:

```bash
mvn clean install
mvn exec:java
```

A partir de allí puedes expandir la lógica en `ControladoraModelo` y los controladores.

---

## ✨ Funcionalidades principales

- Alta y consulta de vuelos
- Gestión de reservas y pagos
- Registro de usuarios y consultas
- Integración con MySQL mediante JPA
- Estructura preparada para interfaz gráfica con Swing

---

## 🧩 Arquitectura del proyecto

El proyecto implementa:

✅ **Modelo-Vista-Controlador (MVC)**  
✅ **Cuarta capa de persistencia con JPA (EclipseLink)**  
✅ **Base de datos relacional (MySQL)**  
✅ **Swing** como base para vistas gráficas futuras

---

## 🛠️ Dependencias principales (`pom.xml`)

- `org.eclipse.persistence:eclipselink`
- `mysql:mysql-connector-java`
- `org.codehaus.mojo:exec-maven-plugin`

Estas dependencias gestionan la persistencia y la ejecución de la aplicación.

---

## 💡 Notas importantes

- Las entidades usan anotaciones JPA para mapear tablas.
- El proyecto puede ampliarse agregando ventanas Swing para interacción gráfica.
- Los controladores contienen lógica de negocio desacoplada de la persistencia.

---

## 📄 Licencia

Este proyecto es de uso académico. Puedes adaptarlo y modificarlo libremente según tus necesidades.

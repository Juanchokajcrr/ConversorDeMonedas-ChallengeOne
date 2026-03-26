# 💱 Conversor de Monedas

[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Una aplicación de consola moderna y eficiente desarrollada en Java que permite convertir dinero entre diferentes monedas utilizando tasas de cambio en tiempo real. Este proyecto es parte del **Challenge One de Alura**.

## 📋 Tabla de Contenidos

- [Características](#características)
- [Requisitos Previos](#requisitos-previos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Tecnologías](#tecnologías)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## ✨ Características

- 🔄 **Conversión bidireccional** entre USD, ARS, BRL y COP
- 📡 **Tasas de cambio en tiempo real** obtenidas de API externa
- 🎨 **Interfaz intuitiva** con menú interactivo
- ⚡ **Respuesta rápida** y eficiente
- 🔒 **Código estructurado** y fácil de mantener
- 📊 **Soporte para múltiples monedas** extensible

## 🛠️ Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener lo siguiente instalado en tu sistema:

- **Java 17** o superior
- **Conexión a Internet** (para obtener las tasas de cambio actualizadas)
- **Git** (opcional, para clonar el repositorio)

Para verificar la versión de Java instalada:
```bash
java -version
```

## 📥 Instalación

### 1. Clonar el Repositorio

```bash
git clone https://github.com/Juanchokajcrr/ConversorDeMonedas-ChallengeOne.git
cd ConversorDeMonedas-ChallengeOne
```

### 2. Compilar el Proyecto

```bash
javac -d out src/ConversorDeMonedas/main/Main.java
```

Este comando compilará todos los archivos Java necesarios en el directorio `out`.

## 🚀 Uso

### Ejecutar la Aplicación

```bash
java -cp out ConversorDeMonedas.main.Main
```

### Instrucciones en Pantalla

Una vez ejecutada la aplicación, verás un menú interactivo donde podrás:

1. Seleccionar la moneda de origen
2. Ingresar el monto a convertir
3. Elegir la moneda de destino
4. Obtener el resultado instantáneamente

**Ejemplo de uso:**
```
===== CONVERSOR DE MONEDAS =====
Selecciona una opción:
1. USD a ARS
2. USD a BRL
3. USD a COP
4. ARS a USD
5. BRL a USD
6. COP a USD
7. Salir
```

## 📁 Estructura del Proyecto

```
ConversorDeMonedas-ChallengeOne/
├── src/
│   └── ConversorDeMonedas/
│       ├── main/
│       │   └── Main.java              # Punto de entrada de la aplicación
│       ├── funciones/
│       │   └── ConsultaMoneda.java    # Consulta de tasas de cambio vía API
│       └── models/
│           ├── Moneda.java            # Modelo de datos para monedas
│           └── TasaConversion.java    # Modelo de datos para tasas
├── out/                               # Directorio de compilación
├── README.md                          # Este archivo
└── img.png                            # Captura de pantalla
```

## 🔧 Tecnologías

| Tecnología | Descripción |
|-----------|-------------|
| **Java 17+** | Lenguaje de programación principal |
| **API REST** | Para obtener tasas de cambio actualizadas |
| **JSON** | Formato de intercambio de datos |
| **HttpURLConnection** | Para realizar peticiones HTTP |

## 📝 Detalle de Clases Principales

### `Main.java`
Punto de entrada de la aplicación. Gestiona el flujo principal y el menú interactivo.

### `ConsultaMoneda.java`
Realiza consultas a la API de cambio de monedas y procesa los datos recibidos.

### Modelos
Clases que representan las estructuras de datos utilizadas en la aplicación.

## 🤝 Contribuir

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto:

1. Haz un Fork del repositorio
2. Crea una rama para tu feature (`git checkout -b feature/mejora`)
3. Commits tus cambios (`git commit -am 'Agrega nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/mejora`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## 👤 Autor

**Juanchokajcrr ** - [Juanchokajcrr](https://github.com/Juanchokajcrr)

---

## 💡 Tips Útiles

- Asegúrate de tener una conexión a internet activa para obtener tasas de cambio precisas
- Las tasas se actualizan en cada consulta a la API
- Para agregar más monedas, modifica la clase `ConsultaMoneda.java`

---

**¿Te gustó este proyecto?** ⭐ Dale una estrella en GitHub si te fue útil.

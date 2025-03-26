# Login Screen en Jetpack Compose 🚀✨🔥

Este proyecto implementa una pantalla de inicio de sesión en Android utilizando Jetpack Compose. La UI está inspirada en la imagen de referencia, con soporte para temas claro y oscuro. 🎨📱🌙

## Características 🎯📌💡

- Diseño moderno y minimalista.
- Modo claro y oscuro.
- Uso del sistema de temas de Jetpack Compose.
- Campos de entrada para nombre de usuario y contraseña.
- Botón de inicio de sesión y enlace de registro.

## Capturas de Pantalla 📷🖼️🌗

<img width="518" alt="Captura de pantalla 2025-03-26 a la(s) 2 46 48 p m" src="https://github.com/user-attachments/assets/7f714b65-65af-471a-a2c4-0e500e52d7fc" />


## Tecnologías Utilizadas 🛠️💻🚀

- **Kotlin**
- **Jetpack Compose**
- **Material 3**

## Instalación 🏗️📂⚙️

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/login-compose.git
   ```
2. Ábrelo en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo físico.

## Código de Ejemplo 📝📜💻

```kotlin
@Composable
fun LoginPage(modifier: Modifier = Modifier) {

    var Username by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginImage(
                modifier = modifier
            )
            InputsFields(
                username = Username,
                password = Password,
                onUsernameChange = {
                    Username = it
                },
                onPasswordChange = {
                    Password = it
                },
                modifier = modifier
            )
            Spacer(
                modifier = modifier
                    .padding(128.dp)
            )
            LoginButtons(
                modifier = modifier
            )
        }
    }
}
```

## Contribución 🤝🌍📌

Si deseas contribuir, por favor abre un issue o un pull request.

## Licencia 📜⚖️✅

Este proyecto está bajo la licencia MIT.


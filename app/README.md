# MiPerfil - Práctica Jetpack Compose

Proyecto Android desarrollado con Jetpack Compose que contiene dos pantallas.

## Pantallas

- **Práctica 1 - Mi Perfil:** pantalla de perfil de usuario
- **Práctica 2 - Dashboard Estudiantil:** panel de resumen estudiantil

## Cómo cambiar de pantalla

En el archivo `MainActivity.kt` línea 16, cambia:

- Para ver **Mi Perfil:** `HomeScreen()`
- Para ver **Dashboard:** `DashboardScreen()`

Y agrega el import correspondiente en la línea 8:

- Mi Perfil: `import com.sena.miperfil.ui.screens.HomeScreen`
- Dashboard: `import com.sena.miperfil.ui.screens.DashboardScreen`
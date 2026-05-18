package com.sena.miperfil.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DashboardSection() {
    Column(modifier = Modifier.fillMaxWidth()) {

        Row(
            modifier = Modifier.fillMaxWidth().background(Color.White, RoundedCornerShape(16.dp)).padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(Icons.Default.Notifications, contentDescription = null, tint = Color(0xFF39A900), modifier = Modifier.size(28.dp))
            Text(text = "Dashboard Estudiantil", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF111827))
            Icon(Icons.Default.AccountCircle, contentDescription = null, tint = Color(0xFF2D58C8), modifier = Modifier.size(28.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Surface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp), color = Color.White, shadowElevation = 2.dp) {
            Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "¡Hola, Estudiante! 👋", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color(0xFF111827))
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Aquí tienes un resumen de tu progreso.", fontSize = 14.sp, color = Color(0xFF6B7280))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            TarjetaEstadistica(modifier = Modifier.weight(1f), icon = Icons.Default.MenuBook, iconColor = Color(0xFF2D58C8), valor = "12", etiqueta = "Cursos")
            TarjetaEstadistica(modifier = Modifier.weight(1f), icon = Icons.Default.CheckCircle, iconColor = Color(0xFF39A900), valor = "85%", etiqueta = "Progreso")
            TarjetaEstadistica(modifier = Modifier.weight(1f), icon = Icons.Default.Star, iconColor = Color(0xFFF59E0B), valor = "3", etiqueta = "Logros")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Surface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp), color = Color.White, shadowElevation = 2.dp) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Curso actual", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "Desarrollo Android con Compose", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Próxima clase", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "Martes, 21 de mayo - 10:00 AM", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Calificación actual", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "9.2 / 10", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            OutlinedButton(
                onClick = { },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(text = "Ver detalles", color = Color(0xFF2D58C8))
            }
            Spacer(modifier = Modifier.width(12.dp))
            Button(
                onClick = { },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2D58C8))
            ) {
                Text(text = "Continuar", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier.fillMaxWidth().background(Color(0xFFE8F0FE), RoundedCornerShape(16.dp)).padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "ⓘ  Sigue practicando y construye grandes aplicaciones con Compose.", fontSize = 14.sp, color = Color(0xFF2D58C8), fontWeight = FontWeight.Medium)
        }
    }
}

@Composable
fun TarjetaEstadistica(modifier: Modifier, icon: ImageVector, iconColor: Color, valor: String, etiqueta: String) {
    Surface(modifier = modifier, shape = RoundedCornerShape(16.dp), color = Color.White, shadowElevation = 2.dp) {
        Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector = icon, contentDescription = etiqueta, tint = iconColor, modifier = Modifier.size(28.dp))
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = valor, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF111827))
            Text(text = etiqueta, fontSize = 12.sp, color = Color(0xFF6B7280))
        }
    }
}
package com.sena.miperfil.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SaludoSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Mi Perfil", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color(0xFF111827))
        Text(text = "Jetpack Compose Básico", fontSize = 14.sp, color = Color(0xFF6B7280))

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier.size(110.dp).clip(CircleShape).background(Color(0xFFD1D5DB)).border(3.dp, Color(0xFF39A900), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Avatar", modifier = Modifier.size(64.dp), tint = Color(0xFF6B7280))
        }

        Spacer(modifier = Modifier.height(24.dp))

        Surface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp), color = Color.White, shadowElevation = 4.dp) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(text = "Nombre:", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "Ana López", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Correo:", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "ana.lopez@estudiante.com", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Curso:", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "Desarrollo Android", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Estado:", fontSize = 13.sp, color = Color(0xFF6B7280))
                Text(text = "Activo", fontSize = 15.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFF39A900))
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = { }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2D58C8))) {
                Text(text = "Editar", color = Color.White)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF39A900))) {
                Text(text = "Guardar", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier.fillMaxWidth().background(Color(0xFFE8F0FE), RoundedCornerShape(16.dp)).padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "ⓘ  Práctica de layouts en Compose", fontSize = 14.sp, color = Color(0xFF2D58C8), fontWeight = FontWeight.Medium)
        }
    }
}
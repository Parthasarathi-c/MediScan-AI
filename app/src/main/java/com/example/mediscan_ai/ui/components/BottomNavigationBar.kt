package com.example.mediscan_ai.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Person
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavigationBar(
    onScanClick: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp,vertical = 12.dp),

        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Default.Home,
                contentDescription =  "Home",
                tint = Color(0xFF2563EB)
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Home",
                color = Color(0xFF2563EB),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Column(
            modifier = Modifier.clickable {
                onScanClick()
            },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Default.CameraAlt,
                contentDescription = "Scan" ,
                tint = Color.Gray
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Scan",
                color = Color.Gray,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = Icons.Default.Person,
                contentDescription = "Profile",
                tint = Color.Gray
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Profile",
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )

        }
    }
}
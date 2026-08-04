package com.example.mediscan_ai.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MedicineSearchBar(value: String,
                      onValueChange: (String) -> Unit) {

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,

        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),

        placeholder = {
            Text("Search medicines or conditions...")
        },

        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search"
            )
        },

        shape = RoundedCornerShape(18.dp),

        singleLine = true
    )
}
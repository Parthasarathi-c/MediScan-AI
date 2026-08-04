package com.example.mediscan_ai.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import com.example.mediscan_ai.ui.components.MedicineSearchBar
import com.example.mediscan_ai.ui.components.MedicineScanCard
import com.example.mediscan_ai.ui.components.AppHeader
import com.example.mediscan_ai.ui.components.BottomNavigationBar

@Composable
fun HomeScreen() {

    var searchText by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp)
    ) {

        AppHeader()

        MedicineSearchBar(
            value = searchText,
            onValueChange = {
                searchText = it
            }
        )

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        MedicineScanCard()

        Spacer(
            modifier = Modifier.height(400.dp)
        )

        BottomNavigationBar()

    }
}



/*Column
│
├── Header
│
├── MedicineSearchBar()
│
├── MedicineScanCard()
│
├── Recent Scans Title
│
├── LazyRow
│      ├── RecentScanCard()
│      ├── RecentScanCard()
│      └── RecentScanCard()
│
├── HealthTipCard()
│
└── BottomNavigationBar()
*/
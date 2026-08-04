package com.example.mediscan_ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.Color
import com.example.mediscan_ai.ui.components.MedicineSearchBar
import com.example.mediscan_ai.ui.components.MedicineScanCard
import com.example.mediscan_ai.ui.components.AppHeader
import com.example.mediscan_ai.ui.components.BottomNavigationBar
import com.example.mediscan_ai.ui.components.RecentScanCard
import com.example.mediscan_ai.ui.components.HealthTipCard
import com.example.mediscan_ai.ui.data.HealthTips

@Composable
fun HomeScreen() {

    var searchText by remember {
        mutableStateOf("")
    }

    val todayTip = HealthTips.tips.random()

    Scaffold(

        topBar = {
            AppHeader()
        },

        bottomBar = {
            Surface(
                shape = RoundedCornerShape(
                    topStart = 28.dp,
                    topEnd = 28.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp
                ),
                shadowElevation = 8.dp,
                color = MaterialTheme.colorScheme.background
            ) {
                BottomNavigationBar()
            }
        },

        containerColor = Color(0xFFF8FAFC)

    )  { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {

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

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Recent Scans",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 20.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                RecentScanCard(
                    medicineName = "Paracetamol 500",
                    subtitle = "Verified • 2 hours ago"
                )

                RecentScanCard(
                    medicineName = "Vitamin D3",
                    subtitle = "Verified • Yesterday"
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Health Tip",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 20.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                HealthTipCard(
                    tip = todayTip
                )
            }
        }
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
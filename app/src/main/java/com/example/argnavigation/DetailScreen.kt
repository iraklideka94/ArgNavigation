package com.example.argnavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    userId: Int,
    navController: NavController
) {

    val user = users.find { it.id == userId }!!

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = Icons.Rounded.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
                title = { Text(text = "User Info") })
        }
    ) {contentPadding ->
Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(contentPadding)
) {

    UserInfo(label = "Name: ${user.name}")
    UserInfo(label = "Email: ${user.email}")
    UserInfo(label = "Contact No: ${user.phone}")
    UserInfo(label = "Address: ${user.address}")
}
    }

}


@Composable
fun UserInfo(
    modifier: Modifier = Modifier,
    label: String
) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        text = label,
        fontSize = 18.sp
    )
}
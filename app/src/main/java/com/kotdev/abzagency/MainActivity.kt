package com.kotdev.abzagency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.kotdev.abzagency.core_ui.theme.AbzAgencyTheme
import com.kotdev.abzagency.presentation.ui.AppMain
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AbzAgencyTheme {
                Scaffold { innerPadding ->
                    AppMain(padding = innerPadding)
                }
            }
        }
    }
}
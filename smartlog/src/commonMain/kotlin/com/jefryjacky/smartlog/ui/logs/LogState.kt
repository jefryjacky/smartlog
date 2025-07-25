package com.jefryjacky.smartlog.ui.logs

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.jefryjacky.smartlog.domain.entity.LogEntity

@Immutable
data class LogState(
    val isScrollToTop:Boolean = true,
    val isFilterOn: Boolean = false,
    val isPlaying: Boolean = true,
    val logs:List<LogEntity> = emptyList(),
){
    @Composable
    fun getIconScrollTopColor(): Color{
        return if(isScrollToTop){
            MaterialTheme.colorScheme.primary
        } else {
            Color.White
        }
    }

    @Composable
    fun getIconFileterColor(): Color{
        return if(isFilterOn){
            MaterialTheme.colorScheme.primary
        } else {
            Color.White
        }
    }

    @Composable
    fun getIconPlayColor(): Color{
        return if(isPlaying){
            MaterialTheme.colorScheme.primary
        } else {
            Color.White
        }
    }
}

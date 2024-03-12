package com.example.cupcakesapp.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import com.example.cupcakesapp.R


@Composable
fun FormattedPriceLabel(subtotal: String, modifier: Modifier) {
    Text(
        text = stringResource(R.string.sub_total, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )

}
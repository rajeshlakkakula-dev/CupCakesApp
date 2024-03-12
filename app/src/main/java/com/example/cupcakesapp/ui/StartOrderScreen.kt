package com.example.cupcakesapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Text
import com.example.cupcakesapp.R
import com.example.cupcakesapp.data.DataSource.quantityOptions

/**
 * This composable allows user to select desired cupcake quantity and expects the selected quantity and triggers the navigation to the next screen
 * */
@Composable
fun StartOrderScreen(
    quantityOptions: List<Pair<Int, Int>>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly


    ) {

        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(R.drawable.cupcake),
            contentDescription = null,
            modifier = modifier.width(300.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.order_cakes),
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(8.dp))

        quantityOptions.forEach { item ->
            SelectQuantityButton(
                labelResourceId = item.first,
                onClick = { /* TODO: Handle next button*/ }
            )
        }

    }

}

@Composable
fun SelectQuantityButton(
    @StringRes labelResourceId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(onClick = onClick, modifier.widthIn(min = 250.dp)) {

        Text(stringResource(labelResourceId))
    }
}

@Preview
@Composable
fun StartOrderPreview() {
    StartOrderScreen(quantityOptions = quantityOptions)
}

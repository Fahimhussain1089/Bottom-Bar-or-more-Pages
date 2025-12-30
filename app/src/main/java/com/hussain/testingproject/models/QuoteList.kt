package com.hussain.testingproject.models

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.hussain.testingproject.Screen.QuoteListItem

@Composable
fun QuoteList(
    data:Array<Quots>,
    onclick:(quote: Quots)-> Unit
) {
    LazyColumn (content = {
        items(data)
        {
            QuoteListItem(quote = it,onclick)
        }

    })

}
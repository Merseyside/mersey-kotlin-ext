package com.merseyside.merseyLib.kotlin.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

val computationContext: CoroutineDispatcher = Dispatchers.Default
val applicationContext: CoroutineDispatcher = Dispatchers.Main
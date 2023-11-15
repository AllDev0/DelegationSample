package com.helloworldstudios.delegationsample

import androidx.lifecycle.LifecycleOwner

interface LifecycleLogger {
    fun logLifecycle(owner: LifecycleOwner)
}
package com.helloworldstudios.delegationsample

import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleLoggerImplementation : LifecycleLogger, LifecycleEventObserver{
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event){
            Lifecycle.Event.ON_CREATE -> println("On Create Executed")
            Lifecycle.Event.ON_START -> println("On Start Executed")
            Lifecycle.Event.ON_RESUME -> println("On Resume Executed")
            Lifecycle.Event.ON_PAUSE -> println("On Pause Executed")
            Lifecycle.Event.ON_STOP -> println("On Stop Executed")
            Lifecycle.Event.ON_DESTROY -> println("On Destroy Executed")
            else -> "Else situation : ${event.name}"
        }
    }

    override fun logLifecycle(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

}
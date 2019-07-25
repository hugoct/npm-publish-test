package com.reactnative_kotlin_bridge.MeuToast

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


class MeuToastManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "MinhaLibToast"
    }

    @ReactMethod
    fun exibirToast(texto: String) {
        val toast = Toast.makeText(getReactApplicationContext(), texto, Toast.LENGTH_LONG)
        toast.show()
    }

}
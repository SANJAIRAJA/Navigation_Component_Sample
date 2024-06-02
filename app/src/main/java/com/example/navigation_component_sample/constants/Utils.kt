package com.example.navigation_component_sample.constants

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

open class Utils {

    open fun preventTwoClick(view01: View) {
        view01.isEnabled = false
        view01.postDelayed(
            { view01.isEnabled = true },
            700
        )
    }

    open fun preventTwoClickForAll(view01: View,view02: View,view03: View,view04: View,view05: View) {
        view01.isEnabled = false
        view02.isEnabled = false
        view03.isEnabled = false
        view04.isEnabled = false
        view05.isEnabled = false


        view01.postDelayed(
            { view01.isEnabled = true },
            400
        )
        view02.postDelayed(
            { view02.isEnabled = true },
            400
        )

        view03.postDelayed(
            { view03.isEnabled = true },
            400
        )

        view04.postDelayed(
            { view04.isEnabled = true },
            400
        )

        view05.postDelayed(
            { view05.isEnabled = true },
            400
        )
    }

    open fun jumpView(view: View) {
        val jumpUp = ObjectAnimator.ofFloat(view, "translationY", 0f, -30f).apply {
            duration = 100

        }

        val jumpDown = ObjectAnimator.ofFloat(view, "translationY", -30f, 0f).apply {
            duration = 100
        }

        AnimatorSet().apply {
            playSequentially(jumpUp, jumpDown)
            start()
        }
    }
}
package com.madrapps.pikolo.components.rgb

import android.graphics.Color
import com.madrapps.pikolo.Metrics
import com.madrapps.pikolo.Paints
import com.madrapps.pikolo.components.ArcComponent

internal class BlueComponent(metrics: Metrics, paints: Paints, arcLength: Float, arcStartAngle: Float) : ArcComponent(metrics, paints, arcLength, arcStartAngle) {

    private val index: Int = 2
    override val range: Float = 255f
    override val noOfColors = 2
    override val colors = IntArray(noOfColors)
    override val colorPosition = FloatArray(noOfColors)

    override fun getColorArray(color: FloatArray): IntArray {
        colors[0] = Color.BLACK
        colors[1] = Color.rgb(0, 0, 255)
        return colors
    }

    override fun updateComponent(angle: Double): Float {
        val component = super.updateComponent(angle)
        metrics.color[index] = component
        return component
    }
}
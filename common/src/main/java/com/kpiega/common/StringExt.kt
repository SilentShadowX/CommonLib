package com.kpiega.common

import android.graphics.Bitmap
import android.widget.ImageView
import java.net.URL

/**
 * Created by kpiega on 04.07.2017.
 */

fun String.appendText(text: String) = text + " - my append string"
fun ImageView.loadImage(bitmap: Bitmap) = this.setImageBitmap(bitmap)
package com.standout

import android.widget.FrameLayout
import wei.mark.standout.StandOutWindow
import wei.mark.standout.ui.Window

open class DefaultWindow : StandOutWindow(){
    override fun getAppName(): String {
        return "standout"
    }

    override fun getAppIcon(): Int {
        return R.drawable.icon
    }

    override fun createAndAttachView(id: Int, frame: FrameLayout?) {}

    override fun getParams(id: Int, window: Window?): StandOutLayoutParams?{
        val width = resources.getDimension(R.dimen.width).toInt()
        val height = resources.getDimension(R.dimen.height).toInt()
        return StandOutLayoutParams(
            id ,
        )
    }

    override fun isDisableMove(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}

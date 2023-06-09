package eu.thedarken.wldonate.common.mvpbakery.base


import androidx.lifecycle.LifecycleOwner

interface Presenter<ViewT : Presenter.View> {
    fun onBindChange(view: ViewT?)

    fun onDestroy()

    interface View : LifecycleOwner
}

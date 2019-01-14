package de.berazouskaya.hanna.luckydog.main.base

import android.support.v4.app.DialogFragment
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    /**
     * @param tag - dialog fragment show transactions assigned tag.
     *
     * @return true if DialogFragment with provided tag found in activity. Works with supportFragmentManager only.
     */
    protected fun isDialogShown(tag: String?): Boolean {
        val dlg = supportFragmentManager.findFragmentByTag(tag)
        return dlg != null && dlg is DialogFragment &&
                dlg.dialog != null && dlg.dialog.isShowing

    }
}
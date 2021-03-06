package me.lazy_assedninja.demo.library.ui

import android.content.Context
import android.os.IBinder
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity

/**
 * A generic AppCompatActivity that provide generic functions.
 */
@Suppress("unused")
abstract class BaseActivity : AppCompatActivity() {

    protected fun dismissKeyboard(windowToken: IBinder?) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(windowToken, 0)
    }
}
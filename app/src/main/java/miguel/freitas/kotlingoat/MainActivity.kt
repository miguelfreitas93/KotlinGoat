package miguel.freitas.kotlingoat

import android.os.Build
import android.os.Bundle
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var url: String = getValue(R.id.url)
        var integer: Int = getValue(R.id.integer).toInt()
        var path: String = getValue(R.id.path)
        var username: String = getValue(R.id.username)
        var password: String = getValue(R.id.password)
        var xml: String = getValue(R.id.xml)
        var clazz: String = getValue(R.id.clazz)

        PrivacyViolation.init(password, this)


    }

    private fun getValue(id: Int): String {
        return findViewById<EditText>(id).text.toString()
    }
}

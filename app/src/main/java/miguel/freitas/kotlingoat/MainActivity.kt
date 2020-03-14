package miguel.freitas.kotlingoat

import android.os.Build
import android.os.Bundle
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import miguel.freitas.kotlingoat.high.CodeInjection
import miguel.freitas.kotlingoat.high.CommandInjection
import miguel.freitas.kotlingoat.medium.InsecureRandom
import miguel.freitas.kotlingoat.medium.PrivacyViolation
import miguel.freitas.kotlingoat.medium.ProcessControl
import miguel.freitas.kotlingoat.medium.UseOfNativeLanguage

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url: String = getValue(R.id.url)
        val integer: Int = getValue(R.id.integer).toInt()
        val path: String = getValue(R.id.path)
        val username: String = getValue(R.id.username)
        val password: String = getValue(R.id.password)
        val xml: String = getValue(R.id.xml)
        val clazz: String = getValue(R.id.clazz)

        CodeInjection.init(clazz)
        CommandInjection.init(username)
        PrivacyViolation.init(password, this)
        val randomPassword = InsecureRandom.getRandomPassword()
        val stringFromJNI = UseOfNativeLanguage.getStringFromJNI()
        val passwordFromJNI = UseOfNativeLanguage.getPasswordFromJNI()
        val keyFromJNI = UseOfNativeLanguage.getKeyFromJNI()
        val sFromJNI = UseOfNativeLanguage.getFromJNI()
        PrivacyViolation.init(passwordFromJNI, this) // Privacy Violation
        PrivacyViolation.init(keyFromJNI, this) // Privacy Violation
        PrivacyViolation.init(sFromJNI, this) // Privacy Violation
        val processControl = ProcessControl()



    }

    private fun getValue(id: Int): String {
        return findViewById<EditText>(id).text.toString()
    }
}

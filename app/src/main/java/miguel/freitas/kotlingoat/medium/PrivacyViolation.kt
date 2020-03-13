package miguel.freitas.kotlingoat.medium

import android.app.Activity
import android.os.Build
import android.util.Log
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.core.util.LogWriter
import com.crashlytics.android.Crashlytics
import com.google.firebase.crashlytics.FirebaseCrashlytics
import io.fabric.sdk.android.Fabric
import miguel.freitas.kotlingoat.R
import timber.log.Timber
import java.io.*
import java.nio.file.Files
import java.nio.file.Path
import java.util.logging.Level
import java.util.logging.Logger

class PrivacyViolation {
    companion object {
        private val TAG: String? = PrivacyViolation::class.qualifiedName

        external fun printPassword(password: String) // Use of Native Language

        @RequiresApi(Build.VERSION_CODES.O)
        fun init(password: String, activity: Activity){
            log(
                password
            )
            write(
                password
            )
            setText(
                password,
                activity
            )
            printPassword(password)
        }

        private fun log(password: String) {
            val log: Logger = Logger.getLogger(TAG)
            val fabricLogger: io.fabric.sdk.android.Logger = Fabric.getLogger()
            val firebaseCrashlytics = FirebaseCrashlytics.getInstance()
            val firebaseLogger = com.google.firebase.crashlytics.internal.Logger.getLogger()
            val slf4Logger = org.slf4j.LoggerFactory.getLogger(TAG)
            val logWriter: LogWriter = TODO()
            val console: Console = TODO()
            // Java Util Logging
            log.fine(password)
            log.info(password)
            log.severe(password)
            log.warning(password)
            log.log(Level.ALL, password)
            log.finer(password)
            log.finest(password)
            log.logp(Level.ALL,
                TAG, "log", password)
            // Android Util Log
            Log.e(TAG, password)
            Log.println(Log.ERROR,
                TAG, password)
            Log.d(TAG, password)
            Log.i(TAG, password)
            Log.v(TAG, password)
            Log.w(TAG, password)
            Log.wtf(TAG, password)
            Log.e(TAG, password)
            //Timber
            Timber.tag(password)
            Timber.log(Log.ERROR, password, Log.ERROR)
            Timber.v(password)
            Timber.i(password)
            Timber.e(password)
            Timber.d(password)
            Timber.w(password)
            Timber.wtf(password)
            //Crashalytics
            Crashlytics.log(password)
            Crashlytics.log(Log.ERROR,
                TAG, password)
            Crashlytics.logException(throw RuntimeException(password))
            Crashlytics.setString(password, password)
            Crashlytics.setUserIdentifier(password)
            //Fabric
            fabricLogger.log(Log.ERROR,
                TAG, password)
            fabricLogger.d(TAG, password)
            fabricLogger.e(TAG, password)
            fabricLogger.w(TAG, password)
            fabricLogger.i(TAG, password)
            fabricLogger.v(TAG, password)
            //Firebase
            firebaseCrashlytics.log(password)
            firebaseCrashlytics.recordException(throw RuntimeException(password))
            firebaseCrashlytics.setCustomKey("TAG", password)
            firebaseLogger.d(TAG, password)
            firebaseLogger.e(TAG, password)
            firebaseLogger.w(TAG, password)
            firebaseLogger.i(TAG, password)
            firebaseLogger.v(TAG, password)
            firebaseLogger.log(Log.ERROR,
                TAG, password)
            // SLF4J
            slf4Logger.debug(password)
            slf4Logger.error(password)
            slf4Logger.info(password)
            slf4Logger.trace(password)
            slf4Logger.warn(password)
            //Log Writer
            logWriter.write(password)
            logWriter.append(password)
            logWriter.appendln(password)
            // Prints
            print(password)
            println(password)
            System.out.println(password)
            System.out.print(password)
            System.out.write(password.toByteArray())
            System.out.printf(password)
            System.out.append(password)
            System.out.appendln(password)
            console.printf(password)
            console.format(TAG, password)
        }

        @RequiresApi(Build.VERSION_CODES.O)
        private fun write(password: String){
            val writer : Writer = TODO()
            val stringWriter : StringWriter = TODO()
            val bufferedOutputStream: BufferedOutputStream = TODO()
            val bufferedWriter: BufferedWriter = TODO()
            val byteArrayOutputStream: ByteArrayOutputStream = TODO()
            val dataOutputStream: DataOutputStream = TODO()
            val fileOutputStream: FileOutputStream = TODO()
            val filterOutputStream: FilterOutputStream = TODO()
            val path: Path = TODO()
            val fileWriter: FileWriter = TODO()
            val objectOutputStream: ObjectOutputStream = TODO()
            val outputStream: OutputStream = TODO()
            val outputStreamWriter: OutputStreamWriter = TODO()
            val pipedOutputStream: PipedOutputStream = TODO()
            val printStream: PrintStream = TODO()
            val printWriter: PrintWriter = TODO()
            val charArrayWriter: CharArrayWriter = TODO()
            val filterWriter: FilterWriter = TODO()
            val pipedWriter: PipedWriter = TODO()

            //Writer
            writer.write(password)
            writer.append(password)
            writer.appendln(password)
            //StringWriter
            stringWriter.write(password)
            stringWriter.append(password)
            stringWriter.appendln(password)
            // BufferedOutputStream
            bufferedOutputStream.write(password.toByteArray())
            // BufferedWriter
            bufferedWriter.write(password)
            bufferedWriter.append(password)
            bufferedWriter.appendln(password)
            //ByteArrayOutputStream
            byteArrayOutputStream.write(password.toByteArray())
            // DataOutputStream
            dataOutputStream.write(password.toByteArray())
            dataOutputStream.writeBytes(password)
            dataOutputStream.writeUTF(password)
            // FileOutputStream
            fileOutputStream.write(password.toByteArray())
            // Files
            Files.write(path, password.toByteArray())
            // FileWriter
            fileWriter.write(password)
            fileWriter.append(password)
            fileWriter.appendln(password)
            // FilterOutputStream
            filterOutputStream.write(password.toByteArray())
            // ObjectOutputStream
            objectOutputStream.write(password.toByteArray())
            objectOutputStream.writeBytes(password)
            objectOutputStream.writeObject(password)
            objectOutputStream.writeUnshared(password)
            // OutputStream
            outputStream.write(password.toByteArray())
            // OutputStreamWriter
            outputStreamWriter.write(password)
            outputStreamWriter.append(password)
            outputStreamWriter.appendln(password)
            // PipedOutputStream
            pipedOutputStream.write(password.toByteArray())
            // PrintStream
            printStream.printf(password)
            printStream.print(password)
            printStream.println(password)
            printStream.write(password.toByteArray())
            printStream.append(password)
            printStream.format(password)
            printStream.appendln(password)
            // PrintWriter
            printWriter.print(password)
            printWriter.println(password)
            printWriter.printf(password)
            printWriter.append(password)
            printWriter.format(password)
            printWriter.appendln(password)
            // CharArrayWriter
            charArrayWriter.write(password)
            charArrayWriter.append(password)
            charArrayWriter.appendln(password)
            // FilterWriter
            filterWriter.write(password)
            filterWriter.append(password)
            filterWriter.appendln(password)
            // PipedWriter
            pipedWriter.append(password)
            pipedWriter.write(password)
            pipedWriter.appendln(password)
        }

        private fun setText(password: String, activity: Activity){
            var passwordEditText = activity.findViewById<EditText>(R.id.password)
            passwordEditText.setText(password)
        }
    }
}
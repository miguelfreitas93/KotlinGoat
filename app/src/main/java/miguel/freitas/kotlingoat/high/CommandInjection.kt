package miguel.freitas.kotlingoat.high

import java.io.DataOutputStream

class CommandInjection {
    companion object {
        fun init(input: String) {
            val array1 = arrayOf(input)
            val array2 = Array(1) { input }
            val array3 = arrayOfNulls<String>(1)
            val array4 = listOf<String>(input)
            array3[0] = input
            val runtime = Runtime.getRuntime()
            runtime.exec(input) // Command Injection
            runtime.exec(array1) // Command Injection
            runtime.exec(array2) // Command Injection
            runtime.exec(array3) // Command Injection
            val processBuilder = ProcessBuilder()
            processBuilder.command(input) // Command Injection
            processBuilder.command(array4) // Command Injection
            val process: Process = processBuilder.start()
            val outputStream = process.outputStream
            outputStream.write(input.toByteArray()) // Command Injection
            val dataOutputStream = DataOutputStream(outputStream)
            dataOutputStream.writeUTF(input) // Command Injection
            dataOutputStream.write(input.toByteArray()) // Command Injection
            dataOutputStream.writeChars(input) // Command Injection
        }
    }
}
package miguel.freitas.kotlingoat.high

import dalvik.system.BaseDexClassLoader
import dalvik.system.DexClassLoader

class CodeInjection {
    companion object {
        fun init(clazz: String) {
            val runtime = Runtime.getRuntime()
            runtime.load(clazz)
            runtime.loadLibrary(clazz)
            Class.forName(clazz)
            Class.forName("test").getMethod(clazz)
            Class.forName("test").getDeclaredMethod(clazz)
            System.load(clazz)
            System.loadLibrary(clazz)
            ClassLoader.getSystemClassLoader().loadClass(clazz)
            DexClassLoader.getSystemClassLoader().loadClass(clazz)
            BaseDexClassLoader.getSystemClassLoader().loadClass(clazz)
        }
    }
}
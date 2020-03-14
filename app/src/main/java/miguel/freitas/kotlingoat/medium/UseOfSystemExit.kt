package miguel.freitas.kotlingoat.medium

import kotlin.system.exitProcess

class UseOfSystemExit {
    companion object {
        fun exit(){
            val runtime = Runtime.getRuntime()
            System.exit(1) // Use of System Exit
            exitProcess(1) // Use of System Exit
            runtime.exit(1) // Use of System Exit
        }
    }
}
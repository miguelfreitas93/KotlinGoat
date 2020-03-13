package miguel.freitas.kotlingoat.medium

import kotlin.system.exitProcess

class UseOfSystemExit {
    companion object {
        fun exit(){
            System.exit(1) // Use of System Exit
            exitProcess(1) // Use of System Exit
        }
    }
}
package miguel.freitas.kotlingoat.medium

import java.util.Random

class InsecureRandom {

    companion object{
        fun getRandomPassword() : Long {
            val javaRandom = Random()
            return javaRandom.nextLong() // Insecure Random
        }
    }

}
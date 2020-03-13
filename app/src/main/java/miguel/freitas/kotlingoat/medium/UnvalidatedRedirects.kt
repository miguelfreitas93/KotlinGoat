package miguel.freitas.kotlingoat.medium

import okhttp3.OkHttpClient

class UnvalidatedRedirects {
    companion object{
        fun init(){
            val builder: OkHttpClient.Builder = OkHttpClient.Builder()
            builder.followSslRedirects(true) // Unvalidated Redirects
            builder.followRedirects(true) // Unvalidated Redirects
        }
    }
}
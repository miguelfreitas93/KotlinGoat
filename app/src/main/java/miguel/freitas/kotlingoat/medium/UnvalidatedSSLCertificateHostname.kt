package miguel.freitas.kotlingoat.medium

import okhttp3.OkHttpClient
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLSession

class UnvalidatedSSLCertificateHostname {
    companion object{
        fun init() {
            val builder: OkHttpClient.Builder = OkHttpClient.Builder()
            builder.hostnameVerifier { hostname, session -> true }//Unvalidated SSL Certificate Hostname
        }
        class CustomHostnameVerifier : HostnameVerifier {
            override fun verify(hostname: String?, session: SSLSession?): Boolean {
                return true //Unvalidated SSL Certificate Hostname
            }
        }
    }
}


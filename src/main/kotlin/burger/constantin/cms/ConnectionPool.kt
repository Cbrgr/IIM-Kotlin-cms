package burger.constantin.cms

import java.sql.Connection
import java.sql.DriverManager
import java.util.concurrent.ConcurrentLinkedQueue


class ConnectionPool(val url: String, val user: String, val password: String) {
    private val list = ArrayList<Connection>()

    //private val queue = ConcurrentLinkedQueue<Connection>()

    fun getConnection(): Connection {
        if (list.isEmpty()) {
            return DriverManager.getConnection(url, user, password)
        } else {
            return list.removeAt(0)
        }
    }

    fun releaseConnection(c: Connection) {
        list.add(c)
    }

    inline fun useConnection(f: (Connection) -> Unit) {
        val connection = getConnection()
        try {
            f(connection)
        } finally {
            releaseConnection(connection)
        }
    }
}
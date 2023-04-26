import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement


fun main(args: Array<String>) {
    try {
        val connection: Connection =
            DriverManager.getConnection("jdbc:mysql://localhost:3306/pinodb", "developer", "developer")
        val statement: Statement = connection.createStatement()
        statement.execute("insert into students (last_name,first_name) values('Pigno','Pino')")
        statement.execute("insert into students (last_name,first_name) values('Lo Bello','Marco')")
        statement.execute("insert into students (last_name,first_name) values('Pigna','Pina')")
        statement.execute("insert into students (last_name,first_name) values('Pignuzza','Pignetta')")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
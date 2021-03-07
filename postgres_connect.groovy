import groovy.sql.Sql

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.2.2')

def dbUrl = "jdbc:postgresql://localhost/test-db"
def dbUser = "postgres"
def dbPassword = "postgres"
def dbDriver = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)

sql.eachRow("select * from accounts", { println it.user_id + " -- ${it.username} --"} );

row = sql.firstRow("select username, email from accounts")
println "Row: username = ${row.username} and email = ${row.email}"

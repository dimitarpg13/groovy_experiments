import groovy.sql.Sql

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.2.2')

def dbUrl = "jdbc:postgresql://localhost/test-db"
def dbUser = "postgres"
def dbPassword = "postgres"
def dbDriver = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)

def user_id = 3
def username = "peter"
def password = "mypass"
def email = "peter@gbrain.com"
def created_on = "2019-10-13"
def last_login = "2020-11-1"

sql.execute("insert into accounts (user_id, username, password, email, created_on, last_login) values "+
            "(${user_id}, '${username}', '${password}', '${email}', '${created_on}', '${last_login}')")


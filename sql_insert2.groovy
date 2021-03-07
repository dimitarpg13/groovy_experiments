import groovy.sql.Sql

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.2.2')

def dbUrl = "jdbc:postgresql://localhost/test-db"
def dbUser = "postgres"
def dbPassword = "postgres"
def dbDriver = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)

def user_id = 4
def username = "paul"
def password = "mypass22"
def email = "paul@gbrain.com"
def created_on = "2019-12-11"
def last_login = "2020-10-15"

sql.execute("insert into accounts (user_id, username, password, email, created_on, last_login) values "+
            "(?,?,?,?,TO_TIMESTAMP(?, 'YYYY-MM-DD HH12:MI:SS'),TO_TIMESTAMP(?, 'YYYY-MM-DD HH12:MI:SS'))",
            [user_id, username, password, email, created_on, last_login])


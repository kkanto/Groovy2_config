 
listView('Groovy2 Jobs') {
    description('Groovy2 Jobs')
    jobs {
        regex('Groovy2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

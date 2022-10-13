 
listView('1310test Jobs') {
    description('1310test Jobs')
    jobs {
        regex('1310test_.+')
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

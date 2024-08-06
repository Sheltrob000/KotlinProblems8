fun main() {
    println(moreTimeTodayOrYesterday(500, 300))
}
fun moreTimeTodayOrYesterday(timeSpentToday :Int, timeSpentYesterday :Int) :Boolean {
    return timeSpentToday > timeSpentYesterday
}
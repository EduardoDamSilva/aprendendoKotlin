fun main() {
    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
}

fun trafficLightColorWhiteWhen() {
    val trafficLightColor = "Black"

    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Proceed with caution"
        "Grenn" -> "Go"
        else -> "Invalid traffic-light color"
    }
    print(message)
}
fun main() {
    val steps = 4000
    val caloriesBurned = PedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun PedometerStepsToCalories(numberOfSteps: Int): Double {
    val CaloriesBurnedForEachStep = 0.04
    val TotalCaloriesBurned = numberOfSteps * CaloriesBurnedForEachStep
    return TotalCaloriesBurned
}
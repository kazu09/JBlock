package com.cal.jblock

abstract class JBlock {
    /**
     * Defines the Given step in the test scenario.
     */
    fun Given(testSteps: JBlock.() -> Unit) {
        testSteps()
    }

    /**
     * Defines the When step in the test scenario.
     */
    fun When(testSteps: JBlock.() -> Unit) {
        testSteps()
    }

    /**
     * Defines the Then step in the test scenario.
     */
    fun Then(testSteps: JBlock.() -> Unit) {
        testSteps()
    }

    /**
     * Hook that runs before each test scenario.
     */
    abstract fun beforeEachScenario()

    /**
     * Hook that runs after each test scenario.
     */
    abstract fun afterEachScenario()

    /**
     * Executes a test scenario.
     *
     * @param caseComment
     * @param testSteps
     */
    fun steps(caseComment: String, testSteps: JBlock.() -> Unit) {
        if (caseComment.isNotEmpty()) {
            println(caseComment)
        }
        beforeEachScenario()
        this.testSteps()
        afterEachScenario()
    }
}
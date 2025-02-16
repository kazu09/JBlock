package com.cal.jblock

import org.junit.Assert.assertEquals
import org.junit.Test


class JBlockUnitTest: JBlock() {
    private var beforeScenario = EMPTY
    private var afterScenario = EMPTY
    override fun beforeEachScenario() {
        beforeScenario = "beforeScenario"
    }

    override fun afterEachScenario() {
        afterScenario = "afterScenario"
    }

    @Test
    fun before_scenario_test() {
        assertEquals(beforeScenario, EMPTY)
        steps("before scenario test") {

        }
        assertEquals(beforeScenario, BEFORE_SCENARIO_RESULT)
    }

    @Test
    fun after_scenario_test() {
        afterScenario = EMPTY
        assertEquals(afterScenario, EMPTY)
        steps("after scenario test") {

        }
        assertEquals(afterScenario, AFTER_SCENARIO_RESULT)
    }

    @Test
    fun steps_test() {
        var given = EMPTY
        var then = EMPTY
        var whenStr = EMPTY
        steps("steps test") {
            Given {
                given = "Given"
            }
            Then {
                then = "Then"
            }
            When {
                whenStr = "When"
            }
        }
        assertEquals(given, GIVEN_RESULT)
        assertEquals(then, THEN_RESULT)
        assertEquals(whenStr, WHEN_RESULT)
    }

    companion object {
        const val GIVEN_RESULT = "Given"
        const val THEN_RESULT = "Then"
        const val WHEN_RESULT = "When"
        const val BEFORE_SCENARIO_RESULT = "beforeScenario"
        const val AFTER_SCENARIO_RESULT = "afterScenario"
        const val EMPTY = ""
    }
}
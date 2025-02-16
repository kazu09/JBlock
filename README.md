# JBlock
## Overview
This library is an extension that allows you to intuitively write Given-When-Then structures when using JUnit.
It enhances test case readability and helps maintain a consistent format for well-structured tests.
This library was inspired by [JUnit](https://junit.org/).

## Important
* This library is designed for Kotlin and is not compatible with Java.
* This library is designed exclusively for JUnit.

## Usage
### introduction
* download
```
$ cd <your repository>
$ git init
$ git submodule add https://github.com/kazu09/JBlock.git libs/JBlock
```
* settings
```
settings.gradle

// Added
include(":libs:JBlock:jblock")
```

```
build.gradle[:app]

dependencies {
    ...
    // Added
    implementation(project(":libs:JBlock:jblock"))
}
```

### implementation
* extends
```
class ExampleTest: JBlock(){
    //　required override field
    override fun afterEachScenario() {

    }

    // required override field
    override fun beforeEachScenario() {

    }
  ...
}
```

* method
```
@Test
fun example_case() {
  steps("") {
    Given {
      // Please add test code
    }
    When {
      // Please add test code
    }
    Then {
      // Please add test code
    }
  }
}
```
[example : Please be careful call name （✖ BaseUnitTest, ◯ JBlock）](https://github.com/kazu09/GivenWhenThen-JUnit/blob/main/app/src/test/java/com/kazu/givenwhenthen_junit/MainUnitTest.kt)
## explain
* Overriding beforeEachScenario
  * In BaseUnitTest, beforeEachScenario() is a method that runs before each test scenario.
By default, it does nothing, but it can be overridden in test classes to set up common pre-test logic.

* Overriding afterEachScenario
  * In BaseUnitTest, afterEachScenario() is a method that runs after each test scenario.
By default, it does nothing, but it can be overridden in test classes to set up common pre-test logic.

* steps method arguments
  * Passing arguments will output a string at run time.


## Disclaimer
* This library is provided as-is, without any warranty or guarantee. The author is not responsible for any issues caused by the use of this library.

## Request
If you find any bugs or have any improvement suggestions, please open an issue. 

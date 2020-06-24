## MoshiX

Moshi is a modern JSON library for Kotlin and Java, This is a extension library of Moshi just for Kotlin.

### Dependence

1. open the `build.gradle` file in project root path and write down the codes of below
```groovy
allprojects {
    repositories {
        maven { url 'https://dl.bintray.com/badboy/lib' }
    }
}
```

2. open the `build.gradle` file in `app` path
```groovy
implementation 'com.badboy.lib:moshix:1.0.0'
```

3. For other usage, please refer to __[Moshi Official Github Page](https://github.com/square/moshi) __

### Usage

#### 1. to JSON String
```kotlin
data class Person(val name: String = "zhongzilu")

val jsonString = Person().toJson()
println(jsonString)
```

output:
```text
{"name":"zhongzilu"}
```

#### 2. Parse to object from JSON String
```kotlin
val json = "{\"name\":\"badboy\"}"
val person = Json.convert2<Person>(json)
println(person.toString())
```

output:
```text
Person(name=badboy)
```

#### 3. Get Moshi builder & add a custom `JsonAdapter.Factory`
```kotlin
val builder = Json.builder.add(CustomJsonAdapterFactory())
val moshi = builder.build()
val person = moshi.adapter(Person::class.java).fromJson("")

or

Json.builder.add(CustomJsonAdapterFactory())
val person = Json.convert2<Person>("")
```
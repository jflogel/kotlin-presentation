# Kotlin
  - statically-typed jvm language
  - object-oriented & functional
  - created by Jetbrains in 2010
  - version 1.0 in 2016
  - officially supported by Google for Android development

## Why another JVM language?
  - other languages didn't have the feature set Jetbrains wanted (except Scala)
  - wanted a language that compiled as fast as java

## Inspired by other languages
  - java (too verbose)
  - scala (immutability, harder to learn)
  - groovy (metaprogramming)
  - javascript (== vs ===)
  - c# (extension methods, async/await)
  - swift

## Hands-on
  - how do I get started? (with maven)
  -- kotlin-stdlib-jre8.jar
  -- kotlin-maven-plugin
  - interoperability with java
  - data classes
  - equality
  - null safety & smart compilation
  - type checks with is and automatic casts
  - extension methods

## Integration notes
  - spring
  - jackson serialization library
  - compiler plugins

## Pain points
  - kmongo

## IDE support
  - copy/paste java

## Future features
  - coroutines (async/await, yield support - experiemental)
  -- lightweight thread that can be suspended and resumed later
  - truly immutable data
  -- deep immutability of objects
  - collection literals
  -- [.., …] instead of listOf(…, …)
  - spring 5 features coming for kotlin
  - android studio language support
  - kotlin native
  -- compile program into native executable and eliminate need for jvm at runtime

## Tech radar
  - Thoughtworks has it ‘new assess’
  - maybe should be ‘trial’ for mobile development

## Other
  - can be compiled to javascript
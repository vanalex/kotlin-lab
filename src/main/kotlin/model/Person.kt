package org.example.model

@JvmInline
value class First(val value: String)
@JvmInline
value class Middle(val value: String?)
@JvmInline
value class Last(val value: String)

class Person(val first: First,
             val middle: Middle?,
             val last: Last)
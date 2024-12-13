package org.example.model

inline class First(val value: String)
inline class Middle(val value: String?)
inline class Last(val value: String)

class Person(val first: First,
             val middle: Middle?,
             val last: Last)
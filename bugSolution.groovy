```groovy
def myMethod(a, b) {
  a = a.toInteger()
  b = b.toInteger()
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 10) // Output: 10
println myMethod(10, 5) // Output: 10
println myMethod(5, 5) // Output: 5
println myMethod('10',5) // Output: 10
println myMethod(5,'10') // Output: 10
```
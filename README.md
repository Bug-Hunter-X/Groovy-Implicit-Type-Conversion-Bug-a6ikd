# Groovy Implicit Type Conversion Bug

This example demonstrates a common pitfall in Groovy related to implicit type conversion.  The `myMethod` function aims to return the larger of two numbers.  However, if the input values have different types (e.g., a `String` and a `Number`), Groovy's flexible type system may not behave as expected. This can lead to incorrect results that are difficult to debug.

## Solution

The provided solution ensures both inputs are treated as the same numeric type. By using `toInteger()` (or other appropriate conversion methods), you can avoid unintended type coercion.
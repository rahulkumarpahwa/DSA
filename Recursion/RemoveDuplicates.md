# Visualization and Call Stack Analysis of `removeDuplicatesRecursive`

## Initial Call:

- `idx = 0`, `currChar = 'a'`, `map['a' - 'a'] = false`
- Append `'a'` to `newStr`, set `map['a' - 'a'] = true`
- Call: `removeDuplicatesRecursive("aaabbccdd", 1, new StringBuilder("a"), map)`

## Second Call:

- `idx = 1`, `currChar = 'a'`, `map['a' - 'a'] = true`
- Skip `'a'`, call: `removeDuplicatesRecursive("aaabbccdd", 2, new StringBuilder("a"), map)`

## Third Call:

- `idx = 2`, `currChar = 'a'`, `map['a' - 'a'] = true`
- Skip `'a'`, call: `removeDuplicatesRecursive("aaabbccdd", 3, new StringBuilder("a"), map)`

## Fourth Call:

- `idx = 3`, `currChar = 'b'`, `map['b' - 'a'] = false`
- Append `'b'` to `newStr`, set `map['b' - 'a'] = true`
- Call: `removeDuplicatesRecursive("aaabbccdd", 4, new StringBuilder("ab"), map)`

## Fifth Call:

- `idx = 4`, `currChar = 'b'`, `map['b' - 'a'] = true`
- Skip `'b'`, call: `removeDuplicatesRecursive("aaabbccdd", 5, new StringBuilder("ab"), map)`

## Sixth Call:

- `idx = 5`, `currChar = 'c'`, `map['c' - 'a'] = false`
- Append `'c'` to `newStr`, set `map['c' - 'a'] = true`
- Call: `removeDuplicatesRecursive("aaabbccdd", 6, new StringBuilder("abc"), map)`

## Seventh Call:

- `idx = 6`, `currChar = 'c'`, `map['c' - 'a'] = true`
- Skip `'c'`, call: `removeDuplicatesRecursive("aaabbccdd", 7, new StringBuilder("abc"), map)`

## Eighth Call:

- `idx = 7`, `currChar = 'd'`, `map['d' - 'a'] = false`
- Append `'d'` to `newStr`, set `map['d' - 'a'] = true`
- Call: `removeDuplicatesRecursive("aaabbccdd", 8, new StringBuilder("abcd"), map)`

## Ninth Call:

- `idx = 8`, `currChar = 'd'`, `map['d' - 'a'] = true`
- Skip `'d'`, call: `removeDuplicatesRecursive("aaabbccdd", 9, new StringBuilder("abcd"), map)`

## Tenth Call:

- `idx = 9`, `idx == str.length()`
- Print `newStr`: `abcd`
- Return

## Call Stack at Each Step:

1. `removeDuplicatesRecursive("aaabbccdd", 0, new StringBuilder(""), map)`
2. `removeDuplicatesRecursive("aaabbccdd", 1, new StringBuilder("a"), map)`
3. `removeDuplicatesRecursive("aaabbccdd", 2, new StringBuilder("a"), map)`
4. `removeDuplicatesRecursive("aaabbccdd", 3, new StringBuilder("a"), map)`
5. `removeDuplicatesRecursive("aaabbccdd", 4, new StringBuilder("ab"), map)`
6. `removeDuplicatesRecursive("aaabbccdd", 5, new StringBuilder("ab"), map)`
7. `removeDuplicatesRecursive("aaabbccdd", 6, new StringBuilder("abc"), map)`
8. `removeDuplicatesRecursive("aaabbccdd", 7, new StringBuilder("abc"), map)`
9. `removeDuplicatesRecursive("aaabbccdd", 8, new StringBuilder("abcd"), map)`
10. `removeDuplicatesRecursive("aaabbccdd", 9, new StringBuilder("abcd"), map)`

## Final Output:

`abcd`

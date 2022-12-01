# Demonstration of getEnclosingClass being stripped from non-obfuscated classes

## Steps to reproduce
1. Run `./build_test_unobfuscated.sh`
   - This should correctly identify that `TestEnum.ONE.getClass().getEnclosingClass()` is `TestEnum.class`
2. Run `./build_test_obfuscated.sh`
   - This will return null for `TestEnum.ONE.getClass().getEnclosingClass()`

## Structure
- `obfuscated-module`: This module publishes an obfuscated jar when built with `-Pobfuscated` and a non-obfuscated jar otherwise.
- `test-module`: This module contains the test that demonstrates the issue. The test will pass when `obfuscated-module` is build without `-Pobfuscated` and fail when built with it.

## Useful links
- The enum being obfuscated: https://github.com/nicktindall/GetEnclosingClassBugRepro/blob/main/obfuscated-module/src/main/java/org/example/TestEnum.java
- The proguard config: https://github.com/nicktindall/GetEnclosingClassBugRepro/blob/main/obfuscated-module/pom.xml#L25


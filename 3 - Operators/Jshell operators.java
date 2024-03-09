D:\Final Interview\Core java\Coding practice\3 - Operators>jshell
|  Welcome to JShell -- Version 17.0.9
|  For an introduction type: /help intro

jshell> int a=5
a ==> 5

jshell> int result = +a
result ==> 5

jshell> result
result ==> 5

jshell> int result = a+
   ...>
   ...>

jshell>

jshell> int result = ++a
result ==> 6

jshell> int result = a++
result ==> 6

jshell> a
a ==> 7

jshell> int a=5
a ==> 5

jshell> int b=+a
b ==> 5

jshell> int b=++a
b ==> 6

jshell> a
a ==> 6

jshell> int b=a++
b ==> 6

jshell> a
a ==> 7

jshell> int b=--a
b ==> 6

jshell> a
a ==> 6

jshell> boolean b
b ==> false

jshell> !b
$16 ==> true

jshell>

jshell> int a=5
a ==> 5

jshell> a++5
|  Error:
|  ';' expected
|  a++5
|     ^

jshell> a++5
|  Error:
|  ';' expected
|  a++5
|     ^

jshell> a+=5
$18 ==> 10

jshell> a=+5
a ==> 5

jshell> a
a ==> 5

jshell> a+=5
$21 ==> 10

jshell> a
a ==> 10

jshell> a-=5
$23 ==> 5

jshell> a/=5
$24 ==> 1

jshell> a
a ==> 1

jshell> a%=5
$26 ==> 1

jshell> a
a ==> 1

jshell>

jshell> int a=10
a ==> 10

jshell> int b=20
b ==> 20

jshell> int c=30
c ==> 30

jshell> a==b
$31 ==> false

jshell> c=10
c ==> 10

jshell> a==c
$33 ==> true

jshell> a!=b
$34 ==> true

jshell> a!=c
$35 ==> false

jshell> a<b
$36 ==> true

jshell> a<c
$37 ==> false

jshell> a>c
$38 ==> false

jshell> a>b
$39 ==> false

jshell>

jshell> a>=b
$40 ==> false

jshell> a>=c
$41 ==> true

jshell> a<=b
$42 ==> true

jshell> a<=c
$43 ==> true

jshell> a<=c &&a>=b
$44 ==> false

jshell> a<=c || a>=b
$45 ==> true

jshell> a<=c ! a>=b
|  Error:
|  ';' expected
|  a<=c ! a>=b
|      ^
|  Error:
|  not a statement
|  a<=c ! a>=b
|         ^--^
|  Error:
|  unreachable statement
|  a<=c ! a>=b
|         ^--^

jshell> !a<=c || a>=b
|  Error:
|  bad operand type int for unary operator '!'
|  !a<=c || a>=b
|  ^^

jshell> a<=c || !(a>=b)
$46 ==> true

jshell>

jshell> a==b
$47 ==> false

jshell> a==b?"Hello":"Hi"
$48 ==> "Hi"

jshell> a==c?"Hello":"Hi"
$49 ==> "Hello"

jshell>

jshell> a instance Object
|  Error:
|  ';' expected
|  a instance Object;
|            ^

jshell> Interger a
|  replaced variable a, however, it cannot be referenced until class Interger is declared

jshell> a instance Object
|  Error:
|  ';' expected
|  a instance Object;
|            ^

jshell> a instance Object;
|  Error:
|  ';' expected
|  a instance Object;
|            ^

jshell>
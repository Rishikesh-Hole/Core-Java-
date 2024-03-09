D:\Final Interview\Core java\Coding practice\3 - Operators>jshell
|  Welcome to JShell -- Version 17.0.9
|  For an introduction type: /help intro

jshell> long L = 10;
L ==> 10

jshell> int i=L;
|  Error:
|  incompatible types: possible lossy conversion from long to int
|  int i=L;
|        ^

jshell> int i = (int)L;
i ==> 10

jshell>

jshell> int a=10;
a ==> 10

jshell> float f=a;
f ==> 10.0

jshell> int i=254;
i ==> 254

jshell> byte b1 = (byte)i;
b1 ==> -2

jshell> int a=10;
a ==> 10

jshell> float f=a;
f ==> 10.0

jshell> boolean b =a;
|  Error:
|  incompatible types: int cannot be converted to boolean
|  boolean b =a;
|             ^

jshell> int c=b;
|  Error:
|  cannot find symbol
|    symbol:   variable b
|  int c=b;
|        ^

jshell>

jshell> boolean b = true;
b ==> true

jshell>

jshell> int a=b;
|  Error:
|  incompatible types: boolean cannot be converted to int
|  int a=b;
|        ^

jshell>

jshell> int  a= (int)b;
|  Error:
|  incompatible types: boolean cannot be converted to int
|  int  a= (int)b;
|               ^

jshell> char c = b;
|  Error:
|  incompatible types: boolean cannot be converted to char
|  char c = b;
|           ^

jshell> char c = (char)b;
|  Error:
|  incompatible types: boolean cannot be converted to char
|  char c = (char)b;
|                 ^

jshell>

jshell> float f1 =10;
f1 ==> 10.0

jshell> double d1=f1;
d1 ==> 10.0

jshell>

jshell> int i = f1;
|  Error:
|  incompatible types: possible lossy conversion from float to int
|  int i = f1;
|          ^^

jshell> int i=d1
|  Error:
|  incompatible types: possible lossy conversion from double to int
|  int i=d1;
|        ^^

jshell>

jshell>

jshell>

jshell> int i=10
i ==> 10

jshell> byte b1 =i
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b1 =i;
|           ^

jshell> byte b2 = (byte)i
b2 ==> 10

jshell>

jshell> byte b3 = (int)i;
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b3 = (int)i;
|            ^----^

jshell> byte b4 = (boolean)i;
|  Error:
|  incompatible types: int cannot be converted to boolean
|  byte b4 = (boolean)i;
|                     ^

jshell> boolean b
b ==> false

jshell> int i = b
|  Error:
|  incompatible types: boolean cannot be converted to int
|  int i = b;
|          ^

jshell> int i = int(b)
|  Error:
|  '.class' expected
|  int i = int(b);
|             ^

jshell> int i = (int)b
|  Error:
|  incompatible types: boolean cannot be converted to int
|  int i = (int)b;
|               ^

jshell> char c = (char)b
|  Error:
|  incompatible types: boolean cannot be converted to char
|  char c = (char)b;
|                 ^

jshell> byte b = (byte)b
b ==> 0

jshell> boolean B
B ==> false

jshell> byte b = (byte)B
|  Error:
|  incompatible types: boolean cannot be converted to byte
|  byte b = (byte)B;
|                 ^

jshell>

jshell> short s = (short)B
|  Error:
|  incompatible types: boolean cannot be converted to short
|  short s = (short)B;
|                   ^

jshell> long l = (long)B
|  Error:
|  incompatible types: boolean cannot be converted to long
|  long l = (long)B;
|                 ^

jshell> float f = (float)B
|  Error:
|  incompatible types: boolean cannot be converted to float
|  float f = (float)B;
|                   ^

jshell>

jshell> double d = (double)B
|  Error:
|  incompatible types: boolean cannot be converted to double
|  double d = (double)B;
|                     ^

jshell>

jshell>

jshell> int a=10
a ==> 10

jshell> float f = a;
f ==> 10.0

jshell> boolean bo = a;
|  Error:
|  incompatible types: int cannot be converted to boolean
|  boolean bo = a;
|               ^

jshell> boolean bo = boolean(a);
|  Error:
|  '.class' expected
|  boolean bo = boolean(a);
|                      ^

jshell>

jshell> boolean bo = (boolean)a;
|  Error:
|  incompatible types: int cannot be converted to boolean
|  boolean bo = (boolean)a;
|                        ^

jshell>

jshell>

jshell>

jshell>

jshell> int a=10
a ==> 10

jshell> byte b=a;
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b=a;
|         ^

jshell> byte b =(byte)a;
b ==> 10

jshell> byte b = (short)a;
|  Error:
|  incompatible types: possible lossy conversion from short to byte
|  byte b = (short)a;
|           ^------^

jshell> short s = (byte) a
s ==> 10

jshell>

jshell> byte b = (short)(byte)a;
|  Error:
|  incompatible types: possible lossy conversion from short to byte
|  byte b = (short)(byte)a;
|           ^------------^

jshell>

jshell> byte b = (byte)(short)a;
b ==> 10

jshell>

jshell> int a=254
a ==> 254

jshell> byte b1 = (byte)a;
b1 ==> -2

jshell> short s1 = (short)a;
s1 ==> 254

jshell> short s2 = (short)(byte)a
s2 ==> -2

jshell>

jshell>

jshell> long l=10
l ==> 10

jshell> int i =l
|  Error:
|  incompatible types: possible lossy conversion from long to int
|  int i =l;
|         ^

jshell> float f=l;
f ==> 10.0

jshell>

jshell> float f1=10
f1 ==> 10.0

jshell> long l1=f1;
|  Error:
|  incompatible types: possible lossy conversion from float to long
|  long l1=f1;
|          ^^

jshell> long l1=(long)f1;
l1 ==> 10

jshell>

jshell> char c1
c1 ==> '\000'

jshell> char c1='a'
c1 ==> 'a'

jshell> char c2 =97
c2 ==> 'a'

jshell> int i =98;
i ==> 98

jshell> int i2 ='b'
i2 ==> 98

jshell> char c1=255;
c1 ==> 'ÿ'

jshell> char c2 =65000
c2 ==> '?'

jshell> char c3 = 65535
c3 ==> '?'

jshell> char c4 = 66000
|  Error:
|  incompatible types: possible lossy conversion from int to char
|  char c4 = 66000;
|            ^---^

jshell> int i1=98
i1 ==> 98

jshell> char c5=i1
|  Error:
|  incompatible types: possible lossy conversion from int to char
|  char c5=i1;
|          ^^

jshell> char c5=98
c5 ==> 'b'

jshell> char c5=(char)i1
c5 ==> 'b'

jshell> byte b =97
b ==> 97

jshell> char c = b
|  Error:
|  incompatible types: possible lossy conversion from byte to char
|  char c = b;
|           ^

jshell> char c = char(b)
|  Error:
|  '.class' expected
|  char c = char(b);
|               ^

jshell> char c = (char)b
c ==> 'a'

jshell>

jshell> char c = -97
|  Error:
|  incompatible types: possible lossy conversion from int to char
|  char c = -97;
|           ^-^

jshell> char c ='10'
|  Error:
|  unclosed character literal
|  char c ='10'
|          ^

jshell> int i ='a'
i ==> 97

jshell> int i=-97
i ==> -97

jshell> char c = (char)i
c ==> '?'

jshell> float f='a'
f ==> 97.0

jshell> byte b1=10
b1 ==> 10

jshell> int i =10
i ==> 10

jshell> byte b2=i
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b2=i;
|          ^

jshell> byte b1=10
b1 ==> 10

jshell> byte b2=20
b2 ==> 20

jshell> byte b3=b1+b2
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b3=b1+b2;
|          ^---^

jshell> byte b3=byte(b1+b2)
|  Error:
|  '.class' expected
|  byte b3=byte(b1+b2);
|              ^

jshell>

jshell> byte b3=(byte)b1+b2
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b3=(byte)b1+b2;
|          ^---------^

jshell> byte b3=(byte)(b1+b2)
b3 ==> 30

jshell> short s1=10
s1 ==> 10

jshell> short s2=20
s2 ==> 20

jshell> short s3=s1+s2
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short s3=s1+s2;
|           ^---^

jshell>

jshell> short s3 = (short)(s1+s2)
s3 ==> 30

jshell>

jshell> char c1='a'
c1 ==> 'a'

jshell> char c2='b'
c2 ==> 'b'

jshell> char c3 = c1+c2
|  Error:
|  incompatible types: possible lossy conversion from int to char
|  char c3 = c1+c2;
|            ^---^

jshell> char c3 = (char)(c1+c2)
c3 ==> '?'

jshell> (c1+c2)
$59 ==> 195

jshell>

jshell> byte b3 =10+20
b3 ==> 30

jshell> byte b3 =126+1
b3 ==> 127

jshell> byte b3 =126+2
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b3 =126+2;
|           ^---^

jshell>

jshell> byte b3 =10L+20
|  Error:
|  incompatible types: possible lossy conversion from long to byte
|  byte b3 =10L+20;
|           ^----^

jshell> byte b3 =(byte)10L+20
b3 ==> 30

jshell>

jshell> byte b3 =(int)10L+20
b3 ==> 30

jshell> byte b4 =(int)10L+20
b4 ==> 30

jshell> char c1 ='a'+'b'
c1 ==> '?'

jshell> char c2 = c1+'c'
|  Error:
|  incompatible types: possible lossy conversion from int to char
|  char c2 = c1+'c';
|            ^----^

jshell> char c2 = (char)(c1+'c')
c2 ==> '?'

jshell> int i =1+2
i ==> 3

jshell> String s1 = "Hello" + " Rishikesh"
s1 ==> "Hello Rishikesh"

jshell>

jshell> String s1 = "Hello" + 10
s1 ==> "Hello10"

jshell>

jshell> String s1 = 10 + 10
|  Error:
|  incompatible types: int cannot be converted to java.lang.String
|  String s1 = 10 + 10;
|              ^-----^

jshell> int a= 10+"10"
|  Error:
|  incompatible types: java.lang.String cannot be converted to int
|  int a= 10+"10";
|         ^-----^

jshell> 10/5
$70 ==> 2

jshell> 22/7
$71 ==> 3

jshell> 22%7
$72 ==> 1

jshell> 88.8/11
$73 ==> 8.072727272727272

jshell>

jshell> 88.8%11
$74 ==> 0.7999999999999972

jshell> 10.0/1
$75 ==> 10.0

jshell> 10.0/0
$76 ==> Infinity

jshell> 10/0
|  Exception java.lang.ArithmeticException: / by zero
|        at (#77:1)

jshell>

jshell> int a=10
a ==> 10

jshell> int b=20
b ==> 20

jshell> a==b
$80 ==> false

jshell> a!=b
$81 ==> true

jshell> 10==10.0
$82 ==> true

jshell> a=b
a ==> 20

jshell> a=b==b
|  Error:
|  incompatible types: boolean cannot be converted to int
|  a=b==b
|    ^--^

jshell> (a+b)==b
$84 ==> false

jshell>

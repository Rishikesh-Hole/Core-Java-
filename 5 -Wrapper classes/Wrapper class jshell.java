D:\Final Interview\Core java\Coding practice\5 -Wrapper classes>jshell
|  Welcome to JShell -- Version 21.0.1
|  For an introduction type: /help intro

jshell>

jshell> "123".intValue()
|  Error:
|  cannot find symbol
|    symbol:   method intValue()
|  "123".intValue()
|  ^------------^

jshell>

jshell> Integer io1 = Integer.valueOf("123");
io1 ==> 123

jshell> io1
io1 ==> 123

jshell> io1.intValue()
$3 ==> 123

jshell> byte b = io1.intValue()
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b = io1.intValue();
|           ^------------^

jshell> byte b = (byte)io1.intValue()
b ==> 123

jshell> byte b = io1.byteValue()
b ==> 123

jshell> short s = io1.shortValue()
s ==> 123

jshell> long l = io1.intVlaue()
|  Error:
|  cannot find symbol
|    symbol:   method intVlaue()
|  long l = io1.intVlaue();
|           ^----------^

jshell> long l = io1.intValue()
l ==> 123

jshell>

jshell> long l = io1.longValue()
l ==> 123

jshell> Byte b1 = Byte.valueOf(25)
|  Error:
|  no suitable method found for valueOf(int)
|      method java.lang.Byte.valueOf(byte) is not applicable
|        (argument mismatch; possible lossy conversion from int to byte)
|      method java.lang.Byte.valueOf(java.lang.String) is not applicable
|        (argument mismatch; int cannot be converted to java.lang.String)
|  Byte b1 = Byte.valueOf(25);
|            ^----------^

jshell> Byte b1 = Byte.valueOf("25")
b1 ==> 25

jshell> short s1 = Short.valueOf(25)
|  Error:
|  no suitable method found for valueOf(int)
|      method java.lang.Short.valueOf(java.lang.String) is not applicable
|        (argument mismatch; int cannot be converted to java.lang.String)
|      method java.lang.Short.valueOf(short) is not applicable
|        (argument mismatch; possible lossy conversion from int to short)
|  short s1 = Short.valueOf(25);
|             ^-----------^

jshell> short s1 = Short.valueOf("25")
s1 ==> 25

jshell> Long l1 = Long.valueOf(25)
l1 ==> 25

jshell> Long l1 = Long.valueOf("25")
l1 ==> 25

jshell> Flaot f1 = FLoat.valueOf(25)
|  Error:
|  cannot find symbol
|    symbol:   class Flaot
|  Flaot f1 = FLoat.valueOf(25);
|  ^---^
|  Error:
|  cannot find symbol
|    symbol:   variable FLoat
|  Flaot f1 = FLoat.valueOf(25);
|             ^---^

jshell> Flaot f1 = Float.valueOf(25)
|  Error:
|  cannot find symbol
|    symbol:   class Flaot
|  Flaot f1 = Float.valueOf(25);
|  ^---^

jshell> Float f1 = Float.valueOf(25)
f1 ==> 25.0

jshell> Float f1 = Float.valueOf("25")
f1 ==> 25.0

jshell> Double D1 = Double.valueOf(25)
D1 ==> 25.0

jshell> Double D1 = Double.valueOf("25")
D1 ==> 25.0

jshell> Character C1 = Character.valueOf(2)
|  Error:
|  incompatible types: possible lossy conversion from int to char
|  Character C1 = Character.valueOf(2);
|                                   ^

jshell> Character C1 = Character.valueOf('c')
C1 ==> 'c'

jshell> Character C1 = Character.valueOf(char(2))
|  Error:
|  '.class' expected
|  Character C1 = Character.valueOf(char(2));
|                                       ^

jshell> Character C1 = Character.valueOf((char)2)
C1 ==> '\002'

jshell> Character C1 = Character.valueOf(("c
   ...> )
|  Error:
|  unclosed string literal
|  Character C1 = Character.valueOf(("c
|                                    ^

jshell> Character C1 = Character.valueOf(("c
   ...> )

jshell> Character C1 = Character.valueOf("C")
|  Error:
|  incompatible types: java.lang.String cannot be converted to char
|  Character C1 = Character.valueOf("C");
|                                   ^-^

jshell> Boolean B1 = Boolean.valueOf(1)
|  Error:
|  no suitable method found for valueOf(int)
|      method java.lang.Boolean.valueOf(boolean) is not applicable
|        (argument mismatch; int cannot be converted to boolean)
|      method java.lang.Boolean.valueOf(java.lang.String) is not applicable
|        (argument mismatch; int cannot be converted to java.lang.String)
|  Boolean B1 = Boolean.valueOf(1);
|               ^-------------^

jshell> Boolean B1 = Boolean.valueOf(true)
B1 ==> true

jshell> Boolean B1 = Boolean.valueOf("true")
B1 ==> true

jshell> int a =10
a ==> 10

jshell> a.byteValue()
|  Error:
|  int cannot be dereferenced
|  a.byteValue()
|  ^---------^

jshell> Integer a =10
a ==> 10

jshell> a.byteValue()
$23 ==> 10

jshell> a.toString()
$24 ==> "10"

jshell> int b
b ==> 0

jshell> b.toString()
|  Error:
|  int cannot be dereferenced
|  b.toString()
|  ^--------^

jshell> a.toString(20)
$26 ==> "20"

jshell> a.toString(20.123)
|  Error:
|  incompatible types: possible lossy conversion from double to int
|  a.toString(20.123)
|             ^----^

jshell> a.toString("20")
|  Error:
|  incompatible types: java.lang.String cannot be converted to int
|  a.toString("20")
|             ^--^

jshell> a.toString('c')
$27 ==> "99"

jshell> a
a ==> 10

jshell> int a =10
a ==> 10

jshell> a.parseInt("12")
|  Error:
|  int cannot be dereferenced
|  a.parseInt("12")
|  ^--------^

jshell> Integer a = parseInt("12")
|  Error:
|  cannot find symbol
|    symbol:   method parseInt(java.lang.String)
|  Integer a = parseInt("12");
|              ^------^

jshell> Integer a = Integer.parseInt("12")
a ==> 12

jshell> Integer a = Integer.parseInt("12")
a ==> 12

jshell> Float f1 = Float.parseInt("12")
|  Error:
|  cannot find symbol
|    symbol:   method parseInt(java.lang.String)
|  Float f1 = Float.parseInt("12");
|             ^------------^

jshell> Float f1 = Float.parseFloat("12")
f1 ==> 12.0

jshell>

jshell> Byte b1 = Byte.parseByte("12")
b1 ==> 12

jshell>

jshell> Byte b1 = Byte.parseByte(12)
|  Error:
|  incompatible types: int cannot be converted to java.lang.String
|  Byte b1 = Byte.parseByte(12);
|                           ^^

jshell> Byte b1 = b1.parseByte("12")
b1 ==> 12

jshell>

jshell>

jshell> Byte b1 =20
b1 ==> 20

jshell> Short s = 20
s ==> 20

jshell> Integer i =20
i ==> 20

jshell> Long L =20
|  Error:
|  incompatible types: int cannot be converted to java.lang.Long
|  Long L =20;
|          ^^

jshell> Long L =20L
L ==> 20

jshell> Float f = 20.0
|  Error:
|  incompatible types: double cannot be converted to java.lang.Float
|  Float f = 20.0;
|            ^--^

jshell> Float f = 20.0f
f ==> 20.0

jshell> Double D = 20.0
D ==> 20.0

jshell> Integer i= 'a'
|  Error:
|  incompatible types: char cannot be converted to java.lang.Integer
|  Integer i= 'a';
|             ^-^

jshell> Integer i= 10
i ==> 10

jshell> int a =i
a ==> 10

jshell>

jshell> Byte b =128
|  Error:
|  incompatible types: int cannot be converted to java.lang.Byte
|  Byte b =128;
|          ^-^

jshell> Character c = 97
c ==> 'a'

jshell> Character c = (Character)97
|  Error:
|  incompatible types: int cannot be converted to java.lang.Character
|  Character c = (Character)97;
|                           ^^

jshell> Character c = (char)97
c ==> 'a'

jshell> Double d =20
|  Error:
|  incompatible types: int cannot be converted to java.lang.Double
|  Double d =20;
|            ^^

jshell> Double d =20.0
d ==> 20.0

jshell>

jshell> Integer i = d
|  Error:
|  incompatible types: java.lang.Double cannot be converted to java.lang.Integer
|  Integer i = d;
|              ^

jshell> int c = d
|  Error:
|  incompatible types: java.lang.Double cannot be converted to int
|  int c = d;
|          ^

jshell> double d =20
d ==> 20.0

jshell> long l = 20
l ==> 20

jshell> Long l = 20
|  Error:
|  incompatible types: int cannot be converted to java.lang.Long
|  Long l = 20;
|           ^^

jshell> Byte b=20
b ==> 20

jshell> Short s=20
s ==> 20

jshell> Long l = (Long)20
|  Error:
|  incompatible types: int cannot be converted to java.lang.Long
|  Long l = (Long)20;
|                 ^^

jshell> Long l = l.valueOf(20)
l ==> 20

jshell> Long l = l.intValue(20)
|  Error:
|  method intValue in class java.lang.Long cannot be applied to given types;
|    required: no arguments
|    found:    int
|    reason: actual and formal argument lists differ in length
|  Long l = l.intValue(20);
|           ^--------^

jshell> Long l = l.longValue(20)
|  Error:
|  method longValue in class java.lang.Long cannot be applied to given types;
|    required: no arguments
|    found:    int
|    reason: actual and formal argument lists differ in length
|  Long l = l.longValue(20);
|           ^---------^

jshell> Long l = l.longValue()
l ==> 20

jshell> l
l ==> 20

jshell> Integer i = 20L
|  Error:
|  incompatible types: long cannot be converted to java.lang.Integer
|  Integer i = 20L;
|              ^-^

jshell>

jshell> Float f =20L
|  Error:
|  incompatible types: long cannot be converted to java.lang.Float
|  Float f =20L;
|           ^-^

jshell> Double D = 20L
|  Error:
|  incompatible types: long cannot be converted to java.lang.Double
|  Double D = 20L;
|             ^-^

jshell> Long L =20L
L ==> 20

jshell> Float f =20
|  Error:
|  incompatible types: int cannot be converted to java.lang.Float
|  Float f =20;
|           ^^

jshell> Float f =20f
f ==> 20.0

jshell> Float f =20D
|  Error:
|  incompatible types: double cannot be converted to java.lang.Float
|  Float f =20D;
|           ^-^

jshell> Float f =20.0
|  Error:
|  incompatible types: double cannot be converted to java.lang.Float
|  Float f =20.0;
|           ^--^

jshell> Float f =20f
f ==> 20.0

jshell> Double d =1.2
d ==> 1.2

jshell> Double d =1
|  Error:
|  incompatible types: int cannot be converted to java.lang.Double
|  Double d =1;
|            ^

jshell> Double d =1D
d ==> 1.0

jshell> Boolean b=true
b ==> true

jshell> Boolean b="true"
|  Error:
|  incompatible types: java.lang.String cannot be converted to java.lang.Boolean
|  Boolean b="true";
|            ^----^

jshell> Boolean b=1
|  Error:
|  incompatible types: int cannot be converted to java.lang.Boolean
|  Boolean b=1;
|            ^

jshell> Character c =10
c ==> '\n'

jshell> Character c =11
c ==> '\013'

jshell> Character c =97
c ==> 'a'

jshell> Character c =66000
|  Error:
|  incompatible types: int cannot be converted to java.lang.Character
|  Character c =66000;
|               ^---^

jshell> Character c =65000
c ==> '?'

jshell> Character c ='c'
c ==> 'c'

jshell> Character c ="c"
|  Error:
|  incompatible types: java.lang.String cannot be converted to java.lang.Character
|  Character c ="c";
|               ^-^

jshell>

jshell>

jshell>

jshell>

jshell> Integer i1=10
i1 ==> 10

jshell> Integer i2 =20
i2 ==> 20

jshell> Integer result=i1+i2
result ==> 30

jshell>

jshell>

jshell> Integer i1=20
i1 ==> 20

jshell> Integer i2=20
i2 ==> 20

jshell> i1=i2
i1 ==> 20

jshell> Integer i1=20
i1 ==> 20

jshell> Integer i2=20
i2 ==> 20

jshell> i1==i2
$72 ==> true

jshell>

jshell> Integer i3=200
i3 ==> 200

jshell> Integer i4=200
i4 ==> 200

jshell> i3==i4
$75 ==> false

jshell>
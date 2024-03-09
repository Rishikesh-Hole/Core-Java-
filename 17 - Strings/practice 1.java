D:\Final Interview\Core java\Coding practice\17 - Strings>jshell
|  Welcome to JShell -- Version 21.0.1
|  For an introduction type: /help intro

jshell> String a ="AABC"
a ==> "AABC"

jshell> String b = new String(a)
b ==> "AABC"

jshell> byte[] b ={1,2,3,4}
b ==> byte[4] { 1, 2, 3, 4 }

jshell> String s = new String(b)
s ==> "\001\002\003\004"

jshell> s
s ==> "\001\002\003\004"

jshell> Strin s1=b
|  Error:
|  cannot find symbol
|    symbol:   class Strin
|  Strin s1=b;
|  ^---^

jshell> b
b ==> byte[4] { 1, 2, 3, 4 }

jshell> Strin s1=(String)b
|  Error:
|  cannot find symbol
|    symbol:   class Strin
|  Strin s1=(String)b;
|  ^---^
|  Error:
|  incompatible types: byte[] cannot be converted to java.lang.String
|  Strin s1=(String)b;
|                   ^

jshell> char[] c = {'a','b','c','d'}
c ==> char[4] { 'a', 'b', 'c', 'd' }

jshell> String s1=c
|  Error:
|  incompatible types: char[] cannot be converted to java.lang.String
|  String s1=c;
|            ^

jshell> String s1=(String)c
|  Error:
|  incompatible types: char[] cannot be converted to java.lang.String
|  String s1=(String)c;
|                    ^

jshell> String s1=new String(c)
s1 ==> "abcd"

jshell> String s1=new String(11)
|  Error:
|  no suitable constructor found for String(int)
|      constructor java.lang.String.String(java.lang.String) is not applicable
|        (argument mismatch; int cannot be converted to java.lang.String)
|      constructor java.lang.String.String(char[]) is not applicable
|        (argument mismatch; int cannot be converted to char[])
|      constructor java.lang.String.String(byte[]) is not applicable
|        (argument mismatch; int cannot be converted to byte[])
|      constructor java.lang.String.String(java.lang.StringBuffer) is not applicable
|        (argument mismatch; int cannot be converted to java.lang.StringBuffer)
|      constructor java.lang.String.String(java.lang.StringBuilder) is not applicable
|        (argument mismatch; int cannot be converted to java.lang.StringBuilder)
|  String s1=new String(11);
|            ^------------^

jshell> String s1=new String(11b)
|  Error:
|  ')' or ',' expected
|  String s1=new String(11b);
|                         ^

jshell> byte b=11b
|  Error:
|  ';' expected
|  byte b=11b;
|           ^

jshell> byte b=11b;
|  Error:
|  ';' expected
|  byte b=11b;
|           ^

jshell> byte b=11;
b ==> 11

jshell> byte b=1134;
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte b=1134;
|         ^--^

jshell> byte b=113L;
|  Error:
|  incompatible types: possible lossy conversion from long to byte
|  byte b=113L;
|         ^--^

jshell> String s1=new String((byte)11)
|  Error:
|  no suitable constructor found for String(byte)
|      constructor java.lang.String.String(java.lang.String) is not applicable
|        (argument mismatch; byte cannot be converted to java.lang.String)
|      constructor java.lang.String.String(char[]) is not applicable
|        (argument mismatch; byte cannot be converted to char[])
|      constructor java.lang.String.String(byte[]) is not applicable
|        (argument mismatch; byte cannot be converted to byte[])
|      constructor java.lang.String.String(java.lang.StringBuffer) is not applicable
|        (argument mismatch; byte cannot be converted to java.lang.StringBuffer)
|      constructor java.lang.String.String(java.lang.StringBuilder) is not applicable
|        (argument mismatch; byte cannot be converted to java.lang.StringBuilder)
|  String s1=new String((byte)11);
|            ^------------------^

jshell> String s1=new String((byte){11,22})
|  Error:
|  illegal start of expression
|  String s1=new String((byte){11,22});
|                             ^
|  Error:
|  illegal start of type
|  String s1=new String((byte){11,22});
|                              ^
|  Error:
|  ';' expected
|  String s1=new String((byte){11,22});
|                                    ^

jshell> String s1=new String(new byte[]{11,22})
s1 ==> "\013\026"

jshell> String s1=new String(new char[]{'R','I','S','H'})
s1 ==> "RISH"

jshell>

jshell> Strins1.hashCode()
|  Error:
|  cannot find symbol
|    symbol:   variable Strins1
|  Strins1.hashCode()
|  ^-----^

jshell> Strins1.hashcode()
|  Error:
|  cannot find symbol
|    symbol:   variable Strins1
|  Strins1.hashcode()
|  ^-----^

jshell> String s1="a"
s1 ==> "a"

jshell> String s2="a"
s2 ==> "a"

jshell> String s3="a"
s3 ==> "a"

jshell> String s4="b"
s4 ==> "b"

jshell> String s5=new String("a")
s5 ==> "a"

jshell> String s6=new String("a")
s6 ==> "a"

jshell> String s7 = "ab"
s7 ==> "ab"

jshell> String s8 = s1+"b"
s8 ==> "ab"

jshell> String s9 = "a"+"b"
s9 ==> "ab"

jshell> s1==s2
$21 ==> true

jshell> s5==s6
$22 ==> false

jshell> s7==s8
$23 ==> false

jshell> s7==s9
$24 ==> true

jshell> s7
s7 ==> "ab"

jshell> s8
s8 ==> "ab"

jshell> s10 = s1.concate("b)
|  Error:
|  unclosed string literal
|  s10 = s1.concate("b)
|                   ^

jshell> s10 = s1.concat("b)
|  Error:
|  unclosed string literal
|  s10 = s1.concat("b)
|                  ^

jshell> s10 = s1.concat("b")
|  Error:
|  cannot find symbol
|    symbol:   variable s10
|  s10 = s1.concat("b")
|  ^-^

jshell> String s10 = s1.concat("b")
s10 ==> "ab"

jshell> s7==s10
$28 ==> false

jshell> s8==s10
$29 ==> false

jshell> String s="Java Programming language"
s ==> "Java Programming language"

jshell> s.isEmpty()
$31 ==> false

jshell> s.length
|  Error:
|  cannot find symbol
|    symbol:   variable length
|  s.length
|  ^------^

jshell> s.length()
$32 ==> 25

jshell> Strin s1 = new String("abc");
|  Error:
|  cannot find symbol
|    symbol:   class Strin
|  Strin s1 = new String("abc");
|  ^---^

jshell> String s1 = new String("abc");
s1 ==> "abc"

jshell> String s2 = new String("abc");
s2 ==> "abc"

jshell> s1==s2
$35 ==> false

jshell> s1.equals(s2)
$36 ==> true

jshell> String s3 = new String("ABC");
s3 ==> "ABC"

jshell> s1.equalsIgnoreCase(s3)
$38 ==> true

jshell> s1.compareTo(s3)
$39 ==> 32

jshell> s1.compareToIgnoreCase(s3)
$40 ==> 0

jshell> s.startsWith("Java")
$41 ==> true

jshell> s.endsWith("age")
$42 ==> true

jshell> s.endsWith("Har")
$43 ==> false

jshell> s.charAt(20)
$44 ==> 'g'

jshell> s.indexOf('a')
$45 ==> 1

jshell> s.indexOf("age")
$46 ==> 22

jshell> s.lastIndexOf("age")
$47 ==> 22

jshell> s.lastIndexOf('a')
$48 ==> 22

jshell> s.lastIndexOf('a',3)
$49 ==> 3

jshell> s.lastIndexOf('a',5)
$50 ==> 3

jshell> s.lastIndexOf('a',22)
$51 ==> 22

jshell> s.lastIndexOf('a',18)
$52 ==> 18

jshell> s.indexOf("age",6)
$53 ==> 22

jshell> s.contains("age")
$54 ==> true

jshell> s.contains("agr")
$55 ==> false

jshell> s
s ==> "Java Programming language"

jshell> s.subString(5)
|  Error:
|  cannot find symbol
|    symbol:   method subString(int)
|  s.subString(5)
|  ^---------^

jshell> s.substring(5)
$57 ==> "Programming language"

jshell> s.substring(5,15)
$58 ==> "Programmin"

jshell> s.substring(-6)
|  Exception java.lang.StringIndexOutOfBoundsException: Range [-6, 25) out of bounds for length 25
|        at Preconditions$1.apply (Preconditions.java:55)
|        at Preconditions$1.apply (Preconditions.java:52)
|        at Preconditions$4.apply (Preconditions.java:213)
|        at Preconditions$4.apply (Preconditions.java:210)
|        at Preconditions.outOfBounds (Preconditions.java:98)
|        at Preconditions.outOfBoundsCheckFromToIndex (Preconditions.java:112)
|        at Preconditions.checkFromToIndex (Preconditions.java:349)
|        at String.checkBoundsBeginEnd (String.java:4861)
|        at String.substring (String.java:2830)
|        at String.substring (String.java:2803)
|        at (#59:1)

jshell> s.substring(5,225)
|  Exception java.lang.StringIndexOutOfBoundsException: Range [5, 225) out of bounds for length 25
|        at Preconditions$1.apply (Preconditions.java:55)
|        at Preconditions$1.apply (Preconditions.java:52)
|        at Preconditions$4.apply (Preconditions.java:213)
|        at Preconditions$4.apply (Preconditions.java:210)
|        at Preconditions.outOfBounds (Preconditions.java:98)
|        at Preconditions.outOfBoundsCheckFromToIndex (Preconditions.java:112)
|        at Preconditions.checkFromToIndex (Preconditions.java:349)
|        at String.checkBoundsBeginEnd (String.java:4861)
|        at String.substring (String.java:2830)
|        at (#60:1)

jshell> s.substring(5,25)
$61 ==> "Programming language"

jshell> s.substring(5,26)
|  Exception java.lang.StringIndexOutOfBoundsException: Range [5, 26) out of bounds for length 25
|        at Preconditions$1.apply (Preconditions.java:55)
|        at Preconditions$1.apply (Preconditions.java:52)
|        at Preconditions$4.apply (Preconditions.java:213)
|        at Preconditions$4.apply (Preconditions.java:210)
|        at Preconditions.outOfBounds (Preconditions.java:98)
|        at Preconditions.outOfBoundsCheckFromToIndex (Preconditions.java:112)
|        at Preconditions.checkFromToIndex (Preconditions.java:349)
|        at String.checkBoundsBeginEnd (String.java:4861)
|        at String.substring (String.java:2830)
|        at (#62:1)

jshell> s.substring(23,24)
$63 ==> "g"

jshell> s.substring(-1,5)
|  Exception java.lang.StringIndexOutOfBoundsException: Range [-1, 5) out of bounds for length 25
|        at Preconditions$1.apply (Preconditions.java:55)
|        at Preconditions$1.apply (Preconditions.java:52)
|        at Preconditions$4.apply (Preconditions.java:213)
|        at Preconditions$4.apply (Preconditions.java:210)
|        at Preconditions.outOfBounds (Preconditions.java:98)
|        at Preconditions.outOfBoundsCheckFromToIndex (Preconditions.java:112)
|        at Preconditions.checkFromToIndex (Preconditions.java:349)
|        at String.checkBoundsBeginEnd (String.java:4861)
|        at String.substring (String.java:2830)
|        at (#64:1)

jshell> s.substring(s.indexOf("age"))
$65 ==> "age"

jshell> s.substring(s.indexOf("ava"))
$66 ==> "ava Programming language"

jshell>

jshell> Strinf s1='a'
|  Error:
|  cannot find symbol
|    symbol:   class Strinf
|  Strinf s1='a';
|  ^----^

jshell> String s1='a'
|  Error:
|  incompatible types: char cannot be converted to java.lang.String
|  String s1='a';
|            ^-^

jshell> String s1=10
|  Error:
|  incompatible types: int cannot be converted to java.lang.String
|  String s1=10;
|            ^^

jshell> String s1="a"+10
s1 ==> "a10"

jshell>

jshell> String s1 = "a"
s1 ==> "a"

jshell> String s2=s1+"b"
s2 ==> "ab"

jshell> s1==s2
$70 ==> false

jshell> String s3="a"
s3 ==> "a"

jshell> String s4 = s3.concat("b")
s4 ==> "ab"

jshell> s3==s4
$73 ==> false

jshell> s4.concat(
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>
   ...>

jshell> s4.concat("c")
$74 ==> "abc"

jshell> String s4="ab"
s4 ==> "ab"

jshell> String s5="ab"
s5 ==> "ab"

jshell> s4==s5
$77 ==> true

jshell> s4.concat("")
$78 ==> "ab"

jshell> s4==s5
$79 ==> true

jshell> s6=s4.concat("")
s6 ==> "ab"

jshell> s4==s6
$81 ==> true

jshell>

jshell> String s6="a"
s6 ==> "a"

jshell> String s7 = s6+""
s7 ==> "a"

jshell> s6==s7
$84 ==> false

jshell> String S="RishiKesh"
S ==> "RishiKesh"

jshell> s.toUpper()
|  Error:
|  cannot find symbol
|    symbol:   method toUpper()
|  s.toUpper()
|  ^-------^

jshell> s.toUpperCase()
$86 ==> "JAVA PROGRAMMING LANGUAGE"

jshell> s.toLowerCase()
$87 ==> "java programming language"

jshell> S.toLowerCase()
$88 ==> "rishikesh"

jshell> s
s ==> "Java Programming language"

jshell> s.replace("a","A")
$90 ==> "JAvA ProgrAmming lAnguAge"

jshell> s
s ==> "Java Programming language"

jshell> S
S ==> "RishiKesh"

jshell> S.concat(" Hole")
$93 ==> "RishiKesh Hole"

jshell> S
S ==> "RishiKesh"

jshell> s.replace("Java","C++")
$95 ==> "C++ Programming language"

jshell> s.replace('a','A')
$96 ==> "JAvA ProgrAmming lAnguAge"

jshell> s.replace('a',"A")
|  Error:
|  no suitable method found for replace(char,java.lang.String)
|      method java.lang.String.replace(char,char) is not applicable
|        (argument mismatch; java.lang.String cannot be converted to char)
|      method java.lang.String.replace(java.lang.CharSequence,java.lang.CharSequence) is not applicable
|        (argument mismatch; char cannot be converted to java.lang.CharSequence)
|  s.replace('a',"A")
|  ^-------^

jshell> String k ="  Rishikesh   "
k ==> "  Rishikesh   "

jshell> k.trim()
$98 ==> "Rishikesh"

jshell> String name = "Rishikesh Digambar Hole"
name ==> "Rishikesh Digambar Hole"

jshell> String[] s = name.split(" ")
s ==> String[3] { "Rishikesh", "Digambar", "Hole" }

jshell> s
s ==> String[3] { "Rishikesh", "Digambar", "Hole" }

jshell> ^C
D:\Final Interview\Core java\Coding practice\17 - Strings>
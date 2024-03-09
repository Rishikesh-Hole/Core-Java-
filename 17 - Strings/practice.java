D:\Final Interview\Core java\Coding practice\17 - Strings>jshell
|  Welcome to JShell -- Version 21.0.1
|  For an introduction type: /help intro

jshell> StringBuffer s = new StringBuffer("Rishikesh");
s ==> Rishikesh

jshell> StringBuffer s1 = new StringBuffer(10);
s1 ==>

jshell> StringBuffer s1 = new StringBuffer(0);
s1 ==>

jshell> StringBuffer s1 = new StringBuffer(-1);
|  Exception java.lang.NegativeArraySizeException: -1
|        at AbstractStringBuilder.<init> (AbstractStringBuilder.java:101)
|        at StringBuffer.<init> (StringBuffer.java:146)
|        at (#4:1)

jshell> StringBuffer s2 = new StringBuffer();
s2 ==>

jshell> s1
s1 ==>

jshell> s1="Hole"
|  Error:
|  incompatible types: java.lang.String cannot be converted to java.lang.StringBuffer
|  s1="Hole"
|     ^----^

jshell> s1.capacity()
$7 ==> 0

jshell> s.capacity()
$8 ==> 25

jshell> StringBuffer s2 = new StringBuffer(null);
|  Exception java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
|        at AbstractStringBuilder.<init> (AbstractStringBuilder.java:118)
|        at StringBuffer.<init> (StringBuffer.java:158)
|        at (#9:1)

jshell> StringBuffer s1 = new StringBuffer();
s1 ==>

jshell> StringBuffer s2 = new StringBuffer(10);
s2 ==>

jshell> StringBuffer s3 = new StringBuffer("Rishikesh");
s3 ==> Rishikesh

jshell> String s = "Charvi"
s ==> "Charvi"

jshell> StringBuffer s4 = new StringBuffer(s);
s4 ==> Charvi

jshell> StringBuffer s5 = "abc"
|  Error:
|  incompatible types: java.lang.String cannot be converted to java.lang.StringBuffer
|  StringBuffer s5 = "abc";
|                    ^---^

jshell> StringBuffer s5 = (StringBuffer)"abc"
|  Error:
|  incompatible types: java.lang.String cannot be converted to java.lang.StringBuffer
|  StringBuffer s5 = (StringBuffer)"abc";
|                                  ^---^

jshell> StringBuffer s5 = s5.toString("abc")
|  Error:
|  method toString in class java.lang.StringBuffer cannot be applied to given types;
|    required: no arguments
|    found:    java.lang.String
|    reason: actual and formal argument lists differ in length
|  StringBuffer s5 = s5.toString("abc");
|                    ^---------^

jshell> s
s ==> "Charvi"

jshell> s3
s3 ==> Rishikesh

jshell> String S1 = s3
|  Error:
|  incompatible types: java.lang.StringBuffer cannot be converted to java.lang.String
|  String S1 = s3;
|              ^^

jshell> String S1 = (String)s3
|  Error:
|  incompatible types: java.lang.StringBuffer cannot be converted to java.lang.String
|  String S1 = (String)s3;
|                      ^^

jshell> String S1 = s3.toString()
S1 ==> "Rishikesh"

jshell> S1
S1 ==> "Rishikesh"

jshell> s3
s3 ==> Rishikesh

jshell> s3.append(" Hole")
$20 ==> Rishikesh Hole

jshell> s3
s3 ==> Rishikesh Hole

jshell> s3.insert(" Hole")
|  Error:
|  no suitable method found for insert(java.lang.String)
|      method java.lang.StringBuffer.insert(int,char[],int,int) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,java.lang.Object) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,java.lang.String) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,char[]) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,java.lang.CharSequence) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,java.lang.CharSequence,int,int) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,boolean) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,char) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,int) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,long) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,float) is not applicable
|        (actual and formal argument lists differ in length)
|      method java.lang.StringBuffer.insert(int,double) is not applicable
|        (actual and formal argument lists differ in length)
|  s3.insert(" Hole")
|  ^-------^

jshell> s3.insert(s3.length()," Hole")
$22 ==> Rishikesh Hole Hole

jshell> s3
s3 ==> Rishikesh Hole Hole

jshell> s3.insert(0,"Sayli ")
$24 ==> Sayli Rishikesh Hole Hole

jshell> s3.delete(10)
|  Error:
|  method delete in class java.lang.StringBuffer cannot be applied to given types;
|    required: int,int
|    found:    int
|    reason: actual and formal argument lists differ in length
|  s3.delete(10)
|  ^-------^

jshell> s3.deleteCharAt(10)
$25 ==> Sayli Rishkesh Hole Hole

jshell> s3.delete(0,6)
$26 ==> Rishkesh Hole Hole

jshell> s3.rever()
|  Error:
|  cannot find symbol
|    symbol:   method rever()
|  s3.rever()
|  ^------^

jshell> s3.reverse()
$27 ==> eloH eloH hsekhsiR

jshell> s3.reverse()
$28 ==> Rishkesh Hole Hole

jshell> s3.length()
$29 ==> 18

jshell> s3.delete(15,s3.length())
$30 ==> Rishkesh Hole H

jshell> s3.delete(14,s3.length())
$31 ==> Rishkesh Hole

jshell> s3.capacity()
$32 ==> 25

jshell> s3.length()
$33 ==> 14

jshell> s3
s3 ==> Rishkesh Hole

jshell> s3.setLength(35)

jshell> s3.length()
$36 ==> 35

jshell> s3
s3 ==> Rishkesh Hole

jshell> s3.size()
|  Error:
|  cannot find symbol
|    symbol:   method size()
|  s3.size()
|  ^-----^

jshell> s3.trimToSize()

jshell> s3.length()
$39 ==> 35

jshell> s3.capacity()
$40 ==> 35

jshell> s3
s3 ==> Rishkesh Hole

jshell> s3.setLength(25)

jshell> s3.setLength(20)

jshell> s3.setLength(15)

jshell> s3.setLength(10)

jshell> s3
s3 ==> Rishkesh H

jshell> s3.capacity()
$47 ==> 35

jshell> s3.trimToSize()

jshell> s3.capacity()
$49 ==> 10

jshell> s3.length()
$50 ==> 10

jshell> s3.ensureCapacity()
|  Error:
|  method ensureCapacity in class java.lang.StringBuffer cannot be applied to given types;
|    required: int
|    found:    no arguments
|    reason: actual and formal argument lists differ in length
|  s3.ensureCapacity()
|  ^---------------^

jshell> s3
s3 ==> Rishkesh H

jshell> s3.insert(s3.length()," Hole")
$52 ==> Rishkesh H Hole

jshell> s3
s3 ==> Rishkesh H Hole

jshell> s3.capacity()
$54 ==> 22

jshell> s3.length()
$55 ==> 15

jshell> s3
s3 ==> Rishkesh H Hole

jshell> StringBuffer s1 = new StringBuffer("Rishikesh")
s1 ==> Rishikesh

jshell> StringBuffer s2 = new StringBuffer("Rishikesh")
s2 ==> Rishikesh

jshell> s1==s2
$59 ==> false

jshell> StringBuffer s3=s2
s3 ==> Rishikesh

jshell> s3==s2
$61 ==> true

jshell> s1.equals(s2)
$62 ==> false

jshell> s3.equals(s2)
$63 ==> true

jshell>
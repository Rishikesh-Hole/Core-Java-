D:\Final Interview\Core java\Coding practice\17 - Strings>jshell
|  Welcome to JShell -- Version 21.0.1
|  For an introduction type: /help intro

jshell>

jshell> String s =""
s ==> ""

jshell> s.isEmpty()
$2 ==> true

jshell> s.isBlank()
$3 ==> true

jshell> String s1 ="   "
s1 ==> "   "

jshell> s1.isEmpty()
$5 ==> false

jshell> s1.isBlank()
$6 ==> true

jshell> String multiline ="line 1 \n line 2\n line3"
multiline ==> "line 1 \n line 2\n line3"

jshell> multiline.lines()
$8 ==> java.util.stream.ReferencePipeline$Head@71423665

jshell> multiline.lines().forEach(System.out::println)
line 1
 line 2
 line3

jshell> String repeatStr = "java".repeat(3)
repeatStr ==> "javajavajava"

jshell> String repeatStr = "java ".repeat(3)
repeatStr ==> "java java java "

jshell> String strp = "  Rishikesh  "
strp ==> "  Rishikesh  "

jshell> strp.strip()
$13 ==> "Rishikesh"

jshell> strp
strp ==> "  Rishikesh  "

jshell> strp.stripLeading()
$15 ==> "Rishikesh  "

jshell> strp.stripTrailing()
$16 ==> "  Rishikesh"

jshell>

jshell> String formattedString = "Hello %s, today is %dth day of %s !!".formatted("Rishikesh", 14, "January")
formattedString ==> "Hello Rishikesh, today is 14th day of January !!"

jshell> formattedString
formattedString ==> "Hello Rishikesh, today is 14th day of January !!"

jshell> String TextBlock = """
   ...> Hello Rishikesh
   ...> how are you?
   ...> How may I halp you today!!
   ...> """
TextBlock ==> "Hello Rishikesh\nhow are you?\nHow may I halp you today!!\n"

jshell> TextBlock
TextBlock ==> "Hello Rishikesh\nhow are you?\nHow may I halp you today!!\n"

jshell> TextBlock.lines().forEach(System.out::println)
Hello Rishikesh
how are you?
How may I halp you today!!

jshell>
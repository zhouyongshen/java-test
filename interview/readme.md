# [Java 面试宝典](https://www.cnblogs.com/798911215-Darryl-Tang/p/9118680.html)

一. Java基础部分 7

1. 一个".java"源文件中是否可以包括多个类（不是内部类）？有什么限制？ 7

2. Java有没有goto? 7

3. 说说&和&&的区别。 8

4. 在JAVA中如何跳出当前的多重嵌套循环？ 8

5. switch语句能否作用在byte上，能否作用在long上，能否作用在String上? 9

6. short s1 = 1; s1 = s1 + 1;有什么错? short s1 = 1; s1 += 1;有什么错? 9

7. char型变量中能不能存贮一个中文汉字?为什么? 9

8. 用最有效率的方法算出2乘以8等於几? 9

9. 请设计一个一百亿的计算器 9

10. 使用final关键字修饰一个变量时，是引用不能变，还是引用的对象不能变？ 11

11. "=="和equals方法究竟有什么区别？ 11

12. 静态变量和实例变量的区别？ 12

13. 是否可以从一个static方法内部发出对非static方法的调用？ 12

14. Integer与int的区别 13

15. Math.round(11.5)等於多少? Math.round(-11.5)等於多少? 13

16. 下面的代码有什么不妥之处? 13

17. 请说出作用域public，private，protected，以及不写时的区别 13

18. Overload和Override的区别。Overloaded的方法是否可以改变返回值的类型? 14

19. 构造器Constructor是否可被override? 15

20. 接口是否可继承接口? 抽象类是否可实现(implements)接口? 抽象类是否可继承具体类(concrete class)? 抽象类中是否可以有静态的main方法？ 15

21. 写clone()方法时，通常都有一行代码，是什么？ 15

22. 面向对象的特征有哪些方面 15

23. java中实现多态的机制是什么？ 17

24. abstract class和interface有什么区别? 17

25. abstract的method是否可同时是static,是否可同时是native，是否可同时是synchronized? 18

26. 什么是内部类？Static Nested Class 和 Inner Class的不同。 19

27. 内部类可以引用它的包含类的成员吗？有没有什么限制？ 20

28. Anonymous Inner Class (匿名内部类) 是否可以extends(继承)其它类，是否可以implements(实现)interface(接口)? 21

29. super.getClass()方法调用 21

30. String是最基本的数据类型吗? 22

31. String s = "Hello";s = s + " world!";这两行代码执行后，原始的String对象中的内容到底变了没有？ 22

32. 是否可以继承String类? 23

33. String s = new String("xyz");创建了几个String Object? 二者之间有什么区别？ 23

34. String 和StringBuffer的区别 23

35. 如何把一段逗号分割的字符串转换成一个数组? 24

36. 数组有没有length()这个方法? String有没有length()这个方法？ 24

37. 下面这条语句一共创建了多少个对象：String s="a"+"b"+"c"+"d"; 24

38. try {}里有一个return语句，那么紧跟在这个try后的finally {}里的code会不会被执行，什么时候被执行，在return前还是后? 25

39. 下面的程序代码输出的结果是多少？ 25

40. final, finally, finalize的区别。 27

41. 运行时异常与一般异常有何异同？ 27

42. error和exception有什么区别? 28

43. Java中的异常处理机制的简单原理和应用。 28

44. 请写出你最常见到的5个runtime exception。 28

45. JAVA语言如何进行异常处理，关键字：throws,throw,try,catch,finally分别代表什么意义？在try块中可以抛出异常吗？ 29

46. java中有几种方法可以实现一个线程？用什么关键字修饰同步方法? stop()和suspend()方法为何不推荐使用？ 29

47. sleep() 和 wait() 有什么区别? 30

48. 同步和异步有何异同，在什么情况下分别使用他们？举例说明。 32

49. 下面两个方法同步吗？（自己发明） 33

50. 多线程有几种实现方法?同步有几种实现方法? 33

51. 启动一个线程是用run()还是start()? . 33

52. 当一个线程进入一个对象的一个synchronized方法后，其它线程是否可进入此对象的其它方法? 33

53. 线程的基本概念. 线程的基本状态以及状态之间的关系 34

54. 简述synchronized和java.util.concurrent.locks.Lock的异同 ？ 34

55. 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。 36

56. 子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，接着再回到主线程又循环100，如此循环50次，请写出程序。 38

57. 介绍Collection框架的结构 43

58. Collection框架中实现比较要实现什么接口 43

59. ArrayList和Vector的区别 44

60. HashMap和Hashtable的区别 44

61. List 和 Map 区别? 45

62. List, Set, Map是否继承自Collection接口? 45

63. List. Map. Set三个接口，存取元素时，各有什么特点？ 45

64. 说出ArrayList,Vector, LinkedList的存储性能和特性 46

65. 去掉一个Vector集合中重复的元素 46

66. Collection 和 Collections的区别。 47

67. Set里的元素是不能重复的，那么用什么方法来区分重复与否呢? 是用==还是equals()? 它们有何区别? 47

68. 你所知道的集合类都有哪些？主要方法？ 47

69. 两个对象值相同(x.equals(y) == true)，但却可有不同的hash code，这句话对不对? 48

70. TreeSet里面放对象，如果同时放入了父类和子类的实例对象，那比较时使用的是父类的compareTo方法，还是使用的子类的compareTo方法，还是抛异常！ 48

71. 说出一些常用的类，包，接口，请各举5个 49

72. java中有几种类型的流？JDK为每种类型的流提供了一些抽象类以供继承，请说出他们分别是哪些类？ 49

73. 字节流与字符流的区别 50

74. 什么是java序列化，如何实现java序列化？或者请解释Serializable接口的作用。 51

75. 描述一下JVM加载class文件的原理机制? 52

76. heap和stack有什么区别。 52

77. GC是什么? 为什么要有GC? 52

78. 垃圾回收的优点和原理。并考虑2种回收机制。 52

79. 垃圾回收器的基本原理是什么？垃圾回收器可以马上回收内存吗？有什么办法主动通知虚拟机进行垃圾回收？ 52

80. 什么时候用assert。 53

81. java中会存在内存泄漏吗，请简单描述。 53

82. 能不能自己写个类，也叫java.lang.String？ 57

83. Java代码查错 57

二. 算法与编程 61

1. 编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔。 61

2. 编写一个程序，将d:\java目录下的所有.java文件复制到d:\jad目录下，并将原来文件的扩展名从.java改为.jad。 62

3. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串，但要保证汉字不被截取半个，如“我ABC”，4，应该截取“我AB”，输入“我ABC汉DEF”，6，应该输出“我ABC”，而不是“我ABC+汉的半个”。 65

4. 有一个字符串，其中包含中文字符. 英文字符和数字字符，请统计和打印出各个字符的个数。 65

5. 说明生活中遇到的二叉树，用java实现二叉树 66

6. 从类似如下的文本文件中读取出所有的姓名，并打印出重复的姓名和重复的次数，并按重复次数排序： 71

7. 写一个Singleton出来。 75

8. 递归算法题1 77

9. 递归算法题2 78

10. 排序都有哪几种方法？请列举。用JAVA实现一个快速排序。 79

11. 有数组a\[n\]，用java代码将数组元素顺序颠倒 80

12．金额转换，阿拉伯数字的金额转换成中国传统的形式如：（￥1011）－>（一千零一拾一元整）输出。 81

三. html&JavaScript&ajax部分 82

1. 判断第二个日期比第一个日期大 82

2. 用table显示n条记录，每3行换一次颜色，即1，2，3用红色字体，4，5，6用绿色字体，7，8，9用红颜色字体。 83

3. HTML 的 form 提交之前如何验证数值文本框的内容全部为数字? 否则的话提示用户并终止提交? 84

4. 请写出用于校验HTML文本框中输入的内容全部为数字的javascript代码 84

5. 说说你用过那些ajax技术和框架，说说它们的区别 85

四. Java web部分 85

1. Tomcat的优化经验 85

2. HTTP请求的GET与POST方式的区别 85

3. 解释一下什么是servlet; 85

4. 说一说Servlet的生命周期? 86

5. Servlet的基本架构 86

6. SERVLET API中forward() 与redirect()的区别？ 86

7. 什么情况下调用doGet()和doPost()？ 86

8. Request对象的主要方法： 87

9. forward 和redirect的区别 87

10. request.getAttribute() 和 request.getParameter() 有何区别? 88

11. jsp有哪些内置对象?作用分别是什么? 分别有什么方法？ 88

12. jsp有哪些动作?作用分别是什么? 88

13. JSP的常用指令 89

14. JSP中动态INCLUDE与静态INCLUDE的区别？ 89

15. 两种跳转方式分别是什么?有什么区别? 89

16. 页面间对象传递的方法 89

17. JSP和Servlet有哪些相同点和不同点，他们之间的联系是什么？ 90

18. MVC的各个部分都有那些技术来实现?如何实现? 90

19. 我们在web应用开发过程中经常遇到输出某种编码的字符，如iso8859-1等，如何输出一个某种编码的字符串？ 90

20．现在输入n个数字，以逗号，分开；然后可选择升或者降序排序；按提交键就在另一页面显示按什么排序，结果为，提供reset 91

五. 数据库部分 91

1. 用两种方式根据部门号从高到低，工资从低到高列出每个员工的信息。 91

2. 列出各个部门中工资高于本部门的平均工资的员工数和部门号，并按部门号排序 91

3. 存储过程与触发器必须讲，经常被面试到? 92

4. 数据库三范式是什么? 94

5. 说出一些数据库优化方面的经验? 95

6. union和union all有什么不同? 96

7. 分页语句 97

8. 用一条SQL语句 查询出每门课都大于80分的学生姓名 100

9. 所有部门之间的比赛组合 100

10. 每个月份的发生额都比101科目多的科目 101

11. 统计每年每月的信息 102

12. 显示文章标题，发帖人. 最后回复时间 103

13. 删除除了id号不同,其他都相同的学生冗余信息 104

14. 航空网的几个航班查询题： 104

15. 查出比经理薪水还高的员工信息： 105

16. 求出小于45岁的各个老师所带的大于12岁的学生人数 106

17. 求出发帖最多的人： 107

18. 一个用户表中有一个积分字段，假如数据库中有100多万个用户，若要在每年第一天凌晨将积分清零，你将考虑什么，你将想什么办法解决? 107

19. 一个用户具有多个角色，请查询出该表中具有该用户的所有角色的其他用户。 108

20. xxx公司的sql面试 108

21. 注册Jdbc驱动程序的三种方式 109

22. 用JDBC如何调用存储过程 109

23. JDBC中的PreparedStatement相比Statement的好处 110

24. 写一个用jdbc连接并访问oracle数据的程序代码 111

25. Class.forName的作用?为什么要用? 111

26. 大数据量下的分页解决方法。 111

27. 用 JDBC 查询学生成绩单, 把主要代码写出来（考试概率极大）. 112

28. 这段代码有什么不足之处? 112

29. 说出数据连接池的工作机制是什么? 113

30. 为什么要用 ORM?  和 JDBC 有何不一样? 113

六. XML部分 113

1. xml有哪些解析技术?区别是什么? 113

2. 你在项目中用到了xml技术的哪些方面?如何实现的? 114

3. 用jdom解析xml文件时如何解决中文问题?如何解析? 114

4. 编程用JAVA解析XML的方式. 115

5. XML文档定义有几种形式？它们之间有何本质区别？解析XML文档有哪几种方式？ 117

七. 流行的框架与新技术 117

1. 谈谈你对Struts的理解。 117

2. 谈谈你对Hibernate的理解。 118

3. AOP的作用。 118

4. 你对Spring的理解。 118

5. 谈谈Struts中的Action servlet。 120

6. Struts优缺点  优点：  1. 实现MVC模式，结构清晰,使开发者只关注业务逻辑的实现. 120

7. STRUTS的应用(如STRUTS架构) 121

8. 说说struts1与struts2的区别。 121

9. hibernate中的update()和saveOrUpdate()的区别，session的load()和get()的区别。 122

10. 简述 Hibernate 和 JDBC 的优缺点? 如何书写一个 one to many 配置文件. 122

11. iBatis与Hibernate有什么不同? 122

12. 写Hibernate的一对多和多对一双向关联的orm配置? 122

9. hibernate的inverse属性的作用? 122

13. 在DAO中如何体现DAO设计模式? 123

14. spring+Hibernate中委托方案怎么配置? 123

15. spring+Hibernate中委托方案怎么配置? 123

16. hibernate进行多表查询每个表中各取几个字段，也就是说查询出来的结果集没有一个实体类与之对应如何解决； 123

17.介绍一下Hibernate的二级缓存 123

18. Spring 的依赖注入是什么意思? 给一个 Bean 的 message 属性, 字符串类型, 注入值为 "Hello" 的 XML 配置文件该怎么写? 125

19. Jdo是什么? 125

20. 什么是spring的IOC  AOP 126

21. STRUTS的工作流程！ 126

22. spring 与EJB的区别！！ 126

八. 软件工程与设计模式 126

1. UML方面 126

2. j2ee常用的设计模式？说明工厂模式。 126

3. 开发中都用到了那些设计模式?用在什么场合? 127

九. j2ee部分 127

1. BS与CS的联系与区别。 127

2. 应用服务器与WEB SERVER的区别？ 128

3. 应用服务器有那些？ 128

4. J2EE是什么？ 128

5. J2EE是技术还是平台还是框架？ 什么是J2EE 128

6. 请对以下在J2EE中常用的名词进行解释(或简单描述) 129

7. 如何给weblogic指定大小的内存? 129

8. 如何设定的weblogic的热启动模式(开发模式)与产品发布模式? 129

9. 如何启动时不需输入用户名与密码? 130

10. 在weblogic管理制台中对一个应用域(或者说是一个网站,Domain)进行jms及ejb或连接池等相关信息进行配置后,实际保存在什么文件中? 130

11. 说说weblogic中一个Domain的缺省目录结构?比如要将一个简单的helloWorld.jsp放入何目录下,然的在浏览器上就可打入http://主机:端口号//helloword.jsp就可以看到运行结果了? 又比如这其中用到了一个自己写的javaBean该如何办? 130

12. 在weblogic中发布ejb需涉及到哪些配置文件 130

13. 如何在weblogic中进行ssl配置与客户端的认证配置或说说j2ee(标准)进行ssl的配置? 130

14. 如何查看在weblogic中已经发布的EJB? 131

十. EBJ部分 131

1. EJB是基于哪些技术实现的？并说出SessionBean和EntityBean的区别，StatefulBean和StatelessBean的区别。 131

2. 简要讲一下 EJB 的 7 个 Transaction Level? 131

3. EJB与JAVA BEAN的区别？ 131

4. EJB包括（SessionBean,EntityBean）说出他们的生命周期，及如何管理事务的？ 132

5. EJB容器提供的服务 132

6. EJB的激活机制 132

7. EJB的几种类型 132

8. 客服端调用EJB对象的几个基本步骤 133

十一. webservice部分 133

1. WEB SERVICE名词解释。JSWDL开发包的介绍。JAXP. JAXM的解释。SOAP. UDDI,WSDL解释。 133

2. CORBA是什么?用途是什么? 133

3. Linux 134

4. LINUX下线程，GDI类的解释。 134

5. 问得稀里糊涂的题 134

6. 四种会话跟踪技术 134

7. 简述逻辑操作(&,|,^)与条件操作(&&,||)的区别。 134

十二. 其他 134

1. 请用英文简单介绍一下自己. 134

2. 请把 http://tomcat.apache.org/ 首页的这一段话用中文翻译一下? 135

3. 美资软件公司JAVA工程师电话面试题目 135
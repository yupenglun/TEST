###课程回顾：
1. String相关api
- 创建字符串  var str1 = "abc";  var str2 = new String("abc");
- 转大小写  toUpperCase()  toLowerCase();
- 获取某个位置的字符 charAt(2)
- 查找字符串出现的位置   indexOf()  lastIndexOf()
- 截取字符串 substring(star,[end])
- 替换字符串 replace(old,new)
- 分隔字符串 str.split(",");
2. 把数值转成字符串 toFixed(n)  n代表小数的位数
3. 数组相关
- 创建数组  var arr1 = [1,"abc",true]; var arr2= new Array();
- 添加内容 arr2.push(18);
- 修改长度  arr1.length=1;
- 获取内容  arr1[2];
- 删除  delete arr1[0];
- 内容反转  reverse();
- 排序  sort();
- 自定义排序  sort(function(a,b){ return a-b;});
4. 日期相关
- 创建日期： var date = new Date();
	var date = new Date("2008/12/22 08:18:23");
- 获取时间分量  getFullYear()  getMonth()  getDate() getDay() getHours()   getMinutes()  setSeconds()
- 获取年月日  获取 时分秒   date.toLocaleDateString()  date.toLocaleTimeString()
5. 正则   
	. 任意字符除了换行    \d 任意数字  \w 任意数字字母下划线 \s任意空白  ^开始  $结束
- 创建方式   var reg1 = /^a\d{3,8}m$/;
			var reg2 = new RegExp("规则","模式")
- 正则对象函数
	查找  reg1.exec(str)    校验 reg1.test(str)
- 字符串正则相关函数
	str.match(reg1)    str.replace(reg1,new);

####事件的取消 
- 在元素的事件中如果执行 return false则可以让当前的事件取消执行
- 以下代码为取消事件的典型案例
	<a href="http://www.baidu.com" onclick="return confirm("您确认访问百度吗？")">百度</a>
###登录校验的高端版本 代码参见 demo02.html

####隐藏元素的两种方式：
1. display:none 脱离文档流
2. visibility:hidden(隐藏)/visible(显示) 不脱离文档流
####接触的新的事件  onblur（元素失去焦点） onsubmit(表单提交事件)

###自定义对象
####两种创建对象的方式

		/* 第一种 通过声明函数的形式创建对象 */
	 
		/* 创建一个带构造方法的对象 */
		/* function Person(name,age){
		//声明属性
		this.name=name;
		this.age=age;
		
		//声明方法 
		this.run=function(){
			alert("name:"+name+" age:"+age);
		}
		}
		//创建对象
		var p1 = new Person("李白",38);
		//调用对象的方法
		p1.run(); */
		
		/* 创建一个空对象  */
		/* 	function Person(){}
		var p1 = new Person();
		//创建对象之后 再添加属性和方法
		p1.name="刘备";
		p1.age=18;
		p1.run = function(){
			alert("name:"+this.name+" age:"+this.age);
		}
		p1.run(); */
		
		/* 第二种 以声明变量的形式创建对象 */
		var p = {
				"name":"曹操",
				"age":18,
				"run":function(){
					alert("name:"+this.name+" age:"+this.age);
				}
		}
		p.run();


###DHTML
- 简介： Dynamic(动态) HTML ， 这并不是新的技术，只是使用 HTML+CSS+JS得到一个动态页面效果称为DHTML
- DHTML： 包括  DOM  BOM
- BOM：Browser（浏览器）Object（对象）Model（模型），在BOM中存在一些和浏览器相关的对象包括：location，document，history，screen，navigator

- DOM：Document（文档）Object（对象）Model（模型），存放和页面相关的对象

####BOM
###window
	window中所有的属性在调用的时候可以省略掉window ，window下的属性也称为全局属性 window下的函数也称为全局函数
####window下的全局函数
	parseInt()和parseFloat() 
	alert()//弹出框
	confirm()//确认框 
	prompt()//弹出文本框 
	isNaN()//判断是否是非数字
####window下的全局属性
- location:位置
	location.href 可以获取和设置当前浏览的页面地址
	location.reload();//页面重新加载（刷新）
- history:浏览历史
	
	history.length 得到当前窗口访问过的页面数量
	history.back() 返回上一个页面
	history.forward() 前往下一个页面 
	history.go(num)  前往某个页面 0代表当前页面 1代表下一个页面 -1代表上一个页面  2代表下两个页面

- screen:屏幕
	width/height: 得到当前屏幕的分辨率 
	availWidth/availHeight: 可用屏幕的宽高 
- navigator：导航/帮助
	navigator.userAgent 得到客户端浏览器版本信息

- document:文档（页面）
####Window相关的事件
- 点击事件： 点击窗口任何位置的时候都会响应
- 加载完成事件： 当页面元素全部加载完成的时候响应
- 获取焦点事件： 每次页面激活的时候响应
- 失去焦点事件： 每次页面失去激活状态的时候响应
		/* 窗口点击事件 */
		onclick=function(){
			/* alert("屏幕被点击了"); */	
		}
		/* 页面加载完成事件 */
		/* 如果页面加载完对某些元素进行操作的话 就需要使用此事件 */
		onload=function(){
			/* alert("加载完成了"); */
			var input = document.getElementById("myinput");
			input.value="abcd";
		}
		//以下代码存在获取不到元素的问题 因为页面还没加载完
		/* var input = document.getElementById("myinput");
		input.value="abcd"; */
		/* 焦点可以理解成页面的激活状态 
		如果有需求每次离开页面和每次回到页面时做某些事，
		则把代码写在这两个事件中  */
		onfocus = function(){
			console.log("页面焦点来了");
		}
		onblur = function(){
			console.log("页面焦点走了"); 
		}
####eval()函数 

- 可以将字符串以js代码的形式执行

		eval("alert('abc')");
###计算器高级版步骤：
- 搭建界面：
1. 一个大的div 里面添加两个小的div，
第一个小的div里面加一个p标签和一个按钮
第二个小的div里面添加16个按钮 
2. 通过css属性选择器选中所有的按钮 设置相同宽高，边框粗细和颜色，上下外边距 设置浮动

####通过js给元素添加样式
- 通过js给元素添加的样式为内联样式 优先级最高 获取的也是内联样式 ，获取不到非内联样式的值
 	
	div.style.width="100px";
####定时器
- setInterval(函数,时间间隔 毫秒)










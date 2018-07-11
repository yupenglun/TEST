###课程回顾：
1. 定位：
- position定位: static relative absolute fixed
- static： 默认 静态定位 文档流定位， 从上到下 从左到右
- relative：相对定位， 不脱离文档流，top right bottom left 相对元素初始位置  场景：当元素需要从初始位置做位置偏移 并且元素原位置保留时使用
- absolute：绝对定位， 脱离文档流，上右下左相对于窗口或做了非static定位的祖先元素 场景：元素需要层叠显示 需要脱离文档流（不占文档流中的位置），元素会随着内容滚动而移动  
- fixed：固定定位， 脱离文档流， 上右下左相对于窗口， 场景：当元素需要固定在窗口的某个位置时使用。

- 浮动定位：脱离文档流，元素会在当前行向左或向右浮动，浮动到父元素的边缘或碰到其它浮动的元素停止，场景：当需要把纵向排列的元素改成横向排列的时候使用浮动定位，当元素内部所有子元素全部浮动时父元素自动识别的高度为0，可以通过overflow：hidden解决此问题， 如果元素浮动完后，后面的元素如果不想顶上去 可以给后面的元素添加clear属性 禁止元素的两侧有浮动元素

2. 行内元素的对齐方式： 默认是基线对齐
	vertical-align：baseline（默认）/top/middle/bottom

3. CSS的三大特性： 继承性  层叠性 优先级
- 继承性： 子元素可以继承祖先元素的部分属性 属性包括：color font- text-  line- 此类属性
- 层叠性：不同的选择器 指向同一个元素时 如果作用的属性不同则全部生效  如果相同优先级决定哪一个生效
- 优先级： 作用范围越小 优先级越高  id>class>标签名>继承>默认效果  ， 直接选中优先级高于间接选中（继承）


##JavaScript
	
		html 搭建页面结构和内容   CSS 美化页面   JavaScript 给页面添加动态效果
###JS历史

		1995年由网景（NetScape）公司发布 LiveScript 同年改名为JavaScript， 和Java没有关系 蹭热度

###JS特点
1. 属于脚本语言 不需要编译 由浏览器解析执行
2. JavaScript可以嵌入到Html中 
3. JavaScript基于面向对象 
4. 弱类型语言 
###JS优点
1. 交互性： 直接和用户进行交互 
2. 安全性： js不可以访问浏览器以外的内容（指硬盘中的数据）
###如何在html中添加js代码
1. 在元素的事件中添加

		<input type="button" 
		onclick="alert('第一种引入方式')" value="我是按钮"> 
2. 在html文件中通过 script标签添加

		<script type="text/javascript">
			alert("第二种引入方式 ");
		</script>

3. 在单独的js文件中添加 通过 script标签的 src属性引入js文件

		<!-- 引入js文件   引入文件的script中 不能在写js代码-->
		<script type="text/javascript" src="first.js">


###JavaScript语法 
####数据类型  
1. 数值类型 （number）
2. 字符串类型 （string）
3. 布尔值类型 （boolean）
- undefined   var x;
- null     var x=null;
- 对象类型
####变量声明和赋值
	
	var x=18;
	var name = "张三";
	var b = true/false;
	var z;   //undefined
	var y = null;   
	var p = new Person();
#####数值类型 
- js中底层都是浮点型,在使用过程中会自动类型转换
	var x=10/2; // 5
	var y=10/3; //3.3333333     
-   NaN: Not a Number 不是一个数 ，  isNaN() 用来判断一个变量是否是一个数      isNaN("18") = false  
####字符串类型
	通过单引号或双引号修饰字符串
	var s1 = 'aaa';
	var s2 = "aaa";

####布尔值类型

	var b = true;   var b = false;

####数据类型的隐式转换

- 在js中 数据的类型会根据不同的应用场景 自动转换
1. 数值类型
- 转成字符串： 直接转 18-> "18"    "abc"+18 = "abc18"
- 转布尔值：  0和NaN 转成false  其它数转成true 把数值变量写在if条件里面的时候会自动把数值类型转成布尔类型

2. 字符串类型
- 转成数值： 如果字符串为数字则直接转 "18"->18 "18abc"->18  如果不是数则转成NaN "abc"->NaN      将字符串转成数值的函数：parseInt("");
- 转布尔值： 空字符串转成false 其它转true  if("abc"){1}else{2}
3. 布尔类型
- 转字符串： true->"true" false->"false"   "abc"+true = "abctrue"
- 转数值 ：  true->1  false->0  20+true=21  20+false=20

4. undefined
- 转字符串： undefined->"undefined"  "a"+undefined="aundefined"
- 转数值: NaN   20+undefined=NaN
- 转布尔值：  false   if(undefined){1}else{2} 
5. null
- 转字符串： "null"   "a"+null = "anull"
- 转数值：   null->0   20+null=20;
- 转布尔值： false    if(null){1}else{2} 

####练习 点击按钮在页面中弹出 "66"+6的结果 和 "66"-6的结果
   <input type="button" onclick="alert('66'+6)">
   <input type="button" onclick="alert('66'-6)">










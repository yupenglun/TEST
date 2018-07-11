##课程回顾：
1. 图像地图map id和name   子标签  area  shape（形状：rect circle） coords 圆形3个值   矩形四个值  href
2. 超链接： a  href   target="_blank"  锚点 <a id name></a>  <a href="#id/name" 
3. 表格   table  tr  td  th thead tbody tfoot 属性：border cellspacing cellpadding  rowspan colspan bgcolor  bordercolor
7. 表单  form   文本框 密码框 单选 多选 文件 日期 隐藏 标签 按钮
	type= text    password  radio checkbox file date hidden button/submit/reset 
	 <label> 
文本域 下拉选 
	
		textarea 
		<select>

###day01
1. 页面结构

		<!DOCTYPE html>
		<html>
		<head> 给浏览器看的内容 告诉浏览器如何解析内容
		</head>
		<body>给用户看的内容
		</body>
		</html>
2. 写在head里面的
	meta    charset="UTF-8"      name="keywords"  content="a,b,c"

	title 
3. 各种标签
	h1-h6     p     hr
4. 列表： 定义列表   无需列表 有序列表  

		<dl>
			<dt></dt>
			<dd></dd>
			<dd></dd>
		</dl>

		<ul>
			<li></li>
			<li></li>
			<li></li>
		</ul>
		<ol>
			<li></li>
				<ul>
					<li></li>
					<li></li>
					<li></li>
				</ul>
			<li></li>
			<li></li>
		</ol>
5. 分区元素
	div : 独占一行 
	span： 共占一行
	header  article  footer
6. 元素分类
	块级元素：独占一行 div h1-h6 p hr
	行内元素：共占一行 span i-em  b-strong u del-s 
7. 特殊字符

	空格 ：  &nbsp;
	小于号:   &lt;
	大于号： &gt;
	换行 ： <br>

8. 图片 img
	alt: 图片不显示的时候显示的文本
	src： 路径  相对路径和绝对路径  ../../abc/a.jpg
	title: 鼠标悬停图片上显示的文本
	width/height: 像素 px   百分比 %  只设置width 高会原比例缩放
	格式： jpg png gif

###作业：

		<body>
		<h1 align="center">注册表单</h1>
		<form action="">
			<table border="1" width="50%" 
			cellspacing="0" align="center">
				<tr>
					<td>用户名:</td>
					<td><input type="text" 
					name="username"></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="password" 
					name="password1"></td>
				</tr>
				<tr>
					<td>确认密码:</td>
					<td><input type="password" 
					name="password2"></td>
				</tr>
				<tr>
					<td>昵称:</td>
					<td><input type="text" 
					name="nick"></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td><input id="nan" type="radio" 
					name="gender" value="nan"><label for="nan">男</label>
					<input id="nv" type="radio" 
					name="gender" value="nv"><label for="nv">女</label></td>
				</tr>
				<tr>
					<td>爱好:</td>
					<td><input id="lq" type="checkbox" 
					name="hobby" value="lq"><label for="lq">篮球</label>
					<input id="wz" type="checkbox" 
					name="hobby" value="wz"><label for="wz">王者</label>
					<input id="gdx" type="checkbox" 
					name="hobby" value="gdx"><label for="gdx">搞对象</label></td>
				</tr>
				<tr>
					<td>生日:</td>
					<td><input type="date" 
					name="birthday"></td>
				</tr>
				<tr>
					<td>头像:</td>
					<td><input type="file" 
					name="pic"></td>
				</tr>
				<tr>
					<td>城市:</td>
					<td><select name="city">
						<option>请选择</option>
						<option value="bj">北京</option>
						<option value="sh">上海</option>
						<option value="gz">广州</option>
					</select></td>
				</tr>
				<tr>
					<td>自我介绍:</td>
					<td><textarea rows="3" cols="30"
					name="intro">说点儿什么...</textarea> </td>
				</tr>
				<tr>
					<td>验证码:</td>
					<td><input type="text">
					<img src="../imgs/a.jpg" 
					width="80px" height="20px"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="注册">
					<input type="reset">
					</td>
				</tr>
			</table>
		</form>
	
		</body>


###CSS
- CSS Cascading层叠  Style样式 Sheet表 层叠样式表 ，CSS技术用于美化html页面，html相当于建房子，css相当于装修。

###CSS的引入方式
1. 内联样式：在标签的内部 通过style属性添加css样式，弊端只能作用于一个元素，不能够复用
	
		<div style="color: red; border: 1px solid blue">我是一个div</div>
		<span style="background-color: yellow">我是一个span</span>
2. 内部样式：通过一个Style标签引入css，可以在当前页面中进行复用，应用场景比内联要广，但是优先级内联要高，弊端只能在当前页面复用，工作中使用不多，工作中要把样式和html代码分离，但是学习过程中内部用的最多
		
		<style type="text/css">
			/* 通过选择器找到相对应的标签 把样式 加到这个标签上   */
			div{
				color: pink;
				border: 2px solid green;
			}
			span{
				background-color: purple;
				border: 1px solid red;
			}
		</style>
3. 外部样式： 通过在head里面写 link标签 把外部的样式文件引入，可以多个页面中复用 

		<link rel="stylesheet" href="first.css">

###css样式优先级
- 内联样式的优先级最高
- 后执行的会覆盖前面执行的效果

###CSS的选择器
####标签名选择器

		标签名{
			样式代码1;
			样式代码2;
		}
####id选择器
- 通过id找到相对应的元素（标签）
- 场景：当需要对页面中的某一个元素设置效果的时候可以使用id选择器
- 格式：  #id{}
	
		#d2{
			color: red;
		}
		#d3{
			border: 1px solid blue;
		}
####类（class）选择器
- 通过标签的class属性值选择标签
- 场景：当页面中需要给多个元素设置相同样式的时候使用类选择器
- 格式： .class{}
	
		.s1{
			background-color: yellow;
		}
		.s2{
			background-color: green;
		}
###属性选择器
- 通过标签的属性名和值 找到相对应的标签
- 场景：如果需要使用属性作为查找条件时使用
		/* 属性选择器 */
		input[type='text']{
			background-color: red;
		}
		input[type='password']{
			background-color: pink;
		}


###上午回顾：
1. CSS 层叠样式表   美化页面 
2. CSS 三种引入方式： 
- 内联： 在标签内部 通过style属性 添加样式 ，不能复用 
- 内部样式： 在head里面添加 style标签   不能多页面复用
- 外部样式： 创建一个*.css文件 在文件中写样式代码 在head中通过link标签 引入 css文件    <link rel="stylesheet" href="a.css">
3. 优先级： 内联最高    最后执行的生效
4.  标签名选择器     id选择器 #id   class选择器 .类名  属性选择器  标签名[属性名='值']

####派生选择器(后代选择器)
- 类似于一个路径 找到符合要求的标签 匹配所有的后代（子元素 孙子元素。。。。）
		/* 后代选择器  */
		#d1 .c1 span{
			color: red;
		}
		
		div .c2 span{
			background-color: green;
		}
####子元素选择器
- 类似于一个路径 找到符合要求的标签 只匹配所有的子元素

		/* 子元素选择器  */
		#d1>.c1>span{
			color: red;
		}
		
		.c2>span{
			background-color: yellow;
		}

####分组选择器
- 如果需要对页面中多种不相关的元素设置相同的样式，如果一个选择器搞不定，可以使用分组选择器把多个选择器通过，合并成一个

		/* 分组选择器 */
		ul li a, input[type='text'], .c1>p>span,h1{
			background-color: green;
		}
####伪元素选择器
- 用来选择元素的状态
1. visited： 访问过的状态
2. link: 未点击的状态
3. hover： 鼠标悬停状态
4. active： 鼠标点击时的状态

- hover必须写在 link和visited的后面， active必须写在hover后面才生效，按照下面代码的顺序写即可

		/* 访问过的状态  */
			a:VISITED {
		 	color: red;
		}
		/* 未点击的状态  */
			a:LINK {
			color: yellow;
		}
		/* 鼠标悬停状态 */
			a:HOVER {
			color: blue;
		}
		/* 点击时的状态 */
			a:ACTIVE {
			color: pink;
		}
####任意元素选择器
- 如果需要给页面中所有元素添加相同的样式可以使用此选择器
	
			*{
				border: 1px solid red;
			}
##CSS中常用的属性
###元素的宽高
- width/height  只能修改块级元素的宽高，不能修改行内元素的宽高

###颜色赋值
	
		/* 1. 通过颜色名称赋值 */
		/* background-color: red; */
		/* 2. 6位16进制赋值  每两位表示一个颜色 红 绿 蓝
		 ff表示255 当前颜色的最大值   */
		/* background-color: #ffff00; */
		/* 3. 3位16进制赋值  */
		/* background-color: #f00; */
		/* 4. 10进制 通过rgb(255,0,0) */
		/* background-color: rgb(0,255,0); */
		/* 5. 10进制 通过rgba(255,0,0,0-1) alpha 透明度 */
###背景图片
	
		/* 添加背景图片 */
		background-image: url("../imgs/a.jpg");
		/* 图片尺寸 */
		background-size: 300px 300px;
		/* 不重复 */
		background-repeat: no-repeat;
		/* 控制图片位置  bottom底部 顶部top 
		中间 center 左边 left 右边 right */
		/* background-position: left bottom; */
		/* 通过百分比控制位置 */
		background-position: 100% 100%;

###布局相关属性（盒子模型）


####一个元素再页面中所占的宽度如何计算？

-  左外边距+左边框的宽度+左内边距+元素的宽度+右内边距+右边框宽度+右外边距

####外边距：指元素边框距相邻元素或上级元素边框的距离

####如何设置外边距

		/* 单独设置外边距 */
		/* margin-left: 50px;
		margin-top: 50px;
		margin-bottom: 50px; */ 
		/* 批量设置外边距 */
		/* margin: 50px; */ /* 上右下左都是50px  */
		/* margin: 10px 30px; */ /* 上下  左右  */
		/* margin: 0px auto; */ /* 上下0  左右居中 */
		margin: 10px 20px 30px 40px; /* 上右下左 顺时针 */

#### 行内元素左右外边距生效 上下不生效

####两个相邻元素的上下外边距 取最大值，两个相邻元素的左右外边距是左外+右外


###课程回顾：
1. CSS 层叠样式表  美化页面
2. 引入方式：三种 内联 内部  外部
3. 内联 写在标签里面的 style属性中  不能复用  优先级最高
4. 内部 写在head中的style标签中  只能在本页面中复用 
5. 外部  写在单独的css文件中  通过link标签引入<link rel="stylesheet" href="a.css">  可以多个页面复用
6. 优先级  后执行的覆盖前面的 
7. 选择器

- 标签名选择器 
- id选择器  #id{}
- 类选择器  .class{}
- 标签名  id  类 称为 基础选择器 
- 属性选择器 基础选择器[属性名='值']{}
- 派生选择器(后代选择器)   基础选择器1 基础选择器2{}
- 子元素选择器  基础选择器1>基础选择器2{}
- 分组选择器   选择器1, 选择器2,选择器3{}
- 任意元素选择器 *{}
- 伪类选择器  visited：访问过的状态  link：未点击状态 hover：鼠标悬停状态 active:点击时的状态


8. 常见属性 
- 宽高： width/heigth   div：生效   行内元素：不生效
- 颜色： 5种写法 1. 颜色名  2. 6位16进制  3. 3位16进制 4. rgb() 5.rgba() a=0-1
- 背景图片： 
background-image:url('路径')
background-size: 200px 300px;
background-repeat: no-repeat;
background-position: 横向 纵向;   left right top bottom center 
background-position: 横向 纵向;百分比形式
- 盒子模型
1. 外边距：元素距上级元素或相邻元素的距离  
	margin-left/right/top/bottom 
	margin: 10px;
	margin: 20px上下 40px左右;
	margin: 0 auto;
	margin: 10px上 20px右 30px下 40px左
- 块级元素 外边距全部生效  行内元素 左右生效 上下不生效  
- 相邻元素上下外边距取最大值   相邻元素左右外边距 取和 
2. 边框
3. 内边距



  


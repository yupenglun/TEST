##课程回顾：
1. CSS 层叠样式表   美化页面 
2. 引入方式：三种 
- 内联：在标签的 style属性中填写 不能重用  优先级最高
- 内部：在head里面的Style标签中写  可以在当前页面中复用 不能复用其它页面
- 外部：创建一个css的文件 在head里面的link标签引入  <link rel="stylesheet" href="a.css">
3. 优先级： 内联最高    后执行会覆盖先执行的
4. 选择器：
- 基础选择器： 标签名选择器    id选择器 #id{}  类选择器 .class{}
- 属性选择器： 基础选择器[属性名='值']{}
- 派生选择器： 基础选择器1 基础选择器2{}
- 子元素选择器： 基础选择器1>基础选择器2{}
- 分组选择器： h1,span,div,#abc,.m{}
- 伪类选择器： a:visited：访问过的状态  a:link：未访问状态  a:hover：悬停状态 a:active：点击时状态
- 任意元素选择器：*{}
5. 元素宽高属性：  width/height 
6. 颜色：1.颜色名称  2. 6位16进制 #00ff00 3. 3位16进制 #0f0 4. rgb(255,0,0) 5. rgba(0,0,255,0.5)
7. 背景图片：background-image:url(路径)  大小 background-size:100px 200px  设置是否重复 background-repeat：no-repeat  
设置图片位置 backtround-position:  right center;    left right top bottom center, 通过百分比控制
8. 盒子模型： 外边距 边框 内边距
元素所占宽度： 左外边距+左边框+左内边距+元素宽度+右内边距+右边框+右外边距
- 外边距：元素距相邻元素或上级元素的距离
	margin-left/right/top/bottom
	margin:10px; 四个方向都是10px
	margin:10px 20px 上下10px 左右20px
	margin:0 auto 水平居中
	margin:10px 20px 30px 40px 上右下左

###边框
	/* border: 15px groove red; */
		border-bottom: 1px solid blue;
		border-top: 5px solid blue;
		border-left: 3px solid purple;
		border-right: 10px solid red;
		设置圆角 值越大 越圆
		border-radius:10px;

- 块级元素：四个边框全部生效，四个边框都会影响元素所占的范围
- 行内元素：四个边框全部生效，上下不影响元素所占高度 左右影响元素所占宽度
###内边距

		padding-left: 30px;
		padding-top: 50px;
		padding-bottom:20px;
		padding-right:40px;
		padding: 10px;

- 内容到边框的距离称为内边距
- 如果移动元素文本内容，只能通过元素添加内边距移动
- 如果移动元素的子元素，可以通过设置父元素的内边距（改变父元素的宽高），也可以设置子元素的外边距

- 块级元素的内边距全部生效 会影响元素所占宽高
- 行内元素的内边距全部生效 只会影响元素的所占宽度 不会影响高度

####块级元素和行内元素关于盒子模型的总结
1. 块级元素： 可以设置宽高，外边距全部生效 会影响所占宽高，边框全部生效 会影响所占宽高，内边距全部生效 会影响所占宽高

2. 行内元素： 不可以设置宽高 由内容决定，外边距左右生效 上下不生效，边框全部生效 左右影响宽度 上下不影响高度， 内边距全部生效 左右影响宽度 上下不影响高度。

###文本相关属性 

		/* 文本对齐方式 center、left、right*/
		text-align: center;
		/* 文本修饰
		 none 没有修饰 
		underline：下划线
		overline：上划线
		line-through:删除线
		*/
		text-decoration: line-through;
		/* 文本颜色  */
		color: red;
		/* 文本阴影 第一个参数是阴影颜色 
		第二三个是x和y轴的偏移位置 
		最后一个值是模糊程度越小越清晰 0是不模糊 */
		text-shadow:#0f0 5px 5px 1px;

		/* 通过设置行高让文本上下居中 */
		line-height: 30px;
###字体相关属性
		
		/* 字体大小 单位像素 */
		font-size: 20px; 
		/* 字体加粗 bold 
		bolder normal普通粗细 lighter 比普通细一些 */
		/* font-weight: bold; */
		font-family: "黑体"; 
		/* 字体样式  斜体*/
		font-style: italic; 

###回顾上午内容：
1. 边框    块级：都生效 都影响宽高    行内：都生效 影响宽度 不影响高度
border-radius: 值越大 越圆

2. 内边距： 块级：都生效 都影响宽高    行内：都生效 影响宽度 不影响高度
3. 外边距   块级： 都生效 都影响宽高  行内：上下不生效
4. 文本：  文本水平对齐：text-align:center/left/right  text-decoration:none/underline/overline/line-through  ,color,text-shadow:颜色 x偏移 y偏移 模糊度 值越小越清晰  line-height行高
5. 字体： font-size  font-weight  font-family font-style


###学子商城首页练习 代码参见 demo04.html

###Overflow 溢出 
- 控制超出父元素的内容是否显示时 使用该属性
		/* hidden：超出范围不显示
		  visible:超出显示（默认）
		  scroll: 超出滚动显示 */
		overflow: hidden;

###display 显示
- 控制元素的显示方式
1. block： 块级元素的默认值
2. inline：行内元素的默认值
3. inline-block:行内块

###把超链接a标签改成查看详情的样式步骤：
1. 把a标签显示方式改成行内块（因为a标签是行内元素 改成行内块才能改宽高）
2. 修改元素的宽高和背景颜色
3. 修改元素的字体大小和字体颜色
4. 去掉文本的下划线
5. 文本左右居中
6. 文本上下居中
7. 加圆角
- 实现代码：

		a{
		display: inline-block;
		width: 132px;
		height: 40px;
		background-color: #0aa1ed;
		color: white;
		text-decoration: none;
		font-size: 20px;
		text-align: center;
		line-height: 40px;
		border-radius:5px;
		}

###day01
1. html结构：

		<!DOCTYPE HTML>
		<html>
		<head></head> 给浏览器看
		<body></body> 给用户看的
		</html>
2. head里面的内容：
- meta ： charset 控制页面解析的字符集   keywords 关键字
- title： 设置页面标题
3. h1-h6   p    hr
4. 列表标签： 三种  层级列表  无序 有序
- dl  dt  dd 
- ul  li
- ol li
5. 特殊字符     空格： &nbsp;   小于号 &lt; 大于号 &gt; 换行<br>
6. 图片  img 属性  src 路径    alt  title  

###day02
1. 图像地图 map 属性 id和name  子标签  area  属性：shape （circle和rect） coords  href 路径   <img usemap="#id">
2. 超链接 a  href     <a id name></a>  <a href="#id/name">回到顶部</a>
3. 表格  table tr td th thead tbody tfoot caption 属性：border  cellspacing  cellpadding  rowspan  colspan
4. 表单form  文本框text  密码框password  单选radio 多选checkbox 隐藏hidden 日期date 文件file 按钮button/submit/rest 
下拉选<select><option></option>  文本域<textarea></textarea>

###day03-04
1. CSS 层叠样式表 美化页面
2. 引入方式： 1. 内联 2. 内部 3.外部
- 内联 ：  在元素的style属性中  不能复用  优先级最高
- 内部： 在head里面style标签中写  当前页面中可以复用 不能复用其它页面
- 外部 ： 创建css文件 在head中的link标签中引入 <link rel="stylesheet" href="a.css"> 可以多个页面复用
3. 选择器：
- 标签名   id选择器   类选择器   基础选择器
- 属性选择器    基础选择器[属性名='值']
- 派生选择器   基础选择器1 基础选择器2{}
- 子元素选择器 基础选择器1>基础选择器2{}
- 分组选择器  h1,span,div,#abc,.mm{}
- 伪类选择器   visited 访问过  link未访问  hover悬停 active点击时
- 任意元素选择器  *{}
4. 颜色    颜色名 6位16进制  3位16进制  rgb rgba 
5. 盒子模型：
- 外边距： 元素和相邻元素或上级元素的距离 行内：上下不生效
- 边框 ：  行内：都生效  但是上下不影响所占高度
- 内边距 内容距离边框的距离    行内： 都生效  但是上下不影响所占高度
6. 背景图片：  
backgroud-image:url("路径")
backgroud-size:100px 200px
backgroud-repeat: no-repeat
backgroud-position: 横向 纵向，百分比控制   left right top bottom center

7. 文本相关 水平对齐  text-align: left/center/right  color  行高line-height   文本修饰： text-decoration: none/underline/overline/line-through text-shadow: 颜色 x偏移 y偏移 模糊度
8. 字体   font-size      font-weight：bold   font-family  font-style:italic
9. 溢出   overflow： hidden visible scroll
10. display： block 块级  inline 行内   inline-block 行内块



 










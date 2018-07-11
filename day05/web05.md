###课程回顾
####day01
1. html格式  

		<!DOCTYPE html>
		<html>
			<head></head>
			<body></body>
		</html>
2. head里面  meta: charset控制字符集  keywords  ,title 
3. body： h1-h6  p  hr
4. 列表标签： 
- 定义列表：dl dt dd   无序列表：ul li  有序： ol li
5. 分区标签： div 和 span
6. 元素分类： 块级元素：独占一行 包括div p h1-h6 h6 和 行内元素：span i和em b和strong u del和s
7. 特殊字符： 空格 &nbsp;   小于号 &lt;  大于号 &gt;  换行 <br>
8. 图片  <img> 属性： alt ，src 路径 title 
####day02
1. 图片地图 map 属性 id和name  子标签  area 属性 shape形状：rect circle  coords坐标  href：
2. 超链接 a   href    锚点  <a id name><a>  <a href="#id">
3. 表格 table tr td  th thead tbody tfoot caption，table属性：border cellspacing（单元格间距 单元格和外边框的距离）  cellpadding(内容与单元格的间距) 跨行rowspan 跨列 colspan
4. 表单： 文本框 密码框 单选 多选 下拉选 文本域 隐藏域 日期 文件 按钮
	
		<input type="text/password/radio/checkbox/hidden/date/file/button/submit/reset"> <textarea>  <select><option></option></select>
####day03-day04
1. css: 层叠样式表  美化页面
2. 引入方式：1. 内联 2. 内部  3. 外部
- 内联：直接在标签的style属性中写样式代码  不能复用 优先级最高
- 内部：在head中写style标签   可以在当前页面中复用
- 外部： 在单独的css文件中写样式代码 通过head中 link标签引入 <link rel="stylesheet" href="a.css">
3. 优先级 内联优先级最高， 后执行的覆盖前面执行的效果
4. 选择器：
- 基础选择器：标签名  id  #id{}  类  .class{}
- 属性选择器： 基础选择器[属性名='值']{}
- 派生选择器：  基础选择器1 基础选择器2 基础选择器3{}
- 子类选择器：基础选择器1>基础选择器2>基础选择器3{}
- 分组选择器： h1,span,div,#abc,.abcd{}
- 伪类选择器： visited(访问过的) link(未访问) hover（鼠标悬停） active(点击时)
- 任意元素选择器：  *{}
5. 常用属性
- 宽高： width height 块级可以修改  行内不能修改
- 颜色： 5种  颜色名  6位16   3位16  rgb（）  rbga()
- 背景图片：
backgroud-image:url("路径")
backgroud-size: 20px 30px;
backgroud-repeat: no-repeat
backgroud-position: 横向 纵向  百分比，left right top bottom center
6. 盒子模型
- 外边距： margin 元素与相邻元素或上级元素的距离  
margin：10px  上下左右 10px
margin：10px 20px 上下10px  左右20px
margin: 0 auto   水平居中
margin：10px  20px 30px 40px 上右下左
- 边框： border  边框会占用元素的显示范围 
- 内边距：padding 元素内容距边框的距离

7. 盒子模型总结：
- 块级元素： 所有都生效 并且都影响元素所占宽高
- 行内元素： margin 左右生效 上下不生效  border 都生效 上下不影响所占高度， padding 都生效  上下不影响所占高度 

8. 文本相关
	text-align: left/right/center
	text-decoration: none/underline/overline/line-through
	color
	line-heigth: 行高 可以通过行高实现垂直居中 （行高的值等于元素的高度 则文本垂直居中）
	text-shadow: 颜色 x偏移 y偏移 模糊度 
9. 字体相关
	font-size
	font-weight bold
	font-family
	font-style italic
10. 溢出 overflow：visible（超出显示）/hidden(超出不显示)/scroll（超出滚动显示）
11. display：block（块级元素默认）inline(行内元素默认值) inline-block(行内块 可以修改宽高也可以显示在同一行)



###定位
####position定位
#####静态定位（文档流定位） position:static（默认值）  
	块级元素从上到下，行内元素从左向右

#####相对定位 position:relative
	
	不脱离文档流，上下左右偏移相对于元素的初始位置
- 场景：当元素需要从当前位置偏移 并且不希望其它元素跟着移动的时候
#####绝对定位 position:absolute
	
	元素脱离文档流，上下左右偏移相对于？ 1. 相对于窗口（祖先元素中没有做过非static定位的元素 ）2. 相对于祖先元素（祖先元素做过非static定位，并且是关系最近的 ）
- 场景：当元素需要层叠显示的时候，元素需要脱离文档流，并且元素会随着内容位置的改变而改变
#####固定定位 position:fixed
	元素脱离文档流，上下左右偏移相对于？ 相对于窗口左上角
- 场景： 元素位置相对于窗口，并且不会随着内容位置而改变

####浮动定位 

	元素脱离文档流，元素可以在当前所在行内左侧或右侧浮动，当撞到父元素边框或另一个浮起来的元素时停止
- 如果一行装不下会自动换行，换行时注意有可能会被卡住
- 如果有浮动元素，后面的元素会顶上去，如果不想顶上去可以在元素里面添加clear属性 禁止元素左右两侧出现浮动元素
- 场景：当多个纵向排列的元素 需要变成横向排列时 使用浮动定位
- 如果元素内部的所有子元素全部浮动，此时高度则为0 边框会出现一条线的情况，可以通过给父元素添加overflow：hidden解决此问题

####行内元素对齐方式

		/* 垂直对齐方式 
		top: 上对齐
		bottom：下对齐
		middle：中间对齐
		baseline：基线对齐（默认）
		*/
		vertical-align: baseline;

###CSS的三大特性
1. 继承性：子元素可以继承父元素的部分属性，只能继承color/font-开头/text-开头/line-开头这些属性，不仅仅子元素可以继承所有的后代元素都可以继承

2. 层叠性：通过不同的选择器 可以多次指向同一个元素，如果设置的属性不同则全部生效，如果作用的相同属性则依据下面的优先级控制哪一个生效

3. 优先级：
- 是否直接选中：继承相当于是间接选中，直接选中优先级高
- 如果是相同选择器：后执行的生效
- 如果是不同选择器：作用范围越小 优先级越高， 优先级：id>class>标签名>继承>元素默认效果

- 继承性中 超链接<a> 字体颜色 下划线不会受继承影响，h1-6 字体大小不受继承影响





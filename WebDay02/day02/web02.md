##课程回顾：
1. html页面结构

		<!DOCTYPE html>
		<html>
			<head>
			</head>
			<body>
			</body>
		</html>
2. head里面的内容
	
		-meta： charset 字符集  name="keywords" content="a,b,c"

		-title: 指定页面的标题

3. body里面的内容 给用户看的内容写在这里面

- h1-h6 标题    align="center/left/right"
- p 段落   上下有空行
- hr  水平分割线
- 列表： 定义列表（层级列表）， 无序列表，有序列表

		<dl>
			<dt>标题</dt>
			<dd>数据内容</dd>
			<dt>标题</dt>
			<dd>数据内容</dd>
		</dl>

		<ul type="circle">
			<li>列表项</li>
			<li>列表项</li>
			<li>列表项</li>	
		</ul>

		<ol type="I" start="3">
			<li>列表项</li>
			<li>列表项</li>
			<li>列表项</li>	
		</ol>

		<ul>
			<li>列表项一</li>
			<li>列表项一</li>
				<ol>
					<li>列表项二</li>
					<li>列表项二</li>
				</ol>
			<li>列表项一</li>	
		</ul>
4. 分区标签
- div: 独占一行
- span: 共占一行
- header article footer
5. 元素分类
- 块级元素：独占一行的元素，div p h1-6  hr
- 行内元素：共占一行的元素，span i和em b和strong u del和s 
6. 特殊字符
		
		- 空格  &nbsp;
		- <   &lt;
		- >   &gt;
		- 换行  <br>
7. 图片标签： img
	常见属性： 
- alt:图片不显示的时候显示的文本
- src: 图片的路径  包括相对路径和绝对路径 http://www.baidu.com/ab.jpg
- title: 鼠标悬停的时候显示的内容
- width/height: px像素   %百分比  只设置宽度 高度会按照原始比例缩放
- 图片类型： jpg  png  gif

###图像地图

- 什么是图像地图：可以将图片的某个区域作为可以点击的连接

- 使用方式：
	    <img src="../imgs/k.jpg" width="400px" 
    		usemap="#mymap">
    	<!--shape：表示形状  
    	coords:表示坐标 前两个值是圆心坐标 最后一个是半径
    	href:连接地址
    	-->  <!-- area:区域 -->
    	<map name="mymap" id="mymap">
    		<area shape="circle" 
    		coords="150,100,50" href="../imgs/2.gif">
    		<!-- rect:矩形 -->
    		<area shape="rect" 
    		coords="50,50,150,150" href="http://www.tmooc.cn">
    	</map>
- map中name和id属性：表示地图的唯一标示，把地图给到图片的时候使用
- shape：表示形状 circle和rect
- coords：表示坐标 圆形：圆心坐标和半径   矩形：两个对角线的点的坐标
- href:连接地址，可以相对路径，也可以绝对路径，href可以指向的内容有：1. 指向新的图片 2. 指向一个新的页面 3. 指向非图片任意文件 会自动下载


###练习：页面中添加一张图片500px*500px 当点击图片左上角区域的时候页面跳转到 http://doc.tedu.cn，点击图片中间圆形区域跳转到一张新的图片

###超链接 <a></a>
- 常用属性：
1. href: 连接地址，可以相对路径，也可以绝对路径，href可以指向的内容有：1. 指向新的图片 2. 指向一个新的页面 3. 指向任意文件 如果浏览器不能直接打开则会自动下载
2. target="_blank" 跳转到新的页面

- 锚点的使用方式： 先通过a标签创建一个锚点<a id="a" name="a"><a> 通过另外一个a标签跳转到锚点所在的位置 <a href="#a">跳转</a>
### 表格 <table>
- 常见属性：
	
	    border:表示外边框的粗细默认值为0
    	cellspacing:单元格间距和单元格距外边框的距离
    	cellpadding:内容与单元格边框的距离


###内容回顾：
1. 图像地图 map 属性 name 和id   
- 子标签 area 属性 shape形状（circle,rect） coords 坐标 
- <img usemap="#id"> 
2. 超链接 a 
- 属性： 
href：路径  相对路径和绝对路径  内容：图片 页面  文件
target="_blank": 跳转到新的页面
- 锚点     

   		<a id  name></a> <a href="#id/name">
3. 表格 table   tr   td   
属性：border 边框的粗细   cellspacing：单元格间距和距离外边框的距离 cellpadding：单元格内容距单元格的距离 colspan:跨列    rowspan：跨行

###课程表练习 代码参见demo03.html

####表格分组

- thead: 头分组
- tbody： 体分组
- tfoot: 脚分组
- 分组标签没有显示效果，提高代码可读性

- th: table header  表头  字体会加粗
- caption:  表格标题 内容会自动居中显示在表上面

	    <table border="1" align="center">
    		<caption>订单列表</caption>
    		<thead>
    			<tr>
    				<th>编号</th>
    				<th>名称</th>
    				<th>价格</th>
    			</tr>
    		</thead>
    		<tbody>
    			<tr>
    				<td>1</td>
    				<td>键盘</td>
    				<td>380</td>
    			</tr>
    			<tr>
    				<td>2</td>
    				<td>鼠标</td>
    				<td>120</td>
    			</tr>		
    		</tbody>
    		<tfoot>
    			<tr>
    				<td colspan="2">合计：</td>
    				<td>500元</td>
    			</tr>	
    		</tfoot>
    	</table>
    

###表单 
- 什么是表单： 在浏览器中获取用户输入的内容传递给服务器时 一般使用的都是表单

- 学习表单主要学习的是和表单结合使用的各种控件，包括：文本框，密码框，单选，多选（复选框），下拉列表，文件选择，时间选择，按钮

- 文本框： name：数据提交到服务器时，告诉服务器文本框值的含义
	placeholder：占位文本  value：默认值  maxlength：最大字符长度 readonly:只读
		
		用户名：<input type="text" name="username" 
		placeholder="说点儿什么。。。" value="abc" 
		maxlength="5" readonly="readonly" >
- 密码框：

		密码:<input type="password">

- 单选框：

		性别:<input type="radio" name="gender" value="男">男
		<input type="radio" name="gender" value="女">女

- 多选（复选框）

		兴趣爱好：<input type="checkbox" name="hobby" value="lq">打篮球
		<input type="checkbox" name="hobby" value="wz">王者农药
		<input type="checkbox" name="hobby" value="py">找异性做朋友
		<input type="checkbox" name="hobby"
		value="sing" id="cg"><label for="cg">唱歌</label>

- 标签label：如果想实现点击文本让对应的控件响应 可以使用label标签

		<input type="checkbox" name="hobby"
		value="sing" id="cg"><label for="cg">唱歌</label>

- 文件选择的控件：用于上传文件

		靓照:<input type="file" name="pic">

- 日期选择控件： 

		生日:<input type="date" name="birthday">
- 隐藏域:当需要提交一些用户看不见的信息的时候使用隐藏域

		<input type="hidden" name="id" value="3424">
- 文本域：需要输入多行文本数据的时候使用 

		个人简介：<textarea rows="3" cols="20" 
		name="intro">这家伙很懒。。。。</textarea>

###下拉选

		所在城市:<select name="city">
			<option>请选择</option>
			<option value="bj">北京</option>
			<option value="sh">上海</option>
			<option value="gz">广州</option>
		</select>

####按钮 

		<input type="submit" value="注册">
		<input type="reset">
		<input type="button" value="自定义按钮">

##课程回顾：
1. 图像地图 map 属性 name和id 子标签  area 属性：shape（circle rect） coords（坐标） href 路径  图片  页面  下载   <img usemap="#id"
2. 超链接 a  属性  href  target="_blank"   <a id name></a>   href="#id" 
3. 表格 table tr td  th  thead tbody tfoot caption  属性：border cellspacing 单元格间距和外边框的距离 cellpadding 内容和单元格的距离 
rowspan clospan  bgcolor   bordercolor
4. 表单：input type=? 文本框 密码框 单选 多选  文件  日期 隐藏  按钮 
label: 和 单选 复选结合使用
下拉 文本域
	
	    <select name="">
	    	<option value=""></option>
	    </select>

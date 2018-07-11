###课程回顾
1. 运算符：
- == （先统一类型 再比较）和 === （先比较类型 如果相等再比较内容） 
- typeof  获取变量的类型   typeof 66+6  'number6'
- 两个数相除 会自动转换整数和小数  
2. 语句 
- if里面如果不是布尔会自动转换
- for里面的int改成var 
3. 函数 
- function 函数名(name,age){
	return 'abc';
}
- var 函数名 = function(name,age){
	return 'abc';
}
4. 页面元素相关的函数
- 获取页面中的元素对象 

		var x = document.getElementById("id");
- 获取文本框对象中的文本内容

		input.value="abc";
- 给元素添加文本内容
		x.innerText="aaa";  
- 给元素添加HTML内容 
		x.innerHTML="<h1>aaa</h1>";

##常用Api
###String相关内容
##### 创建字符串的方式
- var str1 = "abc"('abc');
- var str2 = new String("abc");
####字符串转换大小写
- 转大写   toUpperCase()   "nba".toUpperCase()  = "NBA"
- 转小写   toLowerCase()   "NBA".toLowerCase() = "nba"
####获取字符串中某个位置的字符
- charAt(index)  获取index位置的字符  index从0开始
####获取字符串中某个字符的位置
- indexOf(str) 获取字符串在字符串中出现的第一个位置
- lastIndexOf(str) 出现的最后一个位置
####截取字符串
- substring(start,[end])  从0开始   end可以省略，没有end则截取到最后
####替换字符串
- replace(old,new) old：被替换的内容   new：替换后的内容

var s = "百度";
var a = "<a href='http://www.baidu.com'>[info]</a>";
a.replace("[info]",s);
#### 分割字符串
- split(str)  通过str把字符串分割成多个字符串 结果存到一个数组中 

###Number 
- toFixed(n)  把数值转换成字符串 并且保留小数点后n位 并且四舍五入

###数组相关的api

		//1. 创建数组的两种方式    创建出来的数组是一样的
		//数组中可以添加任意类型的数据
		var arr1 = ["abc",18,true];
		var arr2 = new Array();//创建一个空的数组
		//2. 往数组中添加数据
		arr2.push("李白");
		arr2.push(20);
		//对话框中显示数组内容
		//alert(arr1);
		//alert(arr2);
		//3. 修改数组的长度
		//arr1.length=1;
		//alert(arr1); // abc
		//4. 从数组中获取数据
		//alert(arr2[0]);//李白 
		//5. 删除数组中的数据 长度没有发生改变  
		//delete arr1[1];
		//alert(arr1[1]);
		//6. 数组内容反转
		/* var arr3 = [1,2,3];
		arr3.reverse();
		alert(arr3); */
		//7. 数组排序 
		var arr4 = [1,12,3,20,28,5,52];
		//sort()函数的排序规则，是将内容以字符串的形式进行排序
		//先比较第一个字符的字符编码，进行升序排序，如果相同则
		//比较第二个，以此类推
		//arr4.sort();
		//alert(arr4);
		//如果 需要让数组中的内容以数值形式升降序，
		//则需要自定义排序函数
		/* function sortfn(a,b){
			//如果需要升序
			//return a-b;
			//如果需要降序
			return b-a;
		}
		arr4.sort(sortfn);
		alert(arr4); */
		//如果数组中存放的是学生对象类型，
		//按照学生年龄升序排序 则return a.age-b.age
		//按照学生数学成绩降序排序 则 return b.math-a.math
		//匿名函数的写法
		/* arr4.sort(function(a,b){
			return a-b;//升序
		});
		alert(arr4); */
		//通过 for循环遍历数组 
		for(var i=0;i<arr4.length;i++){
			alert(arr4[i]);
		}
	

实现步骤：
1. 搭建界面 两个文本输入框，一个按钮，和一个装内容的div
2. 给按钮添加点击事件函数addfn()，
3. 声明addfn()函数 在函数中先得到连个文本输入框，把第二个文本输入框的内容作为分隔第一个文本框的字符串， 分隔完之后得到一个装着关键字信息的数组arr
4. 准备一个字符串str 里面先写上一个ul标签的开始 
5. 遍历arr数组 遍历的时候创建li 在li里面添加a标签 在a标签里面添加 当前遍历的数组中的关键字，把创建好的li追加在str字符串的后面
6. 遍历完之后 在str后面添加ul标签的结束 
7. 把str的内容添加到div中 搞定!






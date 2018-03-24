# 1、基础





### 1.1变量

### 1.2权限


### 1.3 流程控制
```
    for(item in collection){
        
     }
     
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    
    
```
   参考[contorl-flow](https://kotlinlang.org/docs/reference/control-flow.html)
    




# 2、oop

### 2.1 class 结构
```
    基础结构
    class name{
    }
    
```
### 2.2 构造函数
```
    class name constructor(name:Unit....)等价
    class name(name:Unit....)
    构造函数初始化
     class name(name:String){
        private var mName:String = ""//必须初始化
        init{
            mName = name
        }
     }
     
```

### 2.3 继承
```text
    父类
    open class parent(name:String){
        private var mName:String = ""//必须初始化
        init{
            mName = name
        }
    }
    子类
    class child(name:String):parent(name){
        
        
    }
```
    
### 2.4 数据类(pojo) 
```
        data class name(val date: Date, val temperature: Float, val details: String)
        复制一个数据类
        var name1 = name(Date(),27.5f,"good")
        var name2 = name1.copy(temperature = 30f)
        
```
    
# 线程

# io 

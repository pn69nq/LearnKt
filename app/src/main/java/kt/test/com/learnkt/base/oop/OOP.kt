package kt.test.com.learnkt.base.oop

/**
 * <pre>
 *     author : chenzengqiang
 *     e-mail : chenzengqiang@hongdoujiao.com
 *     time   : 2018/03/05
 *     desc   :
 *     version: 1.0
 * </pre>
 *
 * 1、定义成员变量
 *
 *
 * 2、构造函数
 *      主构造函数
 *      在类后面加private(权限) constructor(xx:type...)
 *      在init{
 *
 *      }中初始化
 *
 *      次构造函数
 *      在类中定义constructor(xx:type...){
 *          this.type = type
 *      }
 *      如果已经存在主的构造函数，则次构造函数需要委托主构造函数
 *      ：主constructor(xx:type) 次构造函数参数列表顺序要跟主构造方法一致
 *
 *
 * 3、继承
 *
 *
 */
class OOP constructor(name:String)  {

    private var name:String = ""
    private var password:String = ""
    private var id:Int = 0

    private val TAG:String = "test"

    init {
        this.name = name;
    }


    /**
     *
     */
    constructor(name: String,password:String):this(name) {
        this.password = password
    }



}
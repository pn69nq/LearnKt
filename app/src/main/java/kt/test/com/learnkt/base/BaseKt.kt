package kt.test.com.learnkt.base

import android.util.Log

/**
 * <pre>
 *     author : chenzengqiang
 *     e-mail : chenzengqiang@hongdoujiao.com
 *     time   : 2018/03/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */


fun funTest(x: Int): String {
    Log.e("test", x.toString()+"")
    return x.toString()+""
}

/**
 * 
 * @author: Administrator
 * @time: 2018/3/5-12:29
 * @desc:
 * 
 */
fun funTest2(){
    var v:Int = 0;
    var d:Double = 1.9
    v = d.toInt();

}


/***
 *  流程控制 ***
 *
 */
fun flowControl(a:Int,b:Int){

    var max = a
    if (a < b) max = b

// With else
//    var max: Int
//    if (a > b) {
//        max = a
//    } else {
//        max = b
//    }

// As expression
//    val max = if (a > b) a else b

    var x:Int = 1;
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}


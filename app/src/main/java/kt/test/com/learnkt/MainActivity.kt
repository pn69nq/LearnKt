package kt.test.com.learnkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kt.test.com.learnkt.base.funTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        funTest(6666)
    }


}

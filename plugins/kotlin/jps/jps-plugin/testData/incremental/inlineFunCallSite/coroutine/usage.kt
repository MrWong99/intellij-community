package usage
import kotlin.coroutines.*

fun async(x: suspend Controller.() -> Unit) {
    x.startCoroutine(Controller(), object : Continuation<Unit> {
        override fun resume(value: Unit) {}

        override fun resumeWithException(exception: Throwable) {}
    })
}

class Controller {
    suspend fun step(param: Int) = CoroutineIntrinsics.suspendCoroutineOrReturn<Int> { next ->
        next.resume(param + 1)
    }
}

fun bar() {
    async {
        val result = step(1)
        inline.f(result)
    }
}

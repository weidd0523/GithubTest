package com.github.weidd0523


/**
 * 简单的加法计算器
 */
class Calculator {

    /**
     * 两个整数相加
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 两个浮点数相加
     */
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    /**
     * 多个整数相加
     */
    fun addAll(vararg numbers: Int): Int {
        return numbers.sum()
    }

    /**
     * 多个浮点数相加
     */
    fun addAll(vararg numbers: Double): Double {
        return numbers.sum()
    }
    /**
     * 两个整数相减
     */
    fun subtraction(a: Int, b: Int): Int {
        return a - b
    }

    /**
     * 两个浮点数相减
     */
    fun subtraction(a: Double, b: Double): Double {
        return a - b
    }



    companion object {
        /**
         * 静态方法：快速相加两个数
         */
        @JvmStatic
        fun quickAdd(a: Int, b: Int): Int {
            return a + b
        }
    }
}
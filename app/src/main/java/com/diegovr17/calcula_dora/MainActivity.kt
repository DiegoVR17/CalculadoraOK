package com.diegovr17.calcula_dora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ban = 0
        var ban1 = 0

        tvOne.setOnClickListener {

            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("1", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("1", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("1", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("1", "c")
                }
                else{
                    appendOnExpression("1", "a")
                }
            }

        }
        tvTwo.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("2", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("2", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("2", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("2", "c")
                }
                else{
                    appendOnExpression("2", "a")
                }
            }
        }
        tvThree.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("3", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("3", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("3", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("3", "c")
                }
                else{
                    appendOnExpression("3", "a")
                }
            }
        }
        tvFour.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("4", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("4", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("4", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("4", "c")
                }
                else{
                    appendOnExpression("4", "a")
                }
            }
        }
        tvFive.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("5", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("5", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("5", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("5", "c")
                }
                else{
                    appendOnExpression("5", "a")
                }
            }
        }
        tvSix.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("6", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("6", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("6", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("6", "c")
                }
                else{
                    appendOnExpression("6", "a")
                }
            }
        }
        tvSeven.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("7", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("7", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("7", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("7", "c")
                }
                else{
                    appendOnExpression("7", "a")
                }
            }
        }
        tvEight.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("8", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("8", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("8", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("8", "c")
                }
                else{
                    appendOnExpression("8", "a")
                }
            }
        }
        tvNine.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("9", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("9", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("9", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("9", "c")
                }
                else{
                    appendOnExpression("9", "a")
                }
            }
        }
        tvZero.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression("0", "a")
            }
            else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()){
                if (ban1 == 1) {
                    appendOnExpression("0", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression("0", "b")
                }
            }
            else{
                if(ban == 1){
                    appendOnExpression("0", "c")
                }
                else{
                    appendOnExpression("0", "a")
                }
            }
        }

        tvDot.setOnClickListener {
            if (tvResult.text.isEmpty() and tvExpression.text.isEmpty()) {
                appendOnExpression(".", "a")
            }
             else if(tvResult.text.isNotEmpty() and tvExpression.text.isNotEmpty()) {
                if (ban1 == 1) {
                    appendOnExpression(".", "a")
                    if (tvExpression.text.toString() != "+") {
                        ban1 = 1
                    }
                    else{
                        ban1 = 0
                    }
                }
                else{
                    appendOnExpression(".", "b")
                }
            }
            else{
                if(ban == 1){
                appendOnExpression(".", "c")
                }
                 else{
                appendOnExpression(".", "a")
                }
            }
        }


        tvPlus.setOnClickListener {
            ban = 0
            ban1 = 1
            (appendOnExpression("+", "a")) }
        tvMinus.setOnClickListener {
            ban = 0
            ban1 = 1
            (appendOnExpression("-", "a")) }

        tvMul.setOnClickListener {
            ban = 0
            ban1 = 1
            (appendOnExpression("*", "a")) }

        tvDivide.setOnClickListener {
            ban = 0
            ban1 = 1
            (appendOnExpression("/", "a")) }

        tvClose.setOnClickListener { (appendOnExpression(")", "a")) }
        tvOpen.setOnClickListener { (appendOnExpression("(", "a")) }

        tvClear.setOnClickListener {
            tvExpression.text = ""
            tvResult.text = ""
            ban = 0
        }

        tvBack.setOnClickListener {
            ban = 0
            val string = tvExpression.text.toString()
            if (string.isNotEmpty()) {
                tvExpression.text = string.substring(0, string.length - 1)
            }
            tvResult.text = ""
        }

        tvEquals.setOnClickListener {
            ban = 1
            ban1 = 0
            try {
                val expression = ExpressionBuilder(tvExpression.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble()) {
                    tvResult.text = longResult.toString()
                    tvExpression.text = tvResult.text
                } else {
                    tvResult.text = result.toString()
                    tvExpression.text = tvResult.text
                }
            } catch (e: Exception) {
                Log.d("Exception", "message: " + e.message)

            }
        }

    }

    private fun appendOnExpression(string: String, string1: String) {

        if (string1 == "a") {
            tvExpression.append(string)
        }
        else if (string1 == "b") {
            tvExpression.text = ""
            tvExpression.append(tvResult.text)
            tvResult.text = ""
        }
        else {
            tvResult.text = ""
        }
    }
}



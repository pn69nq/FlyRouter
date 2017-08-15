package com.flyman.flyrouter.compile;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;

import javax.lang.model.element.Modifier;

/**
 * Created by jjfly on 17-8-15.
 */

public class JavaPoetHelper {


    /*****************************************************
     * 方法部分
     *
     **********************************************/


    //构造函数
    public static MethodSpec publicConstructor() {
        return MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .build();
    }

    //构造函数
    public static MethodSpec privateConstructor() {
        return MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PRIVATE)
                .build();
    }


    //流程控制
    public static MethodSpec.Builder forFlow(String methodName, int from, int to, CodeBlock codeBlock){
        return MethodSpec.methodBuilder(methodName)
                .addCode("for (int i = $L; i < $L; i++){ \n", from, to)
                .addCode(codeBlock)
                .addCode("}\n")
                ;
    }

    //范型



















}

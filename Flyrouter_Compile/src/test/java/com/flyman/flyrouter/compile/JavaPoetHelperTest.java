package com.flyman.flyrouter.compile;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import org.junit.Test;

import static org.junit.Assert.*;


public class JavaPoetHelperTest {


    @Test
    public void testConstructor(){
        CodeBlock forFLowcodeBlock = CodeBlock.builder()
                .addStatement("\t System.out.println($L)","i")
                .build()
                ;

        JavaFile javaFile = JavaFile.builder("com.flyman.flyrouter.compile",
                // TypeSpec 代表一个类
                TypeSpec.classBuilder("TestClazz")
                        // 给类添加一个属性
                        .addMethod(JavaPoetHelper.privateConstructor())
                        .addMethod(JavaPoetHelper.publicConstructor())
                        .addMethod(JavaPoetHelper.forFlow("testForFlow",1,100,forFLowcodeBlock).build())
                        .build())
                .build();

        System.out.println(javaFile.toString());
    }
}
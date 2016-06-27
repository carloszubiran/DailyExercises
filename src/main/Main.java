package com.carlito;

import com.carlito.annotationAndReflection.CustomAnnotation;
import com.carlito.annotationAndReflection.UseAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

//    public static Primes primes = new Primes();
//    public static Fibonacci fib = new Fibonacci();

    public static void main(String[] args) {

        for (Field f : UseAnnotation.class.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        for (Method m : UseAnnotation.class.getMethods()) {
            System.out.println(m.getName());
        }

        for (Annotation a: UseAnnotation.class.getAnnotations()) {
            System.out.println(a);
        }

        System.out.println(Integer.toString(1));

    }

    Stack<Integer> aStack = new Stack();



}

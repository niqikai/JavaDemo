
// package com.niqikai.basic.annotation;

// import java.lang.annotation.Annotation;
// import java.lang.reflect.Field;

// /**
//  * Annotation Demo
//  */
// public class AnnotationDemo {


//     public static void main(String[] args) {
//         try {   
//             Class clazz = Class.forName("com.niqikai.basic.annotation.Student");

//             //获得类的所有有效注解
//             Annotation[] annotations =clazz.getAnnotations();
//             for (Annotation a : annotations) {
//                 System.out.println(a);
//             }
//             //获得类的指定的注解
//             Table table = (Table) clazz.getAnnotation(Table.class);
//             System.out.println(table.value());
//             //获得类的属性的注解
//             Field field = clazz.getDeclaredField("name");
//             MyFiled myFiled = field.getAnnotation(MyFiled.class);
//             System.out.println(myFiled.column() + "--" + myFiled.type() + "--" + myFiled.length());


//         } catch (Exception e) {
//             e.printStackTrace();
//         }




//     }

   
     
// }
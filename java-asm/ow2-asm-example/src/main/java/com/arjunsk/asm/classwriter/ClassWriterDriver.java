package com.arjunsk.asm.classwriter;

import java.lang.reflect.Field;

/**
 * OUTPUT
 *
 * <pre>
 * package pkg;
 * public interface Comparable extends Measurable {
 *  int LESS = -1;
 *  int EQUAL = 0;
 *  int GREATER = 1;
 *  int compareTo(Object o);
 * }
 * </pre>
 */
public class ClassWriterDriver {

  public static void main(String[] args) throws ClassNotFoundException {
    ProxyClassLoader proxyClassLoader = new ProxyClassLoader();
    Class loadedClass = proxyClassLoader.findClass("pkg.proxy.Comparable");

    // Testing out the output of Proxy Class Loader.
    System.out.println(loadedClass.getName());
    for (Field field : loadedClass.getFields()) {
      System.out.println("Field " + field.getName());
    }
  }
}

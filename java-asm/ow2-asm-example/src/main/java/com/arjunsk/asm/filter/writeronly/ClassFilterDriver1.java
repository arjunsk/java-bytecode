package com.arjunsk.asm.filter.writeronly;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

// Flow: CR --> CW --> toByteArray()
public class ClassFilterDriver1 {

  // Example 1: With classReader accepting classWriter.
  public static void main(String[] args) {

    // CW
    ClassWriter classWriter = new ClassWriter(0);

    // CR
    byte[] inputClass = new byte[1];
    ClassReader classReader = new ClassReader(inputClass);
    classReader.accept(classWriter, 0); // Reader Accepts Both ClassWriter & ClassVisitor.

    byte[] outputClass = classWriter.toByteArray(); // b2 represents the same class as b1
  }
}

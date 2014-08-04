package com.software.design.problem;
public class NestedIfExample3 {
 public void bar(int x, int y, int z) {
  if (x>y) {
   if (y>z) {
    if (z==x) {
     // 너무 복잡해!!
    }
   }
  }
 }
}
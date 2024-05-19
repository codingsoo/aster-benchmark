
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentConstantPool_ESTest extends SegmentConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue((-768), 549L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Tried to get a value I don't know about: -768
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(8, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(6, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(5, 28L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(2, 549L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(1, 20L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry(0, 0, "archive_size_hi");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Nothing but CP_METHOD can be an <init>
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(7, 910L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(6, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(5, 27L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(4, 3736);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(3, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(2, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(1, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry((-135), (-356L), "U%%`ry\"ypov");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Don't know how to handle -135
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches("^<init>.*", "UVULX:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches(".*", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray0, (String) null, "G5\u0003k!T>@@Lbw2~qC", (-784));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[2];
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, (String) null, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentConstantPool.regexMatches("^<init>.*", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentConstantPool.regexMatches("regex trying to match a pattern I don't know: ", "k");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // regex trying to match a pattern I don't know: regex trying to match a pattern I don't know: 
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex((String[]) null, (String[]) null, "U0lv5>T", "8w9Z", (-768));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[2];
      String[] stringArray1 = new String[5];
      stringArray1[3] = "yZI> ^Gp";
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray1, stringArray0, "yZI> ^Gp", "InnerClasses", 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex((String[]) null, "Kv5ai_^iC", (-1375));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassPoolEntry("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[20];
      stringArray0[0] = "";
      stringArray0[14] = "";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "", 1);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(9, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(8, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(7, 549L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(6, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        segmentConstantPool0.getValue((-1962), (-1962));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ClassFileEntry classFileEntry0 = segmentConstantPool0.getValue((-1), (-1));
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry(2647, 2647, "q%tQ.;>w]");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Nothing but CP_METHOD can be an <init>
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(1000, 1000);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Get value incomplete
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(12, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(11, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(9, 9);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // I don't know what to do with descriptors yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(8, 8);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // I don't know what to do with signatures yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(6, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(1, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ConstantPoolEntry constantPoolEntry0 = segmentConstantPool0.getConstantPoolEntry((-3484), (-1L));
      assertNull(constantPoolEntry0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        segmentConstantPool0.getConstantPoolEntry((-2420), (-780L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(11, 4, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(10, 10, "W;iX0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches("^<init>.*", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches("^<init>.*", "^<init>.*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "", (-1204));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[9];
      stringArray0[4] = "_oD6F,oj";
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray0, "_oD6F,oj", "I don't know what to do with signatures yet", (-1229));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // regex trying to match a pattern I don't know: I don't know what to do with signatures yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }
}

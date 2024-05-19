
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
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AttributeLayout_ESTest extends AttributeLayout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 3, "ACC_PUBLIC", 3);
      attributeLayout0.hashCode();
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals(3, attributeLayout0.getContext());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_PUBLIC", attributeLayout0.getLayout());
      assertEquals(3, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("P/*IlBs", 2, "P/*IlBs", 2637);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(86955L, bHSDCodec0.largest());
      assertEquals(2, attributeLayout0.getContext());
      assertEquals("P/*IlBs", attributeLayout0.getName());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 790, "", (-452), false);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: 790
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Attribute context out of range: ", 0, "Attribute context out of range: ", 0);
      attributeLayout0.setBackwardsCallCount(3175);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(3175, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("7NxaFy,_[qrpP?g", 0, "7NxaFy,_[qrpP?g", 0);
      attributeLayout0.setBackwardsCallCount((-689));
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals((-689), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K", 0, "K", 1611, false);
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertEquals("K", attributeLayout0.getLayout());
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("K", attributeLayout0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("g8RM.CP2K", 3, "", 3);
      String string0 = attributeLayout0.getLayout();
      assertEquals("", string0);
      assertEquals(3, attributeLayout0.getIndex());
      assertEquals("g8RM.CP2K", attributeLayout0.getName());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 3, "ACC_PUBLIC", 3);
      int int0 = attributeLayout0.getIndex();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(3, int0);
      assertEquals("ACC_PUBLIC", attributeLayout0.getLayout());
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals(3, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("]zMupN;9$KU", 0, "]zMupN;9$KU", (-1125), true);
      int int0 = attributeLayout0.getIndex();
      assertEquals("]zMupN;9$KU", attributeLayout0.getName());
      assertEquals("]zMupN;9$KU", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals((-1125), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 3, "ACC_PUBLIC", 3);
      int int0 = attributeLayout0.getContext();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(3, attributeLayout0.getIndex());
      assertEquals("ACC_PUBLIC", attributeLayout0.getLayout());
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K", 0, "K", 1611, false);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 0, "Exceptions", (SegmentConstantPool) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, int0);
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals("KQA", attributeLayout0.getName());
      assertEquals("KQA", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      boolean boolean0 = attributeLayout0.matches((-1473));
      assertEquals("KQA", attributeLayout0.getName());
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals("KQA", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      boolean boolean0 = attributeLayout0.matches(0);
      assertEquals(0, attributeLayout0.getContext());
      assertFalse(boolean0);
      assertEquals("KQA", attributeLayout0.getLayout());
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals("KQA", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      attributeLayout0.hashCode();
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals("KQA", attributeLayout0.getName());
      assertEquals("KQA", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "ACC_UBLIC", 0);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals(0, bHSDCodec0.getL());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "xF)_Q1l)Sa", 0);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("xF)_Q1l)Sa", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(2147483646L, bHSDCodec0.largest());
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 3, "ACC_PUBLIC", 3);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(86955L, bHSDCodec0.largest());
      assertEquals(3, attributeLayout0.getIndex());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals(3, attributeLayout0.getContext());
      assertEquals("ACC_PUBLIC", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("org.apache.commons.compress.harmony.unpack200.SegmentOptions", 0, "org.apache.commons.compress.harmony.unpack200.SegmentOptions", 1611, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals("org.apache.commons.compress.harmony.unpack200.SegmentOptions", attributeLayout0.getName());
      assertEquals("org.apache.commons.compress.harmony.unpack200.SegmentOptions", attributeLayout0.getLayout());
      assertEquals(65216L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("KQA", attributeLayout0.getLayout());
      assertEquals("KQA", attributeLayout0.getName());
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(1611, attributeLayout0.getIndex());
      assertEquals(4294967293L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 1, "", 60, false);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout((String) null, 2, "A)RkdavKssy2fN]G", 2);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("ACC_VOLATILE", 1, (String) null, 1, false);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a null layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", (-1008), "", (-1008));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: -1008
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) 1, "cp_Class", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: Kcp_ClassA
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue(905L, "Signature", segmentConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      try { 
        attributeLayout0.getValue((long) 0, "KQA", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KKQAA
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue(905L, "InnzrClasses", segmentConstantPool0);
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
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      try { 
        attributeLayout0.getValue((long) 0, "Exceptions", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KExceptionsA
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue(905L, "Deprecated", segmentConstantPool0);
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
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) (-1473), "Class: KQA", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 3, "ACC_PUBLIC", 3);
      try { 
        attributeLayout0.getValue((long) 3, "P}U", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: ACC_PUBLIC
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RKQACC_ANNOTATION", 2, "RKQACC_ANNOTATION", 2, true);
      try { 
        attributeLayout0.getValue(137L, "ACC_TRANSIENT", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: RKQACC_ANNOTATION
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RUR#H", 3, "RUR#H", 0);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 0, (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "xF)_Q1l)Sa", 0);
      String string0 = attributeLayout0.getName();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_NATIVE", string0);
      assertEquals("xF)_Q1l)Sa", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "xF)_Q1l)Sa", 0);
      int int0 = attributeLayout0.getIndex();
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("xF)_Q1l)Sa", attributeLayout0.getLayout());
      assertEquals(0, int0);
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "xF)_Q1l)Sa", 0);
      int int0 = attributeLayout0.getContext();
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals(0, int0);
      assertEquals("xF)_Q1l)Sa", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQA", 0, "KQA", 1611, false);
      try { 
        attributeLayout0.getValue((long) (-3479), (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KQA
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "xF)_Q1l)Sa", 0);
      String string0 = attributeLayout0.getLayout();
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals("xF)_Q1l)Sa", string0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "ACC_UBLIC", 0);
      String string0 = attributeLayout0.toString();
      assertEquals("Class: ACC_NATIVE", string0);
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("ACC_UBLIC", attributeLayout0.getLayout());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_NATIVE", 0, "ACC_UBLIC", 0);
      attributeLayout0.isDefaultLayout();
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("ACC_NATIVE", attributeLayout0.getName());
      assertEquals("ACC_UBLIC", attributeLayout0.getLayout());
  }
}


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
      AttributeLayout attributeLayout0 = new AttributeLayout("RuntimeInvisibleAnnotations", 3, "RURSRlYouFgj]2V", 3, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(4294967293L, bHSDCodec0.largest());
      assertEquals("RURSRlYouFgj]2V", attributeLayout0.getLayout());
      assertEquals("RuntimeInvisibleAnnotations", attributeLayout0.getName());
      assertEquals(3, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("S", 0, "S", 0);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("S", attributeLayout0.getLayout());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("S", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(1, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("V;hu[b+1WYXH%", (-526), "", (-526));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: -526
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("iQC#CDeb_DLUZ3Axb5;", 1, "iQC#CDeb_DLUZ3Axb5;", 1, false);
      assertEquals(0, attributeLayout0.numBackwardsCallables());
      
      attributeLayout0.setBackwardsCallCount(1);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("l^Li)uh", 0, "LineNumberTable", 0, false);
      attributeLayout0.setBackwardsCallCount((-1353));
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals((-1353), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RS", 0, "RS", 0);
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertEquals("RS", attributeLayout0.getLayout());
      assertEquals("RS", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("\",uilFvP`", 0, "", 0);
      String string0 = attributeLayout0.getLayout();
      assertEquals(0, attributeLayout0.getIndex());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("\",uilFvP`", attributeLayout0.getName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("7V", 0, "7V", 36);
      int int0 = attributeLayout0.getIndex();
      assertEquals(36, int0);
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("7V", attributeLayout0.getLayout());
      assertEquals("7V", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Kj2siC", 0, "K", (-1172), true);
      int int0 = attributeLayout0.getIndex();
      assertEquals("Kj2siC", attributeLayout0.getName());
      assertEquals((-1172), int0);
      assertEquals("K", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("*", 2, "", 346);
      int int0 = attributeLayout0.getContext();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("*", attributeLayout0.getName());
      assertEquals(346, attributeLayout0.getIndex());
      assertEquals(2, int0);
      assertEquals("", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", 3, "K", 3, false);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 3, (SegmentConstantPool) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K", 0, "K", 0);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue(1L, "|~QDs=v2a7$ !-", (SegmentConstantPool) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("l^Li)uh", 0, "LineNumberTable", 0, false);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(0, int0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("LineNumberTable", attributeLayout0.getLayout());
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("l^Li)uh", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("wB)", 0, "wB)", 0, false);
      boolean boolean0 = attributeLayout0.matches(427L);
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("wB)", attributeLayout0.getLayout());
      assertTrue(boolean0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("wB)", attributeLayout0.getName());
      assertFalse(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("_sbG/woB@y[PM<", 0, "_sbG/woB@y[PM<", 0, false);
      boolean boolean0 = attributeLayout0.matches((-246L));
      assertEquals(0, attributeLayout0.getIndex());
      assertFalse(boolean0);
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getLayout());
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K`1#%c,MsK$", 1, "K`1#%c,MsK$", 1);
      attributeLayout0.hashCode();
      assertEquals("K`1#%c,MsK$", attributeLayout0.getLayout());
      assertEquals("K`1#%c,MsK$", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getContext());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RS", 0, "RS", 0);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(4294967293L, bHSDCodec0.largest());
      assertEquals("RS", attributeLayout0.getName());
      assertEquals("RS", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("wB)", 0, "wB)", 0, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("wB)", attributeLayout0.getName());
      assertEquals(255L, bHSDCodec0.largest());
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("(", 0, "c<6O*{8Y,m39'5*<{X", 0, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("(", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(65216L, bHSDCodec0.largest());
      assertFalse(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("_sbG/woB@y[PM<", 0, "_sbG/woB@y[PM<", 0, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(86955L, bHSDCodec0.largest());
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 0, "Code", 0, false);
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
        attributeLayout0 = new AttributeLayout((String) null, 3, "", 0);
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
        attributeLayout0 = new AttributeLayout((String) null, 0, (String) null, (-2823));
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
        attributeLayout0 = new AttributeLayout("", 3098, "1eF#y<", (-5682));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: 3098
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K`1#%c,MsK$", 1, "K`1#%c,MsK$", 1);
      try { 
        attributeLayout0.getValue((long) 11, "ACC_PRIVATE", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: K`1#%c,MsK$
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("yI#(v c=A", 0, "KLineNumberTable", 1568);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) 12, "KLineNumberTable", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KLineNumberTable
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KP1x%c,MsK$", 1, "KP1x%c,MsK$", 1);
      try { 
        attributeLayout0.getValue((long) 11, "Field: KP1x%c,MsK$", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KP1x%c,MsK$
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("_sbG/woB@y[PM<", 0, "_sbG/woB@y[PM<", 0, false);
      try { 
        attributeLayout0.getValue((long) 0, (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: _sbG/woB@y[PM<
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Rarchive_magic_word", 3, "Rarchive_magic_word", 3, true);
      try { 
        attributeLayout0.getValue(67108864L, (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: Rarchive_magic_word
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RSRlYouFgj]2V", 1, "RU", 1, true);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue(1409L, "RU", (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RU", 1, "RSRlYouFgj]2V", 1);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 1, (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("_sbG/woB@y[PM<", 0, "_sbG/woB@y[PM<", 0, false);
      String string0 = attributeLayout0.getName();
      assertEquals("_sbG/woB@y[PM<", string0);
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("(", 0, "c<6O*{8Y,m39'5*<{X", 0, false);
      int int0 = attributeLayout0.getIndex();
      assertEquals(0, int0);
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("(", attributeLayout0.getName());
      assertEquals("c<6O*{8Y,m39'5*<{X", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("wB)", 0, "wB)", 0, false);
      int int0 = attributeLayout0.getContext();
      assertEquals(0, int0);
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("wB)", attributeLayout0.getLayout());
      assertEquals("wB)", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KK1x%c,MsK$", 1, "KK1x%c,MsK$", 1);
      try { 
        attributeLayout0.getValue((long) 1, (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KK1x%c,MsK$
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KK1x%c,MsK$", 1, "KK1x%c,MsK$", 1);
      String string0 = attributeLayout0.getLayout();
      assertEquals("KK1x%c,MsK$", string0);
      assertEquals(1, attributeLayout0.getContext());
      assertEquals("KK1x%c,MsK$", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("_sbG/woB@y[PM<", 0, "_sbG/woB@y[PM<", 0, false);
      String string0 = attributeLayout0.toString();
      assertEquals("Class: _sbG/woB@y[PM<", string0);
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("_sbG/woB@y[PM<", 0, "_sbG/woB@y[PM<", 0, false);
      attributeLayout0.isDefaultLayout();
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("_sbG/woB@y[PM<", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
  }
}

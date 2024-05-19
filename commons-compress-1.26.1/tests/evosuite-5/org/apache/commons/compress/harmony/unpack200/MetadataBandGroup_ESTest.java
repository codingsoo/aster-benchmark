
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
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.MetadataBandGroup;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataBandGroup_ESTest extends MetadataBandGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 115;
      metadataBandGroup0.T = intArray0;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[4];
      String[] stringArray0 = new String[6];
      metadataBandGroup0.caseet_RS = stringArray0;
      intArray0[1] = 101;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[4];
      String[] stringArray0 = new String[6];
      metadataBandGroup0.caseec_RU = stringArray0;
      intArray0[1] = 101;
      metadataBandGroup0.caseet_RS = stringArray0;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 112;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[4];
      intArray0[1] = 110;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 108;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 106;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      metadataBandGroup0.T = metadataBandGroup0.param_NB;
      int[] intArray0 = new int[3];
      intArray0[1] = 105;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 104;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[22];
      intArray0[0] = 103;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 102;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[1] = 99;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[1] = 98;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[1] = 97;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[0] = 96;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 95;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 94;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[4];
      intArray0[0] = 93;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[0] = 92;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[4];
      intArray0[0] = 90;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[7];
      intArray0[1] = 87;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(7, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[0] = 86;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 85;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[0] = 84;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 83;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 82;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 81;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 80;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 77;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 74;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 72;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 71;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 70;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 68;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[1] = 67;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      intArray0[0] = 66;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVPA", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.name_RU = metadataBandGroup0.nestname_RU;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.name_RU = cPUTF8Array0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      metadataBandGroup0.name_RU = cPUTF8Array0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[3];
      metadataBandGroup0.T = intArray0;
      metadataBandGroup0.getAttributes();
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MetadataBandGroup.setRiaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MetadataBandGroup.setRvaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("D~%{.G7_1?", (CpBands) null);
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MetadataBandGroup.setRipaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("AD");
      MetadataBandGroup.setRvpaAttributeName(cPUTF8_0);
      assertEquals((byte)1, cPUTF8_0.getTag());
  }
}

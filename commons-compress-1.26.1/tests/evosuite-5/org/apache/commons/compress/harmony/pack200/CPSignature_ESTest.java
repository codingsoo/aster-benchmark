
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPSignature_ESTest extends CPSignature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("/", cPUTF8_0, linkedList0);
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList1.push(cPClass0);
      CPSignature cPSignature1 = new CPSignature("+", cPUTF8_0, linkedList1);
      CPClass cPClass1 = new CPClass(cPUTF8_0);
      linkedList0.add(cPClass1);
      int int0 = cPSignature1.compareTo(cPSignature0);
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("/", cPUTF8_0, linkedList0);
      CPSignature cPSignature1 = new CPSignature("+", cPUTF8_0, linkedList0);
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList0.add(cPClass0);
      linkedList0.add(cPClass0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("/", cPUTF8_0, linkedList0);
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature1 = new CPSignature("+", cPUTF8_0, linkedList1);
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList1.add(cPClass0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("'");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      String string0 = cPSignature0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("'");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      String string0 = cPSignature0.getUnderlyingString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.getUnderlyingString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("0q;231mb~Ng3u]c-S~Q");
      cPUTF8_0.setIndex(0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("0q;231mb~Ng3u]c-S~Q", cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertEquals("0q;231mb~Ng3u]c-S~Q", cPUTF8_1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("'");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      cPUTF8_0.setIndex(1535);
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertEquals("'", cPUTF8_1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("0q;231mb~Ng3u]c-S~Q");
      cPUTF8_0.setIndex(0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("0q;231mb~Ng3u]c-S~Q", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("'");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      cPUTF8_0.setIndex(1535);
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals(1535, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!0 p[+gORWt>\fdzY");
      CPSignature cPSignature0 = new CPSignature("@kf_sQ.~F7pS>o", cPUTF8_0, (List<CPClass>) null);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("'");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList0.add(cPClass0);
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertTrue(list0.contains(cPClass0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!0 p[+gORWt>\fdzY");
      CPSignature cPSignature0 = new CPSignature("@kf_sQ.~F7pS>o", cPUTF8_0, (List<CPClass>) null);
      // Undeclared exception!
      try { 
        cPSignature0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("/", cPUTF8_0, linkedList0);
      // Undeclared exception!
      try { 
        cPSignature0.compareTo(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedList cannot be cast to org.apache.commons.compress.harmony.pack200.CPSignature
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = null;
      try {
        cPSignature0 = new CPSignature("I soQO?;9zNjqB?lp", (CPUTF8) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPSignature cPSignature0 = new CPSignature("(", cPUTF8_0, linkedList0);
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature1 = new CPSignature("+", cPUTF8_0, linkedList1);
      linkedList0.add(cPClass0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("g_)");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_1 = new CPUTF8("8");
      CPSignature cPSignature0 = new CPSignature("8", cPUTF8_1, linkedList0);
      CPSignature cPSignature1 = new CPSignature("g_)", cPUTF8_0, linkedList0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      //  // Unstable assertion: assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7VHmv~ozCS*=n808!N");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_1 = new CPUTF8("qu{");
      CPSignature cPSignature0 = new CPSignature("qu{", cPUTF8_1, linkedList0);
      CPSignature cPSignature1 = new CPSignature("7VHmv~ozCS*=n808!N", cPUTF8_0, linkedList0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      //  // Unstable assertion: assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(", cPUTF8_0, linkedList0);
      CPSignature cPSignature1 = new CPSignature("+", cPUTF8_0, linkedList0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@kf_sQ.~F7pS>o");
      CPSignature cPSignature0 = new CPSignature("@kf_sQ.~F7pS>o", cPUTF8_0, (List<CPClass>) null);
      int int0 = cPSignature0.compareTo(cPSignature0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("8", cPUTF8_0, linkedList0);
      CPSignature cPSignature1 = new CPSignature("", cPUTF8_0, linkedList0);
      int int0 = cPSignature1.compareTo(cPSignature0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("g_)");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("8", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.toString();
      assertEquals("8", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.CPConstant");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertSame(cPUTF8_0, cPUTF8_1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@kf_sQ.~F7pS>o");
      CPSignature cPSignature0 = new CPSignature("@kf_sQ.~F7pS>o", cPUTF8_0, (List<CPClass>) null);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("8", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.getUnderlyingString();
      assertEquals("8", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("/", cPUTF8_0, linkedList0);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertTrue(list0.isEmpty());
  }
}

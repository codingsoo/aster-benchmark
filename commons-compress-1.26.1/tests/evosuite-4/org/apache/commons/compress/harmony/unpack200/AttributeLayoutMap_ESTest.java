
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
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap;
import org.apache.commons.compress.harmony.unpack200.NewAttributeBands;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AttributeLayoutMap_ESTest extends AttributeLayoutMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("+}/jt", 0, "+}/jt", 0);
      attributeLayoutMap0.add(attributeLayout0, (NewAttributeBands) null);
      assertEquals(1, AttributeLayout.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("RuntimeVisibleAnnotations", 1);
      assertEquals(1, attributeLayout0.getContext());
      assertEquals(21, attributeLayout0.getIndex());
      assertNotNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("ACC_PUBLIC", 0);
      assertNotNull(attributeLayout0);
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(184, 0);
      assertNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(22, 0);
      assertNotNull(attributeLayout0);
      assertEquals("RuntimeInvisibleAnnotations", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("eAFCr", 0, "eAFCr", 0, false);
      attributeLayoutMap0.add(attributeLayout0);
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout(0, 0);
      assertNotNull(attributeLayout1);
      assertFalse(attributeLayout1.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(2, 3);
      assertNotNull(attributeLayout0);
      assertEquals("LocalVariableTable", attributeLayout0.getName());
      assertEquals("NH[PHOHRUHRSHH]", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.getAttributeLayout("4vG!e\"OwqB$'", (-1741));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.getAttributeLayout(0, 80);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.add((AttributeLayout) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("o9I*wGMORI", 0);
      assertNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      attributeLayoutMap0.checkMap();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.add((AttributeLayout) null, (NewAttributeBands) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      NewAttributeBands newAttributeBands0 = attributeLayoutMap0.getAttributeBands((AttributeLayout) null);
      assertNull(newAttributeBands0);
  }
}

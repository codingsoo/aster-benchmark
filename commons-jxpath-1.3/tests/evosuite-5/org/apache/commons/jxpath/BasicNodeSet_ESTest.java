
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BasicNodeSet_ESTest extends BasicNodeSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("=^'h[i*zpz`?Drn", "*");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getValues();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: =^'h[i*zpz`?Drn:*
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("java.util.ArrayList@0000000003", "org.apache.commons.jxpath.ri.compiler.NodeTest");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getValues();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getNodes();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      // Undeclared exception!
      try { 
        basicNodeSet0.add((NodeSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.BasicNodeSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      List list0 = basicNodeSet0.getPointers();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicNodeSet0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("$Q<h]@%");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getValues();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '$Q<h]@%'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      List list0 = basicNodeSet0.getValues();
      List list1 = basicNodeSet0.getValues();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.add((Pointer) null);
      // Undeclared exception!
      try { 
        basicNodeSet0.getNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.BasicNodeSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.getNodes();
      List list0 = basicNodeSet0.getNodes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("java.util.ArrayList@0000000002");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      basicNodeSet0.remove(variablePointer0);
      assertNull(variablePointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.remove((Pointer) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.add((Pointer) null);
      basicNodeSet0.add((NodeSet) basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.add((NodeSet) basicNodeSet0);
      List list0 = basicNodeSet0.getPointers();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      String string0 = basicNodeSet0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicNodeSet0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("?a`7$cWvB8OGlg");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getNodes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '?a`7$cWvB8OGlg'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}

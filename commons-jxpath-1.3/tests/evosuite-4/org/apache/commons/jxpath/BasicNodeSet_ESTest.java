
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
import org.apache.commons.jxpath.BasicVariables;
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
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getValues();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) basicNodeSet0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("Undefined variable: ", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getValues();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Undefined variable: :'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("4Qu9G>sK2_#\"O_#xd?7");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getNodes();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 4Qu9G>sK2_#\"O_#xd?7
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
      List list1 = basicNodeSet0.getPointers();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.add((Pointer) null);
      // Undeclared exception!
      try { 
        basicNodeSet0.getValues();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.BasicNodeSet", e);
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
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.getPointers();
      basicNodeSet0.add((NodeSet) basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.add((Pointer) null);
      basicNodeSet0.remove((Pointer) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.remove((Pointer) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      basicNodeSet0.add((Pointer) null);
      basicNodeSet0.add((NodeSet) basicNodeSet0);
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" but object was null.  Terminating to avoid stack recursion.");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      // Undeclared exception!
      try { 
        basicNodeSet0.getNodes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ' but object was null.  Terminating to avoid stack recursion.'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}

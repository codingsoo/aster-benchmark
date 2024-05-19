
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NullElementPointer_ESTest extends NullElementPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      NullElementPointer nullElementPointer1 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      nullElementPointer0.getValuePointer();
      assertEquals(0, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("IcYWM{O*feqhZ[i/&L", "*K>s6qmmLuSN`u:x");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
      assertNotSame(nodePointer1, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      String string0 = nullElementPointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("|N?R?", "|N?R?");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 36);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '|N?R?:|N?R?' for path: $|N?R?:|N?R?
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 956);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y8lDZo^Oj", "Y8lDZo^Oj");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Y8lDZo^Oj:Y8lDZo^Oj'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("JOX4ma)$");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-1215));
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, 91);
      // Undeclared exception!
      try { 
        nullElementPointer1.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.ri.model.beans.NullElementPointer into a collection of size 92
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "java.util.concurrent.atomic.AtomicBoolean");
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-95));
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $java.util.concurrent.atomic.AtomicBoolean
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("!s];;#P", "!s];;#P");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      PropertyPointer propertyPointer0 = nullElementPointer0.getPropertyPointer();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) propertyPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("o#\"\"xjVV[cX= 42e_", "o#\"\"xjVV[cX= 42e_");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(";s");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 1500);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$;s[1501]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      nullElementPointer0.getName();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("{}", "{}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-95));
      variablePointer0.setIndex((-220));
      String string0 = nullElementPointer0.asPath();
      assertEquals("${}:{}[-219]/.[-94]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("{}", "{}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-95));
      nullElementPointer0.printPointerChain();
      assertEquals((-95), nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 5);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, 5);
      String string0 = nullElementPointer1.asPath();
      assertEquals("[6]/.[6]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("ugjfK", "ugjfK");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Collection element does not exist: $ugjfK:ugjfK
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 5);
      String string0 = nullElementPointer0.asPath();
      assertEquals("[6]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 5);
      NullElementPointer nullElementPointer1 = (NullElementPointer)nullElementPointer0.clone();
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertTrue(boolean0);
      assertEquals(5, nullElementPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("o#\"\"xjVV[cX= 42e_", "o#\"\"xjVV[cX= 42e_");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      NullElementPointer nullElementPointer1 = new NullElementPointer(variablePointer0, (-1361));
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals((-1361), nullElementPointer1.getIndex());
      assertFalse(boolean0);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("ugjfK", "ugjfK");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals((Object) null);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("ugjfK", "ugjfK");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 91);
      NullElementPointer nullElementPointer1 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(boolean0);
      assertEquals(91, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-95));
      boolean boolean0 = nullElementPointer0.isCollection();
      assertEquals((-95), nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-95));
      nullElementPointer0.hashCode();
      assertEquals((-95), nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 91);
      boolean boolean0 = nullElementPointer0.isLeaf();
      assertEquals(91, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-95));
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'java.util.concurrent.atomic.AtomicBoolean'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y8lDZo^Oj", "Y8lDZo^Oj");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getBaseValue();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(">g>", "java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, ">g>");
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path $>g>:java.util.concurrent.atomic.AtomicBoolean/null[2], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 5);
      int int0 = nullElementPointer0.getLength();
      assertEquals(5, nullElementPointer0.getIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-95));
      boolean boolean0 = nullElementPointer0.isActual();
      assertEquals((-95), nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("ugjfK", "ugjfK");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getImmediateNode();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("ugjfK", "ugjfK");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.isContainer();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }
}

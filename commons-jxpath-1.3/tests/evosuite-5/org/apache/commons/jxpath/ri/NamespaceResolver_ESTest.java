
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespaceResolver_ESTest extends NamespaceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getNamespaceURI("org.apache.commons.jxpath.ri.NamespaceResolver");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      QName qName0 = new QName((String) null, (String) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, namespaceResolver0);
      namespaceResolver0.setNamespaceContextPointer(nodePointer0);
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("Cannot set undefined variable: ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace(";r&\"O~s", "");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertEquals(";r&\"O~s", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "3ZR#/uFM)2");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("3ZR#/uFM)2");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      namespaceResolver0.registerNamespace(":CG", ":CG");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI(":CG");
      assertEquals(":CG", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("}}rf4;H5?", "}}rf4;H5?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.NamespaceResolver");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.NamespaceResolver", locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, namespaceResolver0);
      // Undeclared exception!
      NamespaceResolver.getPrefix(nodePointer1, "org.apache.commons.jxpath.ri.NamespaceResolver");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("y\"UcT?");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Cannot register namespaces on a sealed NamespaceResolver");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      namespaceResolver0.pointer = (NodePointer) variablePointer0;
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Cannot register namespaces on a sealed NamespaceResolver'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      namespaceResolver0.reverseMap = hashMap0;
      hashMap0.put((Object) null, namespaceResolver0.namespaceMap);
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getNamespaceURI("]F*!i~BRvR^_S");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, NamespaceResolver> hashMap0 = new HashMap<Object, NamespaceResolver>();
      namespaceResolver0.namespaceMap = hashMap0;
      hashMap0.put((Object) null, namespaceResolver0);
      // Undeclared exception!
      try { 
        namespaceResolver0.getNamespaceURI((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.NamespaceResolver cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>(3397, 3397);
      namespaceResolver0.reverseMap = hashMap0;
      HashMap<NamespaceResolver, Object> hashMap1 = new HashMap<NamespaceResolver, Object>();
      namespaceResolver0.reverseMap = hashMap1;
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredPrefix("text");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      namespaceResolver0.reverseMap = hashMap0;
      hashMap0.put((Object) null, namespaceResolver0.namespaceMap);
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredPrefix((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      namespaceResolver0.registerNamespace(":CG", ":CG");
      String string0 = namespaceResolver0.getPrefix(":CG");
      assertEquals(":CG", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      variablePointer0.createPath(jXPathContext0, (Object) qName0);
      String string0 = NamespaceResolver.getPrefix((NodePointer) variablePointer0, "<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("#GtH_Ym_Y*Ol");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "#GtH_Ym_Y*Ol");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '#GtH_Ym_Y*Ol'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.seal();
      assertTrue(namespaceResolver1.isSealed());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getPrefix("Cannot convert ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.namespaceMap = namespaceResolver0.reverseMap;
      namespaceResolver1.registerNamespace((String) null, "");
      String string0 = namespaceResolver1.getPrefix((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("]F*!=~BRvR^_S", "]F*!=~BRvR^_S");
      String string0 = namespaceResolver0.getNamespaceURI("]F*!=~BRvR^_S");
      assertEquals("]F*!=~BRvR^_S", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      Pointer pointer0 = namespaceResolver1.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      Pointer pointer0 = namespaceResolver0.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      namespaceResolver0.pointer = (NodePointer) variablePointer0;
      VariablePointer variablePointer1 = (VariablePointer)namespaceResolver0.getNamespaceContextPointer();
      assertTrue(variablePointer1.isContainer());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("!9dhx(|[-}|2QT", "!9dhx(|[-}|2QT");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot register namespaces on a sealed NamespaceResolver
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      namespaceResolver1.pointer = (NodePointer) variablePointer0;
      String string0 = namespaceResolver1.getPrefix("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("3ZR#/uFM)2", "");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("3ZR#/uFM)2");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = (NamespaceResolver)namespaceResolver0.clone();
      assertNotSame(namespaceResolver1, namespaceResolver0);
      assertNotNull(namespaceResolver1);
      assertFalse(namespaceResolver1.isSealed());
  }
}

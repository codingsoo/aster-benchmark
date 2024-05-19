
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
      QName qName0 = new QName("\"O.j=wfd");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      String string0 = namespaceResolver0.getNamespaceURI("Cannot register namespaces on a sealed NamespaceResolver");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("i&o+4*Ko-*=~/", "i&o+4*Ko-*=~/");
      String string0 = namespaceResolver0.getPrefix("i&o+4*Ko-*=~/");
      assertEquals("i&o+4*Ko-*=~/", string0);
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
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("R_", "");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertNotNull(string0);
      assertEquals("R_", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("tV:=x*]mT", "tV:=x*]mT");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("tV:=x*]mT");
      assertEquals("tV:=x*]mT", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace((String) null, (String) null);
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
      QName qName0 = new QName("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, namespaceResolver0, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, namespaceResolver0);
      // Undeclared exception!
      NamespaceResolver.getPrefix(nodePointer1, "IQ;Jnw61");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("Cannot register namespaces on a sealed NamespaceResolver", "^yEKO<4uoZoxxnis*");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "^yEKO<4uoZoxxnis*");
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
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("l\"vTU,L?@4M");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "<<unknown namespace>>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'l\"vTU,L?@4M'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("\"O.j=wfd");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("Cannot register namespaces on a sealed NamespaceResolver");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      namespaceResolver0.pointer = (NodePointer) variablePointer0;
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("Cannot register namespaces on a sealed NamespaceResolver");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getNamespaceURI("&");
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
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver1.getExternallyRegisteredPrefix("C");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredNamespaceURI("");
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
      hashMap0.put((Object) null, namespaceResolver0);
      namespaceResolver0.namespaceMap = hashMap0;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredNamespaceURI((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.NamespaceResolver cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("' for path: ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.seal();
      assertTrue(namespaceResolver1.isSealed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getPrefix("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("h#T:$c\"(G:G2", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      String string0 = namespaceResolver0.getPrefix("2");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "<<unknown namespace>>");
      String string0 = namespaceResolver0.getPrefix("<<unknown namespace>>");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getExternallyRegisteredNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getNamespaceURI((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("i&o4HKo(~/", "i&o4HKo(~/");
      String string0 = namespaceResolver0.getNamespaceURI("i&o4HKo(~/");
      assertEquals("i&o4HKo(~/", string0);
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
      QName qName0 = new QName("h#T:$c\"(G:G2", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      VariablePointer variablePointer1 = (VariablePointer)namespaceResolver0.getNamespaceContextPointer();
      assertNull(variablePointer1.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("", "");
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
      QName qName0 = new QName("h#T:$c\"(G:G2", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      String string0 = NamespaceResolver.getPrefix((NodePointer) variablePointer0, "h#T:$c\"(G:G2");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      NamespaceResolver namespaceResolver1 = (NamespaceResolver)namespaceResolver0.clone();
      assertNotNull(namespaceResolver1);
      assertFalse(namespaceResolver1.isSealed());
      assertNotSame(namespaceResolver1, namespaceResolver0);
  }
}

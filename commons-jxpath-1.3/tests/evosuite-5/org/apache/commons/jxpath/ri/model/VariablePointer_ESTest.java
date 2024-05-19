
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


package org.apache.commons.jxpath.ri.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VariablePointer_ESTest extends VariablePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("JXPath ca only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "Factory could not create object path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      // Undeclared exception!
      try { 
        variablePointer0.compareChildNodePointers(nodePointer0, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(91);
      variablePointer0.hashCode();
      assertEquals(91, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, "tT0");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.findVariables(jXPathContext1);
      assertNotSame(jXPathContext1, jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, 590);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.ri.JXPathContextReferenceImpl into a collection of size 591
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("7yWd#=LUc;-!");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "cbyO|<,:");
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = variablePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("!Zcm,Ge%]^D9");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue(basicVariables0);
      NodePointer nodePointer0 = variablePointer0.namespacePointer("!Zcm,Ge%]^D9");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      NodeIterator nodeIterator0 = variablePointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("Cannot set undefined variable: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isActual();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      QName qName0 = variablePointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      Object object1 = nodePointer0.getImmediateNode();
      assertSame(jXPathContext0, object1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      Object object0 = nodePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("!Zcm,Ge%]^D9");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue(basicVariables0);
      Object object0 = variablePointer0.getBaseValue();
      assertSame(basicVariables0, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(1);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      variablePointer0.createPath(jXPathContext0, (Object) variablePointer0);
      assertEquals(1, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      int int0 = variablePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      QName qName1 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "Cannot set undefined variable: ");
      NodeIterator nodeIterator0 = variablePointer0.childIterator(nodeNameTest0, true, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("name");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("Wm {'z");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.setValue(variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName((String) null, "JXPath iterators cannot remove nodes");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("4@L#92");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("\"h,kjWpeo8)tJ*X");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("hs.Gd'_F=5\"n>|}!");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer1 = new VariablePointer(variables0, qName0);
      variablePointer1.findVariables(jXPathContext0);
      // Undeclared exception!
      try { 
        variablePointer1.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("hs.Gd'_F=5\"n>|}!");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer1 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer1.isLeaf();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'hs.Gd'_F=5\"n>|}!'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "DKrpc<lrQC!Bp.");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :DKrpc<lrQC!Bp.
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("fPR\";17(]Ba");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Cannot set undefined variable: ", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Cannot set undefined variable: :'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("_<j3/sd,OjQt!5s)", "_<j3/sd,OjQt!5s)");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '<'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.JXPathContext:org.apache.commons.jxpath.ri.compiler.NodeNameTest'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, "tT0");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.findVariables(jXPathContext0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "D};UIj?4f\"Rk']");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'D};UIj?4f\"Rk']'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.findVariables(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      Object object0 = variablePointer0.clone();
      // Undeclared exception!
      try { 
        variablePointer0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null, (Object) variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '' for path: $
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("?Dzha", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, (-457));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("UVvBUMUsm", "");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, (-1671));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'UVvBUMUsm:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QName qName0 = new QName("null()");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("", "ewU&RFe\u0006.2:v@C3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(1);
      variablePointer0.asPath();
      assertEquals(1, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(1);
      // Undeclared exception!
      try { 
        variablePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '3~dB.lC9HO'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QName qName0 = new QName("`;`#}|gtHHr7Ir1e<", "Xzh]iY-NO");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.index = 0;
      String string0 = variablePointer0.asPath();
      assertEquals("$`;`#}|gtHHr7Ir1e<:Xzh]iY-NO[1]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      String string0 = variablePointer0.asPath();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QName qName0 = new QName(", properties = ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      String string0 = variablePointer0.asPath();
      assertEquals("$, properties = ", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("V~ruOGp");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null);
      assertSame(variablePointer0, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("Cannot set undefined variable: ", "Cannot set undefined variable: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("]", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.createPath(jXPathContext0, (Object) variablePointer0);
      int int0 = variablePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QName qName0 = new QName("&K3'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("&K3'");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.setIndex(791);
      // Undeclared exception!
      try { 
        variablePointer0.setValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '&K3''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = variablePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      QName qName0 = new QName(", properties = ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: , properties = 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("!Zcm,Ge%]^D9");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '!Zcm,Ge%]^D9'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("+!_DvN]|Yh0Y.z3L+");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      QName qName1 = variablePointer0.getName();
      assertNull(qName1.getPrefix());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(1);
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '3~dB.lC9HO' for path: $3~dB.lC9HO[2]
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "8zX/ejeLoPRuN");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.index = 590;
      // Undeclared exception!
      try { 
        variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates:8zX/ejeLoPRuN[591]
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      QName qName0 = new QName("Undefned v{ariable: ", "Undefned v{ariable: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.clone();
      assertTrue(variablePointer1.equals((Object)variablePointer0));
      
      variablePointer1.index = (-1745);
      boolean boolean0 = variablePointer0.equals(variablePointer1);
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QName qName0 = new QName("Factory cannot define variable '");
      QName qName1 = new QName("Cannot allocate dynamic property handler of class ");
      VariablePointer variablePointer0 = new VariablePointer(qName1);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.equals(variablePointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QName qName0 = new QName("Undefned v{ariable: ", "Undefned v{ariable: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = variablePointer0.clone();
      boolean boolean0 = variablePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      QName qName0 = new QName("Factory cannot define variable '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.equals(variablePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("!Zcm,Ge%]^D9");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.equals(variablePointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, "tT0");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("&K3'");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.setValue(object0);
      variablePointer0.findVariables(jXPathContext0);
      assertTrue(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("&K3'");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.findVariables(jXPathContext0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, 1, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("&K3'");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.setIndex(791);
      // Undeclared exception!
      try { 
        variablePointer0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '&K3''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.remove();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      QName qName0 = new QName("Factory could not create object path: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.remove();
      assertFalse(variablePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, (-3910), (Object) jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue("$");
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 1, (Object) "$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.String into a collection of size 2
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue("");
      NodePointer nodePointer0 = variablePointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
      assertSame(nodePointer0, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      int int0 = variablePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      int int0 = variablePointer0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      QName qName0 = new QName("Undefned v{ariable: ", "Undefned v{ariable: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.setValue(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: Undefned v{ariable: :Undefned v{ariable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(1);
      variablePointer0.getRootNode();
      assertEquals(1, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue("");
      boolean boolean0 = variablePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("3~dB.lC9HO", (Object) null);
      QName qName0 = new QName("3~dB.lC9HO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("&K3'");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.setValue(object0);
      boolean boolean0 = variablePointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue("");
      boolean boolean0 = variablePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      variablePointer0.isLeaf();
      Object object0 = variablePointer0.getNodeValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      QName qName0 = new QName("BeanInfo [class = ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: BeanInfo [class = 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator(qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("vuj6\"&0fa*0~A+MS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeTypeTest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      NodeIterator nodeIterator0 = variablePointer1.childIterator(nodeTypeTest0, true, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Cannot set undefined variable: ");
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, true, (NodePointer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("!Zcm,Ge%]^D9");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(variablePointer0.isActual());
      
      variablePointer0.setValue(basicVariables0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      NodePointer nodePointer0 = variablePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, object0);
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("!Zcm,Ge%]^D9");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '!Zcm,Ge%]^D9'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}

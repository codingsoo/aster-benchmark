
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


package org.apache.commons.jxpath.ri.model.dynamic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPropertyPointer_ESTest extends DynamicPropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("g$F4*o", "g$F4*o");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "g$F4*o", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(2);
      dynamicPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertNull(dynamicPropertyPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("g$F4*o");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "g$F4*o", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(0);
      dynamicPropertyPointer0.setPropertyIndex(0);
      assertFalse(dynamicPropertyPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("[@Wnae='", "[@Wnae='");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("[<:lg]F*Ir@gj>i?s");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("[<:lg]F*Ir@gj>i?s", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      dynamicPropertyPointer0.setPropertyName("");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("g$F4*o");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "g$F4*o", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(0);
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex((-2193));
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals((-2193), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("Q+2cj^`?s[vOigE%-", "Q+2cj^`?s[vOigE%-");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue("Q+2cj^`?s[vOigE%-");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Q+2cj^`?s[vOigE%-:Q+2cj^`?s[vOigE%-
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(mapDynamicPropertyHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("y$8~=i^E 4");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: y$8~=i^E 4
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("XHMp7}zdZ~{.;L%");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'XHMp7}zdZ~{.;L%'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("/.", "[Rivj7(!\"Ih23jP<");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: /.:[Rivj7(!\"Ih23jP<
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("YkITT@<%", "Index is less than 1: ");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("CqWM]{_c*A(W{o$||.e", "mP3q(jf");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: CqWM]{_c*A(W{o$||.e:mP3q(jf
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FTI}]", "|23s|9)");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'FTI}]:|23s|9)'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("+n%n!V{@fL C", "+n%n!V{@fL C");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '+n%n!V{@fL C:+n%n!V{@fL C'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.JXPathContextReferenceImpl cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("Ase", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null, (Object) variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Ase:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) dynamicPropertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Su)'22I!", "Su)'22I!");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Su)'22I!:Su)'22I!'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("[@name='");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dynamicPropertyPointer0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: [@name='
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dynamicPropertyPointer0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, (QName) null, variablePointer0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.VariablePointer cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("u)'2fI!", "u)'27IF");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'u)'2fI!:u)'27IF'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("/.", "gZ!u>f");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "/.", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Factory could not create an object for path: ", "8,)<#G{f\"#~%|e7");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("[name='");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("[<:lg]F*Ir@gj>i?s");
      dynamicPropertyPointer0.setIndex(9);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: [name='
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("/");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, (DynamicPropertyHandler) null);
      dynamicPropertyPointer0.setIndex(3111);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("#4j9~ac+9.;.");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "#4j9~ac+9.;.");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) variablePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dynamicPropertyPointer0);
      QName qName0 = new QName("X#bY15lnO:~ Pu", "Sgi@1rDf&");
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createChild(jXPathContext0, qName0, 0, (Object) mapDynamicPropertyHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("Y9W*hjB.%6D@78^");
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue((Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QName qName0 = new QName("[name='");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: [name='
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QName qName0 = new QName("g$F4*o");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "g$F4*o", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(2);
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QName qName0 = new QName("g$F4*o");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "g$F4*o", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QName qName0 = new QName("[name='");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("[<:lg]F*Ir@gj>i?s");
      String string0 = dynamicPropertyPointer0.asPath();
      assertEquals("$[name='[@name='[<:lg]F*Ir@gj>i?s']", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("g$F4*o");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "g$F4*o", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isActualProperty();
      assertTrue(boolean0);
  }
}

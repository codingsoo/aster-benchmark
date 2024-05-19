
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
      QName qName0 = new QName("comment", "comment");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: comment:comment
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("L0v/di[", "L0v/di[");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'L0v/di[:L0v/di['
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("#L`o[#X", "}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: #L`o[#X:}
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("c7{pwIZh0z?", "{h");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'c7{pwIZh0z?:{h'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName(" /^^NYBtBTrD{\"B");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("^7r+Ew.K_(!ntU.(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ^7r+Ew.K_(!ntU.(
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      QName qName0 = new QName("QUUYt;+:;][p5`", (String) null);
      Locale locale0 = new Locale("QUUYt;+:;][p5`", "QUUYt;+:;][p5`", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
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
  public void test11()  throws Throwable  {
      QName qName0 = new QName("CtfJy4I)z", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: CtfJy4I)z:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.forLanguageTag("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("AZ9p1", "AZ9p1");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("X5.LXE:", "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
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
  public void test17()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
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
      QName qName0 = new QName("CP)X/ND-", "g8$4n){F.7hME9^w");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'CP)X/ND-:g8$4n){F.7hME9^w'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("+");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "+");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("$W`A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: $W`A
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      QName qName0 = new QName("$W`");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dynamicPropertyPointer0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: $W`
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
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
  public void test24()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test26()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("new");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) dynamicPropertyPointer0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'new'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("Factory could not create an object for path: ", "Factory could not create an object for path: ");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.VariablePointer cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertTrue(dynamicPropertyPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("<<unknown namespace>>");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("A:Wl{#XC4#|{");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'A:Wl{#XC4#|{'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName(")h;y$W");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: )h;y$W
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName(" /^^NYBtBTrD{\"B");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, variablePointer0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, (DynamicPropertyHandler) null);
      dynamicPropertyPointer0.setIndex((-1952));
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName(" /O^NYBtBTrD{\"B");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(locale0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("g?", ". It cannot be converted to ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'g?:. It cannot be converted to '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("yXs~mE0h@");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(409);
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals(409, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("new");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "new");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.JXPathContextReferenceImpl cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("W$X/", "W$X/");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("PCeWp7LooW>WX[");
      String string0 = dynamicPropertyPointer0.asPath();
      assertEquals("$W$X/:W$X/.[@name='PCeWp7LooW>WX[']", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      QName qName0 = new QName(")h;y$W");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isActualProperty();
      assertTrue(boolean0);
  }
}

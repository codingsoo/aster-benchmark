
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.functions.MethodFunction;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PackageFunctions_ESTest extends PackageFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, "new");
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "new";
      objectArray0[1] = (Object) set0;
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("new", (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("", (String) null, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("org.apache.commons.jxpath.util.TypeUtils", (String) null);
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction((String) null, "org.apache.commons.jxpath.util.TypeUtils", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function org.apache.commons.jxpath.util.TypeUtils; Class 'org/apache/commons/jxpath/util/TypeUtilsorg/apache/commons/jxpath/util.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("hg1NPh4\"/0u${44Y+.1", "hg1NPh4\"/0u${44Y+.1");
      Object[] objectArray0 = new Object[3];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("hg1NPh4\"/0u${44Y+.1", "Not a collection: ");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, objectArray0[0], locale0);
      basicNodeSet0.add((Pointer) nodePointer0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("hg1NPh4\"/0u${44Y+.1", "Not a collection: ", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function hg1NPh4\"/0u${44Y+.1:Not a collection: ; hg1NPh4\"/0u${44Y+
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[5];
      Function function0 = packageFunctions0.getFunction("", (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("new", "new");
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "new";
      MethodFunction methodFunction0 = (MethodFunction)packageFunctions0.getFunction("new", "substring", objectArray0);
      assertEquals("public java.lang.String java.lang.String.substring(int,int)", methodFunction0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, "new");
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "new";
      Function function0 = packageFunctions0.getFunction("new", (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      Function function0 = packageFunctions0.getFunction("", "", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("new", (String) null);
      Object[] objectArray0 = new Object[4];
      Function function0 = packageFunctions0.getFunction("new", "", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, "new");
      Object[] objectArray0 = new Object[2];
      Function function0 = packageFunctions0.getFunction((String) null, (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) set0;
      Function function0 = packageFunctions0.getFunction("", "", objectArray0);
      assertNull(function0);
  }
}

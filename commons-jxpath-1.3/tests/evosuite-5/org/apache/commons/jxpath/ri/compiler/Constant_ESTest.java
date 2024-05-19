
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


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Constant_ESTest extends Constant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      Object object0 = constant0.computeValue((EvalContext) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant(")a{^4i'AN:qUV");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(")a{^4i'AN:qUV");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      ParentContext parentContext0 = new ParentContext(ancestorContext0, processingInstructionTest0);
      Object object0 = constant0.computeValue(parentContext0);
      assertEquals(")a{^4i'AN:qUV", object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      Object object0 = constant0.compute((EvalContext) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Constant constant0 = new Constant(")a{^4i'AN:qUV");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(")a{^4i'AN:qUV");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      ParentContext parentContext0 = new ParentContext(ancestorContext0, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(parentContext0, processingInstructionTest0, true, true);
      AttributeContext attributeContext0 = new AttributeContext(childContext0, processingInstructionTest0);
      Object object0 = constant0.compute(attributeContext0);
      assertEquals(")a{^4i'AN:qUV", object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer((-1120));
      Constant constant0 = new Constant(integer0);
      String string0 = constant0.toString();
      assertEquals("-1120", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant constant0 = new Constant("");
      String string0 = constant0.toString();
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((-1120));
      Constant constant0 = new Constant(integer0);
      boolean boolean0 = constant0.isContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Constant constant0 = new Constant("");
      boolean boolean0 = constant0.computeContextDependent();
      assertFalse(boolean0);
  }
}


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
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.Parser;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Constant constant0 = (Constant)Parser.parseExpression("'. Invalid symbol '", treeCompiler0);
      assertFalse(constant0.isContextDependent());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      Parser.parseExpression("k(PxlI+G", treeCompiler0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parseExpression((String) null, (Compiler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression("v]z0?*[R`%7", treeCompiler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'v]z0?*[R`%7'. Syntax error after: 'v'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression("q'NSU,%", treeCompiler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'q\\'NSU,%'. Invalid symbol '%' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        Parser.parseExpression("", treeCompiler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Parser parser0 = new Parser();
  }
}

/* Copyright 2012 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */

package com.predic8.schema;

import com.predic8.soamodel.AbstractDiffGenerator;
import com.predic8.soamodel.CreatorContext 
import com.predic8.soamodel.DiffGeneratorContext;
import com.predic8.wstool.creator.*

class All extends ModelGroup {

  //ToDo MinOccurs, MaxOccurs to be implemented!

  def getElementName(){
    // If changed to QName, SchemaDiffGenerator has to be modified.
    'all'
  }

  def create(creator, CreatorContext ctx){
    creator.createAll(this, ctx.clone())
  }

  def compare(AbstractDiffGenerator generator, other, DiffGeneratorContext ctx = new DiffGeneratorContext()){
    generator.compareAll(this, other, ctx)
  }

  String toString(){
    "all[elements=$elements]"
  }
}

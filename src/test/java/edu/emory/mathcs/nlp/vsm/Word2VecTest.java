/**
 * Copyright 2015, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.mathcs.nlp.vsm;

import java.util.Random;

import org.junit.Test;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class Word2VecTest
{
	@Test
	public void test() throws Exception
	{
		Random rand = new Random();
		long st, et, r;
		
		for (int i=0; i<100; i++) rand.nextLong();
		r = rand.nextLong();
		
		st = System.currentTimeMillis();
		for (int i=0; i<10000000; i++) r = nextRandom(r);
		et = System.currentTimeMillis();
		System.out.println(et-st);
	}
	
	long nextRandom(long prev)
	{
		return prev * 25214903917L + 11;
	}
}

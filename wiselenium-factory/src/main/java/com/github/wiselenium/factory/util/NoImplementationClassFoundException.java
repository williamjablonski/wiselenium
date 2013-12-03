/**
 * Copyright (c) 2013 Andre Ricardo Schaffer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.wiselenium.factory.util;

/**
 * Represents an exception thrown when an implementation of a class can't be found.
 * 
 * @author Andre Ricardo Schaffer
 * @since 0.3.0
 */
public class NoImplementationClassFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param clazz The class whose implementation couldn't be found.
	 * @param t The cause of the exception.
	 */
	public NoImplementationClassFoundException(Class<?> clazz, Throwable t) {
		super(String.format("Couldn't find an implementation for the class: %s. For now, it must match the pattern classPackage.{impl}.className{Impl} , but more a sofisticated implementation search is planned for the future."
				, clazz.getName()),
				t);
	}
	
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http:
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jts;



/**
 * <p>Operations on boolean primitives and Boolean objects.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 2.0
 */
public class Envelope {
	
	 /**
	   *  Creates an <code>Envelope</code> for a region defined by maximum and minimum values.
	   *
	   *@param  x1  the first x-value
	   *@param  x2  the second x-value
	   *@param  y1  the first y-value
	   *@param  y2  the second y-value
	   */
	  public Envelope(double x1, double x2, double y1, double y2)
	  {
	    init(x1, x2, y1, y2);
	  }
	  
	  /**
	   *  Initialize an <code>Envelope</code> for a region defined by maximum and minimum values.
	   *
	   *@param  x1  the first x-value
	   *@param  x2  the second x-value
	   *@param  y1  the first y-value
	   *@param  y2  the second y-value
	   */
	  public void init(double x1, double x2, double y1, double y2)
	  {
	    if (x1 < x2) {
	      minx = x1;
	      maxx = x2;
	    }
	    else {
	      minx = x2;
	      maxx = x1;
	    }
	    if (y1 < y2) {
	      miny = y1;
	      maxy = y2;
	    }
	    else {
	      miny = y2;
	      maxy = y1;
	    }
	  }
	
	/**
	   *  the minimum x-coordinate
	   */
	  private double minx;

	  /**
	   *  the maximum x-coordinate
	   */
	  private double maxx;

	  /**
	   *  the minimum y-coordinate
	   */
	  private double miny;

	  /**
	   *  the maximum y-coordinate
	   */
	  private double maxy;
	
	/**
	   * Gets the maximum extent of this envelope across both dimensions.
	   * 
	   * @return the maximum extent of this envelope
	   */
		public double maxExtent()
		{
			
			double old_this_minx = this.minx;
			
			double old_this_maxx = this.maxx;
			
			double old_this_miny = this.miny;
			
			double old_this_maxy = this.maxy;
			
			boolean old_this_isEnvelopeNull = this.isEnvelopeNull();
			
			double old_this_getWidth = this.getWidth();
			
			double old_this_getHeight = this.getHeight();
			double result;
			if (isEnvelopeNull()) {
				result = 0.0;
			} else {
				double w = getWidth();
				double h = getHeight();
				if (w > h) {
					result = 0.0;
				} else {
					result = h;
				}
			}
			
			assert (true);
			return result;
		}
		
		 /**
		   *  Returns <code>true</code> if this <code>Envelope</code> is a "null"
		   *  envelope.
		   *
		   *@return    <code>true</code> if this <code>Envelope</code> is uninitialized
		   *      or is the envelope of the empty geometry.
		   */
		  public boolean isEnvelopeNull() {
		    return maxx < minx;
		  }
		
		/**
		   *  Returns the difference between the maximum and minimum x values.
		   *
		   *@return    max x - min x, or 0 if this is a null <code>Envelope</code>
		   */
		  public double getWidth() {
		    if (isEnvelopeNull()) {
		      return 0;
		    }
		    return maxx - minx;
		  }

		  /**
		   *  Returns the difference between the maximum and minimum y values.
		   *
		   *@return    max y - min y, or 0 if this is a null <code>Envelope</code>
		   */
		  public double getHeight() {
		    if (isEnvelopeNull()) {
		      return 0;
		    }
		    return maxy - miny;
		  }
}

/*
 *  Units of Measurement Demos for Java
 *  Copyright (c) 2005-2018, Jean-Marie Dautelle, Werner Keil and others.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-385, Unit-API nor the names of their contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tech.uom.demo.systems.common;

import javax.measure.Quantity;
import javax.measure.quantity.*;
import tech.units.indriya.quantity.Quantities;

import static si.uom.SI.*;
import static systems.uom.common.USCustomary.METER;
import static systems.uom.common.USCustomary.MILE;
import static javax.measure.MetricPrefix.*;

public class UoMDemo {
  public static void main(String[] args) {
    // Conversion between units.
    System.out.println(KILO(METER).getConverterTo(MILE).convert(10.0));
    // Retrieval of the system unit (identifies the measurement type).
    System.out.println(REVOLUTION.divide(MINUTE).getSystemUnit());
    // Dimension checking (allows/disallows conversions)
    System.out.println(ELECTRON_VOLT.isCompatible(WATT.multiply(HOUR)));
    // Retrieval of the unit dimension (depends upon the current model).
    System.out.println(ELECTRON_VOLT.getDimension());
    
    Quantity<Length> m = Quantities.getQuantity(10, MILE);
    System.out.println(m);
  }
}

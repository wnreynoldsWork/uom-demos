/*
 *  Units of Measurement Console Demos
 *  Copyright (c) 2005-2019, Werner Keil and others.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-385, Units of Measurement nor the names of their contributors may be used to endorse or promote products derived from this software without specific prior written permission.
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
package tech.uom.demo.format;


import javax.measure.BinaryPrefix;
import javax.measure.quantity.Dimensionless;

import tech.units.indriya.format.SimpleUnitFormat;
import tech.units.indriya.function.MultiplyConverter;
import tech.units.indriya.quantity.*;
import tech.units.indriya.unit.BaseUnit;
import tech.units.indriya.unit.TransformedUnit;

public class SimpleUnitFormatDemo {
    public static void main(String[] args) {
        final var demo = new SimpleUnitFormatDemo();
        demo.addKibiByte();
    }
    
    private void addKibiByte() {
        var bit = new BaseUnit<Dimensionless>("bit", QuantityDimension.NONE);
        var byteV = new TransformedUnit<Dimensionless>("byte", bit, MultiplyConverter.ofRational(8, 1));
        var kibiByte = BinaryPrefix.KIBI(byteV);
        System.out.println(kibiByte);
        SimpleUnitFormat.getInstance().label(kibiByte, kibiByte.toString());
    }
}

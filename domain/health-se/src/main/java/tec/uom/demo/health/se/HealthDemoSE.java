/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright 2013-2015, Jean-Marie Dautelle, Werner Keil, V2COM and individual
 *  contributors by the @author tag.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package tec.uom.demo.health.se;

import static tec.uom.domain.health.se.Health.BPM;

import java.math.BigDecimal;

import tec.uom.domain.health.HeartRate;
import tec.uom.se.internal.quantity.OldProxyQuantityFactory;

/**
 * @version 0.4
 * @author Werner Keil
 *
 */
public class HealthDemoSE {

	public static void main(String[] args) {
//		HeartRate rate =  HeartRateAmount.of(BigDecimal.valueOf(90), BPM);
		OldProxyQuantityFactory<HeartRate> rateFactory = OldProxyQuantityFactory.getInstance(HeartRate.class);
		HeartRate rate = rateFactory.create(BigDecimal.valueOf(90), BPM);
		System.out.println(rate);
	}

}

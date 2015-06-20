/*
   Copyright 2008-2013 CNR-ISTI, http://isti.cnr.it
   Institute of Information Science and Technologies 
   of the Italian National Research Council 


   See the NOTICE file distributed with this work for additional 
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.bubblecloud.zigbee.api.device.hvac;

import org.bubblecloud.zigbee.api.ZigBeeApiConstants;
import org.bubblecloud.zigbee.api.Device;
import org.bubblecloud.zigbee.api.cluster.general.Thermostat;
import org.bubblecloud.zigbee.api.cluster.measureament_sensing.TemperatureMeasurement;
import org.bubblecloud.zigbee.util.ArraysUtil;

/**
 * This class represent the <b>Thermostat</b> Cluster as defined by the document:<br>
 * <i>ZigBee Cluster Library</i> public release version 075123r01ZB
 *
 * @author <a href="mailto:stefano.lenzi@isti.cnr.it">Stefano "Kismet" Lenzi</a>
 * @author <a href="mailto:francesco.furfari@isti.cnr.it">Francesco Furfari</a>
 * @author <a href="mailto:ryan@presslab.us">Ryan Press</a>
 * @version $LastChangedRevision: 799 $ ($LastChangedDate: 2015-02-26 19:00:05 +0300 (Thu, 26 Feb 2015) $)
 * @since 0.6.0
 */
public interface ThermostatControl extends Device {

    public static final int DEVICE_ID = 0x0301;
    public static final String NAME = "Thermostat";

    public static final int[] MANDATORY = ArraysUtil.append(Device.MANDATORY, new int[]{
            ZigBeeApiConstants.CLUSTER_ID_THERMOSTAT
    });

    public static final int[] OPTIONAL = ArraysUtil.append(Device.OPTIONAL, new int[]{
    		ZigBeeApiConstants.CLUSTER_ID_SCENES,
    		ZigBeeApiConstants.CLUSTER_ID_GROUPS,
    		ZigBeeApiConstants.CLUSTER_ID_THERMOSTAT_USER_INTERFACE_CONFIGURATION,
    		ZigBeeApiConstants.CLUSTER_ID_FAN_CONTROL,
    		ZigBeeApiConstants.CLUSTER_ID_TEMPERATURE_MEASUREMENT,
    		ZigBeeApiConstants.CLUSTER_ID_OCCUPANCY_SENSING,
    		ZigBeeApiConstants.CLUSTER_ID_RELATIVE_HUMIDITY_MEASUREMENT
    });

    public static final int[] STANDARD = ArraysUtil.append(MANDATORY, OPTIONAL);
    public static final int[] CUSTOM = {};

    /**
     * Access method for the <b>Mandatory</b> cluster: {@link Thermostat}
     *
     * @return the {@link Thermostat} cluster object
     */
    public Thermostat getThermostat();

}
